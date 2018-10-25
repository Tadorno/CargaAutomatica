/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.service;

import br.com.vivo.cargaautomatica.dao.CampanhaTelevendasDao;
import br.com.vivo.cargaautomatica.dao.factory.ConnectionFactory;
import br.com.vivo.cargaautomatica.model.CampanhaTelevendas;
import br.com.vivo.cargaautomatica.model.enums.DataBaseEnum;
import br.com.vivo.cargaautomatica.util.FileUtil;
import br.com.vivo.cargaautomatica.util.PropertySingleton;
import br.com.vivo.cargaautomatica.util.SendEmailUtil;
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
public class CampanhaTelevendasService extends CampanhaService{
     
    @Override
    public void realizarCarga() {
        
        Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Iniciando carga de campanha Televendas.");

        File file;
        try {
          
            file = FileUtil.copyFile(
                    PropertySingleton.getProperty("file-ativo_3-origem-path"),
                    PropertySingleton.getProperty("file-ativo_3-local-path"),
                    PropertySingleton.getProperty("file-ativo_3-name")
            );
            
            Scanner sc = new Scanner(file);
            
            Integer contatosDisponibilizados = 0;
            Integer contadosCarregados = 0;
            
            Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Iniciando leitura do arquivo de carga para a persistência");

            Connection con = ConnectionFactory.getConnection(DataBaseEnum.GEN_OCS);
            
            StringBuilder sbLog = new StringBuilder();
            StringBuilder sbLineErros = new StringBuilder();
            while (sc.hasNextLine()) {
                contatosDisponibilizados++;
                
                Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Processando Linha {0}", new Object[]{contatosDisponibilizados});
                String line = sc.nextLine();
                CampanhaTelevendas campanha = (CampanhaTelevendas) FileUtil.lineToObject(line, CampanhaTelevendas.class);
                             
                try{
                    CampanhaTelevendasDao.insert(campanha, con);
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
                    Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            this.makeFileLog(
                    PropertySingleton.getProperty("file-ativo_3-origem-path"),
                    PropertySingleton.getProperty("file-ativo_3-name"),
                    sbLog.toString(), 
                    sbLineErros.toString(), 
                    contatosDisponibilizados,
                    contadosCarregados);
            
            //this.enviarEmail(contatosDisponibilizados, contadosCarregados);

            con.close();
            sc.close();
            file.delete();
            
            Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Carga finalizada. Total informado: {0} - Total com sucesso: {1}", new Object[]{contatosDisponibilizados, contadosCarregados});

        } catch (IOException | SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * Monta e envia o email com informações da carga
     * 
     * @param contatosDisponibilizados
     * @param contadosCarregados 
     */
    private void enviarEmail(Integer contatosDisponibilizados, Integer contadosCarregados){
        Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Iniciando envio de email informativo.");

        String subject = "Notificação de carga de contatos no Altitude - Campanha ATIVO_3";
                 
        String html = "<h1>This is actual message embedded in HTML tags</h1>";
        
        SendEmailUtil.enviar(subject, html);
    }
 
}
