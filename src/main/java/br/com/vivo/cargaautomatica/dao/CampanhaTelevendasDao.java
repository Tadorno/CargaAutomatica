/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.dao;

import br.com.vivo.cargaautomatica.model.CampanhaTelevendas;
import br.com.vivo.cargaautomatica.util.ConnectionUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author tadorno
 */
public class CampanhaTelevendasDao {
    
    public static void insert(CampanhaTelevendas campanha) throws SQLException{
        Connection con = ConnectionUtil.getConnection();
        
        StringBuilder query = new StringBuilder();
        
        query.append("INSERT INTO TA_BCA_MKT (")
                .append("RECORD_ID")
                .append(", CONTACT_INFO")
                .append(", CONTACT_INFO_TYPE")
                .append(", RECORD_TYPE")
                .append(", RECORD_STATUS")
                .append(", CALL_RESULT")
                .append(", ATTEMPT")
                .append(", DIAL_SCHED_TIME")
                .append(", CALL_TIME")
                .append(", DAILY_FROM")
                .append(", DAILY_TILL")
                .append(", TZ_DBID")
                .append(", CAMPAIGN_ID")
                .append(", AGENT_ID")
                .append(", CHAIN_ID")
                .append(", CHAIN_N")
                .append(", GROUP_ID")
                .append(", APP_ID")
                .append(", TREATMENTS")
                .append(", MEDIA_REF")
                .append(", EMAIL_SUBJECT")
                .append(", EMAIL_TEMPLATE_ID")
                .append(", SWITCH_ID")
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
                .append(" (SELECT (NVL(MAX(RECORD_ID), 0) + 1) AS NEW_RECORD_ID  FROM TA_BCA_MKT)")
                .append(", ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        PreparedStatement stmt = con.prepareStatement(query.toString());
        
        stmt.setObject(1, campanha.getContactInfo());
        stmt.setObject(2, campanha.getContactInfoType());
        stmt.setObject(3, campanha.getRecordType());
        stmt.setObject(4, campanha.getRecordStatus());
        stmt.setObject(5, campanha.getCallResult());
        stmt.setObject(6, campanha.getAttempt());
        stmt.setObject(7, campanha.getDialSchedTime());
        stmt.setObject(8, campanha.getCallTime());
        stmt.setObject(9, campanha.getDailyFrom());
        stmt.setObject(10, campanha.getDailyTill());
        stmt.setObject(11, campanha.getTzDbid());
        stmt.setObject(12, campanha.getCampaignId());
        stmt.setObject(13, campanha.getAgentId());
        stmt.setObject(14, campanha.getChainId());
        stmt.setObject(15, campanha.getChainN());
        stmt.setObject(16, campanha.getGroupId());
        stmt.setObject(17, campanha.getAppId());
        stmt.setObject(18, campanha.getTreatments());
        stmt.setObject(19, campanha.getMediaRef());
        stmt.setObject(20, campanha.getEmailSubject());
        stmt.setObject(21, campanha.getEmailTemplateId());
        stmt.setObject(22, campanha.getSwitchId());
        stmt.setObject(23, campanha.getDocumento());
        stmt.setObject(24, campanha.getNome());
        stmt.setObject(25, campanha.getCidade());
        stmt.setObject(26, campanha.getUf());
        stmt.setObject(27, campanha.getOfertaDirecionada());
        stmt.setObject(28, campanha.getMediaRecGasto());
        stmt.setObject(29, campanha.getMediaSms());
        stmt.setObject(30, campanha.getMediaMb());
        stmt.setObject(31, campanha.getPacoteDeInternet());
        stmt.setObject(32, campanha.getDataVenc());
        stmt.setObject(33, campanha.getConvergenteGvt());
        stmt.setObject(34, campanha.getVivoFixo());
        stmt.setObject(35, campanha.getObservacao());
        stmt.setObject(36, campanha.getFone1());
        
        stmt.executeUpdate();
    }
    
}
