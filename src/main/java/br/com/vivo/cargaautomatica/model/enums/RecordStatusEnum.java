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
public enum RecordStatusEnum {
    
    NO_RECORD_STATUS(0, "No Record Status"),
    READY(1, "Ready"),
    RETRIEVED(2, "Retrieved"),
    UPDATED(3, "Updated"),
    STALE(4, "Stale"),
    CANCELED(5, "Canceled"),
    AGENT_ERROR(6, "Agent Error"),
    //7 Vazio
    MISSED_CALLBACK(8, "Missed CallBack");

    private Integer cod;
    private String descricao;

    private RecordStatusEnum(Integer cod, String descricao) {
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
	
    public static RecordStatusEnum findByDescricao(String descricao) {
        for (RecordStatusEnum x : RecordStatusEnum.values()) {
            if (descricao.equals(x.getDescricao())) {
                return x;
            }
        }
        return null;
    }
	
}
