/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.model;

import br.com.vivo.cargaautomatica.model.adapter.CampanhaTelevendasAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;

/**
 *
 * @author tadorno
 */

@JsonAdapter(CampanhaTelevendasAdapter.class)
public class CampanhaTelevendas extends CampanhaGenerica{
       
    @SerializedName("documento")
    private String documento;
            
    @SerializedName("nome")
    private String nome;
    
    @SerializedName("cidade")
    private String cidade;
            
    @SerializedName("uf")
    private String uf;
            
    @SerializedName("oferta_direcionada")
    private String ofertaDirecionada;
            
    @SerializedName("media_rec_gasto")
    private String mediaRecGasto;
         
    @SerializedName("media_sms")
    private String mediaSms;
            
    @SerializedName("media_mb")
    private String mediaMb;
            
    @SerializedName("pacote_de_internet")
    private String pacoteDeInternet;
            
    @SerializedName("data_venc")
    private String dataVenc;
           
    @SerializedName("convergente_gvt")
    private String convergenteGvt;
            
    @SerializedName("vivo_fixo")
    private String vivoFixo;      
          
    @SerializedName("observacao")
    private String observacao;
            
    @SerializedName("fone1")
    private String fone1;

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

    public String getOfertaDirecionada() {
        return ofertaDirecionada;
    }

    public void setOfertaDirecionada(String ofertaDirecionada) {
        this.ofertaDirecionada = ofertaDirecionada;
    }

    public String getMediaRecGasto() {
        return mediaRecGasto;
    }

    public void setMediaRecGasto(String mediaRecGasto) {
        this.mediaRecGasto = mediaRecGasto;
    }

    public String getMediaSms() {
        return mediaSms;
    }

    public void setMediaSms(String mediaSms) {
        this.mediaSms = mediaSms;
    }

    public String getMediaMb() {
        return mediaMb;
    }

    public void setMediaMb(String mediaMb) {
        this.mediaMb = mediaMb;
    }

    public String getPacoteDeInternet() {
        return pacoteDeInternet;
    }

    public void setPacoteDeInternet(String pacoteDeInternet) {
        this.pacoteDeInternet = pacoteDeInternet;
    }

    public String getDataVenc() {
        return dataVenc;
    }

    public void setDataVenc(String dataVenc) {
        this.dataVenc = dataVenc;
    }

    public String getConvergenteGvt() {
        return convergenteGvt;
    }

    public void setConvergenteGvt(String convergenteGvt) {
        this.convergenteGvt = convergenteGvt;
    }

    public String getVivoFixo() {
        return vivoFixo;
    }

    public void setVivoFixo(String vivoFixo) {
        this.vivoFixo = vivoFixo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }
    
    
}
