/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.util;

import java.util.regex.Pattern;

/**
 *
 * @author tadorno
 */
public class DateUtil {
    
    private DateUtil(){}
    
    public static Integer timeToSeconds(String time){
        Integer value = null;
        if(time != null){
            String[] valueSplited = time.split(Pattern.quote(" "));
            
            value = hourToSeconds(valueSplited[0]); 
            
            if(valueSplited[1].equals("PM")){
                value += 12 * 60 * 60;
            }
        }
        return value;
    }
    
    public static Integer hourToSeconds(String hour){
        if(hour != null){
            String[] timeSplited = hour.split(Pattern.quote(":"));
            
            Integer value = 0;
            //Adiciona os segundos
            value = Integer.parseInt(timeSplited[2]);
            
            //Converte os minutos em segundos e adiciona
            value += Integer.parseInt(timeSplited[1]) * 60;
            
            //Converte as horas em segundos e adiciona
            value += Integer.parseInt(timeSplited[0]) * 60 * 60;
            
            return value;
        }else{
            throw new IllegalArgumentException("campo hour = null");
        }
    }
}
