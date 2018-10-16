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
                .append(" (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        PreparedStatement stmt = con.prepareStatement(query.toString());
        
        stmt.setObject(1, campanha.getRecordId());
        stmt.setObject(2, campanha.getContactInfo());
        stmt.setObject(3, campanha.getContactInfoType());
        stmt.setObject(4, campanha.getRecordType());
        stmt.setObject(5, campanha.getRecordStatus());
        stmt.setObject(6, campanha.getCallResult());
        stmt.setObject(7, campanha.getAttempt());
        stmt.setObject(8, campanha.getDialSchedTime());
        stmt.setObject(9, campanha.getCallTime());
        stmt.setObject(10, campanha.getDailyFrom());
        stmt.setObject(11, campanha.getDailyTill());
        stmt.setObject(12, campanha.getTzDbid());
        stmt.setObject(13, campanha.getCampaignId());
        stmt.setObject(14, campanha.getAgentId());
        stmt.setObject(15, campanha.getChainId());
        stmt.setObject(16, campanha.getChainN());
        stmt.setObject(17, campanha.getGroupId());
        stmt.setObject(18, campanha.getAppId());
        stmt.setObject(19, campanha.getTreatments());
        stmt.setObject(20, campanha.getMediaRef());
        stmt.setObject(21, campanha.getEmailSubject());
        stmt.setObject(22, campanha.getEmailTemplateId());
        stmt.setObject(23, campanha.getSwitchId());
        stmt.setObject(24, campanha.getDocumento());
        stmt.setObject(25, campanha.getNome());
        stmt.setObject(26, campanha.getCidade());
        stmt.setObject(27, campanha.getUf());
        stmt.setObject(28, campanha.getOfertaDirecionada());
        stmt.setObject(29, campanha.getMediaRecGasto());
        stmt.setObject(30, campanha.getMediaSms());
        stmt.setObject(31, campanha.getMediaMb());
        stmt.setObject(32, campanha.getPacoteDeInternet());
        stmt.setObject(33, campanha.getDataVenc());
        stmt.setObject(34, campanha.getConvergenteGvt());
        stmt.setObject(35, campanha.getVivoFixo());
        stmt.setObject(36, campanha.getObservacao());
        stmt.setObject(37, campanha.getFone1());
        
        stmt.executeUpdate();
    }
    
}
