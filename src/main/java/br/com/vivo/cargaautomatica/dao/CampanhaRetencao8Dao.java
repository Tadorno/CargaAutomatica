/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.dao;

import br.com.vivo.cargaautomatica.model.CampanhaRetencaoWinback;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author tadorno
 */
public class CampanhaRetencao8Dao {
    
    public static void insert(CampanhaRetencaoWinback campanha, Connection con) throws SQLException, ClassNotFoundException{
        
        StringBuilder query = new StringBuilder();
        
        query.append("INSERT INTO TA_CRM_RET_8 (")
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
                .append(", CIDADE")
                .append(", NOME")
                .append(", LOGRADOURO")
                .append(", NUMERO")
                .append(", COMPLEMENTO")
                .append(", UF")
                .append(", BAIRRO")
                .append(", CEP")
                .append(", CAMPANHA")
                .append(", ITEM1")
                .append(", ITEM2")
                .append(", ITEM3")
                .append(", ITEM4")
                .append(", ITEM5")
                .append(", ITEM6")
                .append(", ITEM7")
                .append(", ITEM8")
                .append(", ITEM9")
                .append(", ITEM10")
                .append(", ITEM11")
                .append(", ITEM12")
                .append(", ITEM13")
                .append(", ITEM14")
                .append(", ITEM15")
                .append(", ITEM16")
                .append(", ITEM17")
                .append(", ITEM18")
                .append(", ITEM19")
                .append(", ITEM20")
                .append(", ITEM21")
                .append(", ITEM22")
                .append(", ITEM23")
                .append(", ITEM24")
                .append(", ITEM25")
                .append(", ITEM26")
                .append(", ITEM27")
                .append(", ITEM28")
                .append(", ITEM29")
                .append(", ITEM30")
                .append(", ITEM31")
                .append(", ITEM32")
                .append(", ITEM33")
                .append(", ITEM34")
                .append(", ITEM35")
                .append(", ITEM36")
                .append(") VALUES ")
                .append(" (")
                .append(" (SELECT (NVL(MAX(RECORD_ID), 0) + 1) AS NEW_RECORD_ID FROM TA_CRM_RET_8)")
                .append(", ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?")
                //Itens 1 à 36
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?")
                .append(", ?)");
        
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
        stmt.setObject(12, campanha.getCidade());
        stmt.setObject(13, campanha.getNome());
        stmt.setObject(14, campanha.getLogradouro());
        stmt.setObject(15, campanha.getNumero());
        stmt.setObject(16, campanha.getComplemento());
        stmt.setObject(17, campanha.getUf());
        stmt.setObject(18, campanha.getBairro());
        stmt.setObject(19, campanha.getCep());
        stmt.setObject(20, campanha.getCampanha());
        
        stmt.setObject(21, campanha.getItem1());
        stmt.setObject(22, campanha.getItem2());
        stmt.setObject(23, campanha.getItem3());
        stmt.setObject(24, campanha.getItem4());
        stmt.setObject(25, campanha.getItem5());
        stmt.setObject(26, campanha.getItem6());
        stmt.setObject(27, campanha.getItem7());
        stmt.setObject(28, campanha.getItem8());
        stmt.setObject(29, campanha.getItem9());
        stmt.setObject(30, campanha.getItem10());
        
        stmt.setObject(31, campanha.getItem11());
        stmt.setObject(32, campanha.getItem12());
        stmt.setObject(33, campanha.getItem13());
        stmt.setObject(34, campanha.getItem14());
        stmt.setObject(35, campanha.getItem15());
        stmt.setObject(36, campanha.getItem16());
        stmt.setObject(37, campanha.getItem17());
        stmt.setObject(38, campanha.getItem18());
        stmt.setObject(39, campanha.getItem19());
        stmt.setObject(40, campanha.getItem20());
        
        stmt.setObject(41, campanha.getItem21());
        stmt.setObject(42, campanha.getItem22());
        stmt.setObject(43, campanha.getItem23());
        stmt.setObject(44, campanha.getItem24());
        stmt.setObject(45, campanha.getItem25());
        stmt.setObject(46, campanha.getItem26());
        stmt.setObject(47, campanha.getItem27());
        stmt.setObject(48, campanha.getItem28());
        stmt.setObject(49, campanha.getItem29());
        stmt.setObject(50, campanha.getItem30());
        
        stmt.setObject(51, campanha.getItem31());
        stmt.setObject(52, campanha.getItem32());
        stmt.setObject(53, campanha.getItem33());
        stmt.setObject(54, campanha.getItem34());
        stmt.setObject(55, campanha.getItem35());
        stmt.setObject(56, campanha.getItem36());
        
        stmt.executeUpdate();
    }
    
}
