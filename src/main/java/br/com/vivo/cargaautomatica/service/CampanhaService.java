/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.service;

import br.com.vivo.cargaautomatica.util.PropertySingleton;
import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author tadorno
 * @param <T>
 */
public abstract class CampanhaService<T> {
    
    private final Gson gson = new Gson();
    
    /**
     * Realiza a carga no banco de dados
     */
    public abstract void realizarCarga();
    
    /**
     * Caminho de origem do arquivo
     * @return 
     */
    public abstract String getPathOrigem();
    
    /**
     * Caminho de destino do arquivo
     * @return 
     */
    public abstract String getPathDestino();
    
    /**
     * Nome do arquivo
     * @return 
     */
    public abstract String getFileName();
    
    /**
     * Modelo de campanha que este Service trabalha
     * @return 
     */
    public abstract Class getModelClass();
    
    /**
     * Copia o arquivo da pasta de origem para a pasta local
     * @return 
     * @throws java.io.IOException
     */
    protected File copyFile() throws IOException{
        Logger.getLogger(this.getClass().getName()).log(Level.INFO, "Copiando arquivo de carga da pasta de origem para uma pasta local.");

        String filepathOrigem = PropertySingleton.getProperty(this.getPathOrigem());
        String filepathLocal = PropertySingleton.getProperty(this.getPathDestino());
        String fileName = PropertySingleton.getProperty(this.getFileName());
        
        File source = new File(filepathOrigem + fileName);
        File dest = new File(filepathLocal + fileName);
        try {
            FileUtils.copyFile(source, dest);
            return dest;
        } catch (IOException e) {
            throw e;
        }
    }
    
    public T lineToObject(String line) {
        Map<String, String> argumentMap = new HashMap<>();
        String[] splitedLine = line.split(Pattern.quote("|"));

        for(String field : splitedLine) {
            String[] splitedField = field.split(Pattern.quote("="));
            if(splitedField.length == 2) {
                    argumentMap.put(splitedField[0], splitedField[1]);
            } 
        }
        
        String json = gson.toJson(argumentMap);

        return (T) gson.fromJson(json, getModelClass());
    }
}
