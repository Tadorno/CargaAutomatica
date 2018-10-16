/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.service;

import br.com.vivo.cargaautomatica.dao.CampanhaTelevendasDao;
import br.com.vivo.cargaautomatica.model.CampanhaTelevendas;
import br.com.vivo.cargaautomatica.util.ConnectionUtil;
import br.com.vivo.cargaautomatica.util.PropertySingleton;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author tadorno
 */
public class CampanhaTelevendasService {
    
    private final Gson gson = new Gson();
    
    public void realizarCarga() {
        
        Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Iniciando carga de campanha Televendas.");

        File file;
        try {
            file = this.copyFile();
            
            Scanner sc = new Scanner(file);
            
            Integer contatosDisponibilizados = 0;
            Integer contadosCarregados = 0;
            
            Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Iniciando leitura do arquivo de carga para a persistência");

            while (sc.hasNextLine()) {
                contatosDisponibilizados++;
                
                Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Processando Linha {0}", new Object[]{contatosDisponibilizados});
                CampanhaTelevendas campanha = lineToObject(sc.nextLine());
                
                try{
                    CampanhaTelevendasDao.insert(campanha);
                    contadosCarregados++;
                } catch (SQLException ex) {
                    Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
            
            this.enviarEmail(contatosDisponibilizados, contadosCarregados);

            ConnectionUtil.close();
            sc.close();
            file.delete();
            Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Carga finalizada. Total informado: {0} - Total com sucesso: {1}", new Object[]{contatosDisponibilizados, contadosCarregados});

        } catch (IOException | SQLException ex) {
            Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * Copia o arquivo da pasta de origem para a pasta local
     */
    private File copyFile() throws IOException{
        Logger.getLogger(CampanhaTelevendasService.class.getName()).log(Level.INFO, "Copiando arquivo de carga da pasta de origem para uma pasta local.");

        String filepathOrigem = PropertySingleton.getProperty("file-origem-path");
        String filepathLocal = PropertySingleton.getProperty("file-local-path");
        String fileName = PropertySingleton.getProperty("file-name");
        
        File source = new File(filepathOrigem + fileName);
        File dest = new File(filepathLocal + fileName);
        try {
            FileUtils.copyFile(source, dest);
            return dest;
        } catch (IOException e) {
            throw e;
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
        
        //SendEmailUtil.enviar(subject, html);
    }
    
    /**
     * Converte uma linha do arquivo de importação em um objeto 
     * CampanhaTelevendas
     * 
     * @param line
     * @return 
     */
    private CampanhaTelevendas lineToObject(String line) {
        Map<String, String> argumentMap = new HashMap<>();
        String[] splitedLine = line.split(Pattern.quote("|"));

        for(String field : splitedLine) {
            String[] splitedField = field.split(Pattern.quote("="));
            if(splitedField.length == 2) {
                    argumentMap.put(splitedField[0], splitedField[1]);
            } 
        }
        
        String json = gson.toJson(argumentMap);

        return gson.fromJson(json, CampanhaTelevendas.class);
    }
    
}
