/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.dao;

import br.com.vivo.cargaautomatica.model.CampanhaTelevendas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author tadorno
 */
public class CampanhaTelevendasDao {
    
    public static void insert(CampanhaTelevendas campanha, Connection con) throws SQLException, ClassNotFoundException{
        
        StringBuilder query = new StringBuilder();
        
        query.append("INSERT INTO TA_BCA_MKT (")
                .append("RECORD_ID")
                .append(", CONTACT_INFO")
                .append(", CONTACT_INFO_TYPE")
                .append(", RECORD_TYPE")
                .append(", RECORD_STATUS")
                .append(", ATTEMPT")
                .append(", DAILY_FROM")
                .append(", DAILY_TILL")
                .append(", TZ_DBID")
                .append(", CHAIN_ID")
                .append(", CHAIN_N")
                .append(", DOCUMENTO")
                .append(", NOME")
                .append(", CIDADE")
                .append(", UF")
                .append(", OFERTA_DIRECIONADA")
                .append(", MEDIA_REC_GASTO")
                .append(", MEDIA_SMS")
                .append(", MEDIA_MB")
                .append(", PACOTE_DE_INTERNET")
                .append(", DATA_VENC")
                .append(", CONVERGENTE_GVT")
                .append(", VIVO_FIXO")
                .append(", OBSERVACAO")
                .append(", FONE1")
                .append(") VALUES ")
                .append(" (")
                .append(" (SELECT (NVL(MAX(RECORD_ID), 0) + 1) AS NEW_RECORD_ID FROM TA_BCA_MKT)")
                .append(", ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        PreparedStatement stmt = con.prepareStatement(query.toString());
        
        stmt.setObject(1, campanha.getContactInfo());
        stmt.setObject(2, campanha.getContactInfoType());
        stmt.setObject(3, campanha.getRecordType());
        stmt.setObject(4, campanha.getRecordStatus());
        stmt.setObject(5, campanha.getAttempt());
        stmt.setObject(6, campanha.getDailyFrom());
        stmt.setObject(7, campanha.getDailyTill());
        stmt.setObject(8, campanha.getTzDbid());
        stmt.setObject(9, campanha.getChainId());
        stmt.setObject(10, campanha.getChainN());
        stmt.setObject(11, campanha.getDocumento());
        stmt.setObject(12, campanha.getNome());
        stmt.setObject(13, campanha.getCidade());
        stmt.setObject(14, campanha.getUf());
        stmt.setObject(15, campanha.getOfertaDirecionada());
        stmt.setObject(16, campanha.getMediaRecGasto());
        stmt.setObject(17, campanha.getMediaSms());
        stmt.setObject(18, campanha.getMediaMb());
        stmt.setObject(19, campanha.getPacoteDeInternet());
        stmt.setObject(20, campanha.getDataVenc());
        stmt.setObject(21, campanha.getConvergenteGvt());
        stmt.setObject(22, campanha.getVivoFixo());
        stmt.setObject(23, campanha.getObservacao());
        stmt.setObject(24, campanha.getFone1());
        
        stmt.executeUpdate();
    }
    
}
