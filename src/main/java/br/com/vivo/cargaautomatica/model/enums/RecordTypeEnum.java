/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.model.enums;

/**
 *
 * @author tadorno
 */
public enum RecordTypeEnum {
    
    NO_RECORD_TYPE(0, "No Record Type"),
    UNKNOWN(1, "Unknown"),
    GENERAL(2, "General"),
    CAMPAIGN_RESCHEDULED(3, "Campaign Rescheduled"),
    PERSONAL_RESCHEDULED(4, "Personal Rescheduled"),
    PERSONAL_CALLBACK(5, "Personal CallBack"),
    CAMPAIGN_CALLBACK(6, "Campaign CallBack"),
    NO_CALL(7, "No Call");

    private Integer cod;
    private String descricao;

    private RecordTypeEnum(Integer cod, String descricao) {
        this.cod = cod;
        this.descricao = descricao;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
	
    public static RecordTypeEnum findByDescricao(String descricao) {
        for (RecordTypeEnum x : RecordTypeEnum.values()) {
            if (descricao.equals(x.getDescricao())) {
                return x;
            }
        }
        return null;
    }
	
}
