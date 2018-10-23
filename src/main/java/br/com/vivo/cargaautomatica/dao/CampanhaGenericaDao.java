/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.dao;

import br.com.vivo.cargaautomatica.model.CampanhaGenerica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author tadorno
 */
public class CampanhaGenericaDao {
    
    public static void insert(CampanhaGenerica campanha, Connection con) throws SQLException, ClassNotFoundException{
        
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
                .append(") VALUES ")
                .append(" (")
                .append(" (SELECT (NVL(MAX(RECORD_ID), 0) + 1) AS NEW_RECORD_ID  FROM TA_BCA_MKT)")
                .append(", ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
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
        
        stmt.executeUpdate();
    }
    
}
