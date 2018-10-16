/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.model;

import br.com.vivo.cargaautomatica.model.adapter.CampanhaGenericaAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author tadorno
 */
@JsonAdapter(CampanhaGenericaAdapter.class)
public class CampanhaGenerica {
   
    @SerializedName("record_id") 
    private Integer recordId;
    
    @SerializedName("contact_info") 
    private String contactInfo;
    
    @SerializedName("contact_info_type")
    private Integer contactInfoType;
            
    @SerializedName("record_type")
    private Integer recordType;       
            
    @SerializedName("record_status")
    private Integer recordStatus;
            
    @SerializedName("call_result") 
    private Integer callResult;
               
    @SerializedName("attempt") 
    private Integer attempt;
            
    @SerializedName("dial_sched_time") 
    private Integer dialSchedTime;
            
    @SerializedName("call_time")
    private Integer callTime;
            
    @SerializedName("daily_from")
    private Integer dailyFrom;
            
    @SerializedName("daily_till")
    private Integer dailyTill;
            
    @SerializedName("tz_dbid")
    private Integer tzDbid;
            
    @SerializedName("campaign_id")
    private Integer campaignId;
            
    @SerializedName("agent_id")
    private String agentId;
            
    @SerializedName("chain_id")
    private Integer chainId;
            
    @SerializedName("chain_n")
    private Integer chainN;
            
    @SerializedName("group_id")
    private Integer groupId;
            
    @SerializedName("app_id")
    private Integer appId;
            
    @SerializedName("treatments")
    private String treatments;
            
    @SerializedName("media_ref")
    private Integer mediaRef;
    
    @SerializedName("email_subject")
    private String emailSubject;
            
    @SerializedName("email_template_id")
    private Integer emailTemplateId;
            
    @SerializedName("switch_id")
    private Integer switchId;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

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

    public Integer getCallResult() {
        return callResult;
    }

    public void setCallResult(Integer callResult) {
        this.callResult = callResult;
    }

    public Integer getAttempt() {
        return attempt;
    }

    public void setAttempt(Integer attempt) {
        this.attempt = attempt;
    }

    public Integer getDialSchedTime() {
        return dialSchedTime;
    }

    public void setDialSchedTime(Integer dialSchedTime) {
        this.dialSchedTime = dialSchedTime;
    }

    public Integer getCallTime() {
        return callTime;
    }

    public void setCallTime(Integer callTime) {
        this.callTime = callTime;
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

    public Integer getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(Integer campaignId) {
        this.campaignId = campaignId;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
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

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public String getTreatments() {
        return treatments;
    }

    public void setTreatments(String treatments) {
        this.treatments = treatments;
    }

    public Integer getMediaRef() {
        return mediaRef;
    }

    public void setMediaRef(Integer mediaRef) {
        this.mediaRef = mediaRef;
    }

    public String getEmailSubject() {
        return emailSubject;
    }

    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }

    public Integer getEmailTemplateId() {
        return emailTemplateId;
    }

    public void setEmailTemplateId(Integer emailTemplateId) {
        this.emailTemplateId = emailTemplateId;
    }

    public Integer getSwitchId() {
        return switchId;
    }

    public void setSwitchId(Integer switchId) {
        this.switchId = switchId;
    }
    
    
}
