/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.service;

import br.com.vivo.cargaautomatica.dao.CampanhaRetencao8Dao;
import br.com.vivo.cargaautomatica.dao.factory.ConnectionFactory;
import br.com.vivo.cargaautomatica.model.CampanhaRetencaoWinback;
import br.com.vivo.cargaautomatica.model.enums.DataBaseEnum;
import br.com.vivo.cargaautomatica.util.FileUtil;
import br.com.vivo.cargaautomatica.util.PropertySingleton;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tadorno
 */
public class CampanhaRetencao8Service extends CampanhaService{

    @Override
    public void realizarCarga() {
        Logger.getLogger(CampanhaRetencao8Service.class.getName()).log(Level.INFO, "Iniciando carga de campanha.");

        File file;
        try {
            file = FileUtil.copyFile(
                    PropertySingleton.getProperty("file-crm_ret_8-origem-path"),
                    PropertySingleton.getProperty("file-crm_ret_8-local-path"),
                    PropertySingleton.getProperty("file-crm_ret_8-name")
            );
            
            Scanner sc = new Scanner(file);
            
            Integer contatosDisponibilizados = 0;
            Integer contadosCarregados = 0;
            
            Logger.getLogger(CampanhaRetencao8Service.class.getName()).log(Level.INFO, "Iniciando leitura do arquivo de carga para a persistência");

            Connection con = ConnectionFactory.getConnection(DataBaseEnum.GEN_OCS);
            
            StringBuilder sbLog = new StringBuilder();
            StringBuilder sbLineErros = new StringBuilder();
            while (sc.hasNextLine()) {
                contatosDisponibilizados++;
                
                Logger.getLogger(CampanhaRetencao8Service.class.getName()).log(Level.INFO, "Processando Linha {0}", new Object[]{contatosDisponibilizados});
                String line = sc.nextLine();
                CampanhaRetencaoWinback campanha = (CampanhaRetencaoWinback) FileUtil.lineToObject(line, CampanhaRetencaoWinback.class);
                
                try{
                    CampanhaRetencao8Dao.insert(campanha, con);
                    contadosCarregados++;
                    sbLog.append("Linha ")
                            .append(contatosDisponibilizados)
                            .append(": OK")
                            .append(System.lineSeparator());
                } catch (SQLException ex) {
                    sbLog.append("Linha ")
                            .append(contatosDisponibilizados)
                            .append(": FALHA - ")
                            .append(ex.getMessage())
                            .append(System.lineSeparator());
                    sbLineErros.append(line)
                            .append(System.lineSeparator());
                    Logger.getLogger(CampanhaRetencao8Service.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            this.makeFileLog(
                    PropertySingleton.getProperty("file-crm_ret_8-origem-path"),
                    PropertySingleton.getProperty("file-crm_ret_8-name"),
                    sbLog.toString(), 
                    sbLineErros.toString(), 
                    contatosDisponibilizados,
                    contadosCarregados);

            con.close();
            sc.close();
            file.delete();
            Logger.getLogger(CampanhaRetencao8Service.class.getName()).log(Level.INFO, "Carga finalizada. Total informado: {0} - Total com sucesso: {1}", new Object[]{contatosDisponibilizados, contadosCarregados});

        } catch (IOException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CampanhaRetencao8Service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
