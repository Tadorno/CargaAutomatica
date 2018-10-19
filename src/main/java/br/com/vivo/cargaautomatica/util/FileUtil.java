/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.util;

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
 */
public class FileUtil {
    
    private static final Gson gson = new Gson();
    
    /**
     * Copia um arquivo de uma pasta origem para uma pasta destino
     * 
     * @param filepathOrigem
     * @param filepathLocal
     * @param fileName
     * @return
     * @throws IOException 
     */
    public static File copyFile(String filepathOrigem, String filepathLocal, String fileName) throws IOException{
        Logger.getLogger(FileUtil.class.getName()).log(Level.INFO, "Copiando arquivo de carga da pasta de origem para uma pasta local.");
        
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
     * Gera um objetoa partir de uma string
     * @param line
     * @param clazz
     * @return 
     */
    public static Object lineToObject(String line, Class clazz) {
        Map<String, String> argumentMap = new HashMap<>();
        String[] splitedLine = line.split(Pattern.quote("|"));

        for(String field : splitedLine) {
            String[] splitedField = field.split(Pattern.quote("="));
            if(splitedField.length == 2) {
                    argumentMap.put(splitedField[0], splitedField[1]);
            } 
        }
        
        String json = gson.toJson(argumentMap);

        return gson.fromJson(json, clazz);
    }
}
