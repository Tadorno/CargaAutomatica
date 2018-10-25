/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.model;

import br.com.vivo.cargaautomatica.model.adapter.CampanhaRetencaoWinbackAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author tadorno
 */

@JsonAdapter(CampanhaRetencaoWinbackAdapter.class)
public class CampanhaRetencaoWinback extends CampanhaGenerica{
       
    @SerializedName("documento")
    private String documento;
            
    @SerializedName("nome")
    private String nome;
    
    @SerializedName("logradouro")
    private String logradouro;
    
    @SerializedName("numero")
    private String numero;
    
    @SerializedName("complemento")
    private String complemento;
    
    @SerializedName("cidade")
    private String cidade;
            
    @SerializedName("uf")
    private String uf;
    
    @SerializedName("bairro")
    private String bairro;
    
    @SerializedName("cep")
    private String cep;
    
    @SerializedName("campanha")
    private String campanha;
    
    @SerializedName("item1")
    private String item1;
    
    @SerializedName("item2")
    private String item2;
    
    @SerializedName("item3")
    private String item3;
    
    @SerializedName("item4")
    private String item4;
    
    @SerializedName("item5")
    private String item5;
    
    @SerializedName("item6")
    private String item6;
    
    @SerializedName("item7")
    private String item7;
    
    @SerializedName("item8")
    private String item8;
    
    @SerializedName("item9")
    private String item9;
    
    @SerializedName("item10")
    private String item10;
    
    @SerializedName("item11")
    private String item11;
    
    @SerializedName("item12")
    private String item12;
    
    @SerializedName("item13")
    private String item13;
    
    @SerializedName("item14")
    private String item14;
    
    @SerializedName("item15")
    private String item15;
    
    @SerializedName("item16")
    private String item16;
    
    @SerializedName("item17")
    private String item17;
    
    @SerializedName("item18")
    private String item18;
    
    @SerializedName("item19")
    private String item19;
    
    @SerializedName("item20")
    private String item20;
    
    @SerializedName("item21")
    private String item21;
    
    @SerializedName("item22")
    private String item22;
    
    @SerializedName("item23")
    private String item23;
    
    @SerializedName("item24")
    private String item24;
    
    @SerializedName("item5")
    private String item25;
    
    @SerializedName("item26")
    private String item26;
    
    @SerializedName("item27")
    private String item27;
    
    @SerializedName("item28")
    private String item28;
    
    @SerializedName("item29")
    private String item29;
    
    @SerializedName("item30")
    private String item30;
    
    @SerializedName("item31")
    private String item31;
    
    @SerializedName("item32")
    private String item32;
    
    @SerializedName("item33")
    private String item33;
    
    @SerializedName("item34")
    private String item34;
    
    @SerializedName("item35")
    private String item35;
    
    @SerializedName("item36")
    private String item36;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCampanha() {
        return campanha;
    }

    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5;
    }

    public String getItem6() {
        return item6;
    }

    public void setItem6(String item6) {
        this.item6 = item6;
    }

    public String getItem7() {
        return item7;
    }

    public void setItem7(String item7) {
        this.item7 = item7;
    }

    public String getItem8() {
        return item8;
    }

    public void setItem8(String item8) {
        this.item8 = item8;
    }

    public String getItem9() {
        return item9;
    }

    public void setItem9(String item9) {
        this.item9 = item9;
    }

    public String getItem10() {
        return item10;
    }

    public void setItem10(String item10) {
        this.item10 = item10;
    }

    public String getItem11() {
        return item11;
    }

    public void setItem11(String item11) {
        this.item11 = item11;
    }

    public String getItem12() {
        return item12;
    }

    public void setItem12(String item12) {
        this.item12 = item12;
    }

    public String getItem13() {
        return item13;
    }

    public void setItem13(String item13) {
        this.item13 = item13;
    }

    public String getItem14() {
        return item14;
    }

    public void setItem14(String item14) {
        this.item14 = item14;
    }

    public String getItem15() {
        return item15;
    }

    public void setItem15(String item15) {
        this.item15 = item15;
    }

    public String getItem16() {
        return item16;
    }

    public void setItem16(String item16) {
        this.item16 = item16;
    }

    public String getItem17() {
        return item17;
    }

    public void setItem17(String item17) {
        this.item17 = item17;
    }

    public String getItem18() {
        return item18;
    }

    public void setItem18(String item18) {
        this.item18 = item18;
    }

    public String getItem19() {
        return item19;
    }

    public void setItem19(String item19) {
        this.item19 = item19;
    }

    public String getItem20() {
        return item20;
    }

    public void setItem20(String item20) {
        this.item20 = item20;
    }

    public String getItem21() {
        return item21;
    }

    public void setItem21(String item21) {
        this.item21 = item21;
    }

    public String getItem22() {
        return item22;
    }

    public void setItem22(String item22) {
        this.item22 = item22;
    }

    public String getItem23() {
        return item23;
    }

    public void setItem23(String item23) {
        this.item23 = item23;
    }

    public String getItem24() {
        return item24;
    }

    public void setItem24(String item24) {
        this.item24 = item24;
    }

    public String getItem25() {
        return item25;
    }

    public void setItem25(String item25) {
        this.item25 = item25;
    }

    public String getItem26() {
        return item26;
    }

    public void setItem26(String item26) {
        this.item26 = item26;
    }

    public String getItem27() {
        return item27;
    }

    public void setItem27(String item27) {
        this.item27 = item27;
    }

    public String getItem28() {
        return item28;
    }

    public void setItem28(String item28) {
        this.item28 = item28;
    }

    public String getItem29() {
        return item29;
    }

    public void setItem29(String item29) {
        this.item29 = item29;
    }

    public String getItem30() {
        return item30;
    }

    public void setItem30(String item30) {
        this.item30 = item30;
    }

    public String getItem31() {
        return item31;
    }

    public void setItem31(String item31) {
        this.item31 = item31;
    }

    public String getItem32() {
        return item32;
    }

    public void setItem32(String item32) {
        this.item32 = item32;
    }

    public String getItem33() {
        return item33;
    }

    public void setItem33(String item33) {
        this.item33 = item33;
    }

    public String getItem34() {
        return item34;
    }

    public void setItem34(String item34) {
        this.item34 = item34;
    }

    public String getItem35() {
        return item35;
    }

    public void setItem35(String item35) {
        this.item35 = item35;
    }

    public String getItem36() {
        return item36;
    }

    public void setItem36(String item36) {
        this.item36 = item36;
    }
    
    
}
