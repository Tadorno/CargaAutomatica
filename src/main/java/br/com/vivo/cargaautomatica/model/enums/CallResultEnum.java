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
public enum CallResultEnum {
    
    OK(0, "[OK]");

    private Integer cod;
    private String descricao;

    private CallResultEnum(Integer cod, String descricao) {
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
	
    public static CallResultEnum findByDescricao(String descricao) {
        for (CallResultEnum x : CallResultEnum.values()) {
            if (descricao.equals(x.getDescricao())) {
                return x;
            }
        }
        return null;
    }
	
}
