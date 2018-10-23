/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.model;

import br.com.vivo.cargaautomatica.model.adapter.CampanhaGenericaAdapter;
import br.com.vivo.cargaautomatica.model.enums.RecordStatusEnum;
import br.com.vivo.cargaautomatica.model.enums.RecordTypeEnum;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author tadorno
 */
@JsonAdapter(CampanhaGenericaAdapter.class)
public class CampanhaGenerica {
    
    @SerializedName("contact_info") 
    private String contactInfo;
    
    @SerializedName("contact_info_type")
    private Integer contactInfoType;
            
    @SerializedName("record_type")
    private Integer recordType = RecordTypeEnum.GENERAL.getCod();       
            
    @SerializedName("record_status")
    private Integer recordStatus = RecordStatusEnum.READY.getCod();
               
    @SerializedName("attempt") 
    private Integer attempt = 0;
            
    @SerializedName("daily_from")
    private Integer dailyFrom;
            
    @SerializedName("daily_till")
    private Integer dailyTill;
            
    @SerializedName("tz_dbid")
    private Integer tzDbid;
            
    @SerializedName("chain_id")
    private Integer chainId;
            
    @SerializedName("chain_n")
    private Integer chainN;

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Integer getContactInfoType() {
        return contactInfoType;
    }

    public void setContactInfoType(Integer contactInfoType) {
        this.contactInfoType = contactInfoType;
    }

    public Integer getRecordType() {
        return recordType;
    }

    public void setRecordType(Integer recordType) {
        this.recordType = recordType;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Integer getAttempt() {
        return attempt;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public Integer getDailyFrom() {
        return dailyFrom;
    }

    public void setDailyFrom(Integer dailyFrom) {
        this.dailyFrom = dailyFrom;
    }

    public Integer getDailyTill() {
        return dailyTill;
    }

    public void setDailyTill(Integer dailyTill) {
        this.dailyTill = dailyTill;
    }

    public Integer getTzDbid() {
        return tzDbid;
    }

    public void setTzDbid(Integer tzDbid) {
        this.tzDbid = tzDbid;
    }

    public Integer getChainId() {
        return chainId;
    }

    public void setChainId(Integer chainId) {
        this.chainId = chainId;
    }

    public Integer getChainN() {
        return chainN;
    }

    public void setChainN(Integer chainN) {
        this.chainN = chainN;
    }
    
}
