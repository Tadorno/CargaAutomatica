/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tadorno
 */
public class PropertySingleton {
    
    private PropertySingleton(){}
    
    private static final Properties PROPS = new Properties();
    
    public static String getProperty(String keyProps){
        if(PROPS.isEmpty()){
            String appConfigPath =  "application.properties";
            
            try {
                PROPS.load(new FileInputStream(appConfigPath));
            } catch (FileNotFoundException ex) {
                Logger.getLogger(PropertySingleton.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PropertySingleton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(PROPS.containsKey(keyProps)){
            return PROPS.getProperty(keyProps);
        }else{
            throw new IllegalArgumentException("Propriedade inexistente");
        }
    }
}
