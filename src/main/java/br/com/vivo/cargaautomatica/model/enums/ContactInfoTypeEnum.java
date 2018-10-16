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
public enum ContactInfoTypeEnum {
    
    NO_CONTACT_TYPE(0, "No Contact Type"),
    HOME_FONE(1, "Home Phone"),
    DIRECT_BUSINESS_PHONE(2, "Direct Business Phone"),
    BUSINESS_WITH_EXT(3, "Business With Ext"),
    MOBILE(4, "Mobile"),
    VACATION_PHONE(5, "Vacation Phone"),
    PAGER(6, "Pager"),
    MODEM(7, "Modem"),
    VOICE_MAIL(8, "Voice Mail"),
    PIN_PAGER(9, "Pin Pager"),
    EMAIL_ADDRESS(10, "E-mail Address"),
    INSTANT_MESSAGING(11, "Instant Messaging");

    private Integer cod;
    private String descricao;

    private ContactInfoTypeEnum(Integer cod, String descricao) {
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
	
    public static ContactInfoTypeEnum findByDescricao(String descricao) {
        for (ContactInfoTypeEnum x : ContactInfoTypeEnum.values()) {
            if (descricao.equals(x.getDescricao())) {
                return x;
            }
        }
        return null;
    }
	
}
