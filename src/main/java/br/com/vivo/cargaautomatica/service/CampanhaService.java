/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.sql.Timestamp;
import java.util.regex.Pattern;

/**
 *
 * @author tadorno
 */
public abstract class CampanhaService {
    
    public abstract void realizarCarga();
    
    public void makeFileLog(String filepathOrigem, String fileName, String stringLog, String sbLineErros , int contatosDisponibilizados, int contadosCarregados) throws IOException{
        File fileLog;

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String fn = fileName.split(Pattern.quote("."))[0];
        
        fileLog = new File(filepathOrigem + fn + "_" + timestamp.getTime() + ".log"); 
 
        FileWriter writerLog = new FileWriter(fileLog, true);
        //Iniciando informações do log
        InetAddress.getLocalHost().getHostName();
        writerLog.write("Using machine='" + InetAddress.getLocalHost().getHostName() + "'" + System.lineSeparator());
        writerLog.write("Using Campaign='" + fn + "'" + System.lineSeparator());
        writerLog.write("Using file='" + filepathOrigem + fn + "'" + System.lineSeparator());
        
        writerLog.write(System.lineSeparator());
        writerLog.write("Total number of contacts: " + contatosDisponibilizados + System.lineSeparator());
        writerLog.write(System.lineSeparator());
        writerLog.write(stringLog);
        writerLog.write(System.lineSeparator());
        if(contatosDisponibilizados > contadosCarregados){
            writerLog.write("Job ended with errors");
            this.makeFileBad(
                filepathOrigem,
                fileName,
                sbLineErros);
        }
        
        writerLog.close();
    }
    
    public void makeFileBad(String filepathOrigem, String fileName, String stringBad) throws IOException{
        File fileLog;

        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String fn = fileName.split(Pattern.quote("."))[0];
        
        fileLog = new File(filepathOrigem + fn + "_" + timestamp.getTime() + ".bad"); 
 
        FileWriter writer = new FileWriter(fileLog, true);
        writer.write(stringBad);
        writer.close();
    }
}
