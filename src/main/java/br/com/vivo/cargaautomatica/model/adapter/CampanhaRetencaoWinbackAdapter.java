/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.model.adapter;

import br.com.vivo.cargaautomatica.model.CampanhaRetencaoWinback;
import br.com.vivo.cargaautomatica.model.enums.ContactInfoTypeEnum;
import br.com.vivo.cargaautomatica.model.enums.RecordStatusEnum;
import br.com.vivo.cargaautomatica.model.enums.RecordTypeEnum;
import br.com.vivo.cargaautomatica.model.enums.TzDbidEnum;
import br.com.vivo.cargaautomatica.util.DateUtil;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 *
 * @author tadorno
 */
public class CampanhaRetencaoWinbackAdapter extends TypeAdapter<CampanhaRetencaoWinback>{

    @Override
    public void write(JsonWriter writer, CampanhaRetencaoWinback t) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CampanhaRetencaoWinback read(JsonReader reader) throws IOException {
        
        CampanhaRetencaoWinback campanha = new CampanhaRetencaoWinback();
        reader.beginObject();
        
        while (reader.hasNext()) {
            String name = reader.nextName();
            switch(name){
                case "contact_info":
                    campanha.setContactInfo(this.transformContactInfo(reader.nextString()));
                    break;
                case "contact_info_type":
                    campanha.setContactInfoType(
                            ContactInfoTypeEnum.findByDescricao(reader.nextString()).getCod());
                    break;
                case "record_type":
                    campanha.setRecordType(
                            RecordTypeEnum.findByDescricao(reader.nextString()).getCod());
                    break;
                case "record_status":
                    campanha.setRecordStatus(
                            RecordStatusEnum.findByDescricao(reader.nextString()).getCod());
                    break;
                case "attempt":
                    campanha.setAttempt(reader.nextInt());
                    break;
                case "daily_from":
                    campanha.setDailyFrom(DateUtil.timeToSeconds(reader.nextString()));
                    break;
                case "daily_till":
                    campanha.setDailyTill(DateUtil.timeToSeconds(reader.nextString()));
                    break;
                case "tz_dbid":
                    campanha.setTzDbid(
                            TzDbidEnum.findByDescricao(reader.nextString()).getCod());
                    break;
                case "chain_id":
                    campanha.setChainId(reader.nextInt());
                    break;
                case "chain_n":
                    campanha.setChainN(reader.nextInt());
                    break;
                case "documento":
                    campanha.setDocumento(reader.nextString());
                    break;
                case "nome":
                    campanha.setNome(reader.nextString());
                    break;
                case "logradouro":
                    campanha.setLogradouro(reader.nextString());
                    break;
                case "numero":
                    campanha.setNumero(reader.nextString());
                    break;
                case "complemento":
                    campanha.setComplemento(reader.nextString());
                    break;
                case "cidade":
                    campanha.setCidade(reader.nextString());
                    break;
                case "uf":
                    campanha.setUf(reader.nextString());
                    break;
                case "bairro":
                    campanha.setBairro(reader.nextString());
                    break;
                case "cep":
                    campanha.setCep(reader.nextString());
                    break;
                case "campanha":
                    campanha.setCampanha(reader.nextString());
                    break;
                case "item1":
                    campanha.setItem1(reader.nextString());
                    break;
                case "item2":
                    campanha.setItem2(reader.nextString());
                    break;
                case "item3":
                    campanha.setItem3(reader.nextString());
                    break;
                case "item4":
                    campanha.setItem4(reader.nextString());
                    break;
                case "item5":
                    campanha.setItem5(reader.nextString());
                    break;
                case "item6":
                    campanha.setItem6(reader.nextString());
                    break;
                case "item7":
                    campanha.setItem7(reader.nextString());
                    break;
                case "item8":
                    campanha.setItem8(reader.nextString());
                    break;
                case "item9":
                    campanha.setItem9(reader.nextString());
                    break;
                case "item10":
                    campanha.setItem10(reader.nextString());
                    break;
                case "item11":
                    campanha.setItem11(reader.nextString());
                    break;
                case "item12":
                    campanha.setItem12(reader.nextString());
                    break;
                case "item13":
                    campanha.setItem13(reader.nextString());
                    break;
                case "item14":
                    campanha.setItem14(reader.nextString());
                    break;
                case "item15":
                    campanha.setItem15(reader.nextString());
                    break;
                case "item16":
                    campanha.setItem16(reader.nextString());
                    break;
                case "item17":
                    campanha.setItem17(reader.nextString());
                    break;
                case "item18":
                    campanha.setItem18(reader.nextString());
                    break;
                case "item19":
                    campanha.setItem19(reader.nextString());
                    break;
                case "item20":
                    campanha.setItem20(reader.nextString());
                    break;
                case "item21":
                    campanha.setItem21(reader.nextString());
                    break;
                case "item22":
                    campanha.setItem22(reader.nextString());
                    break;
                case "item23":
                    campanha.setItem23(reader.nextString());
                    break;
                case "item24":
                    campanha.setItem24(reader.nextString());
                    break;
                case "item25":
                    campanha.setItem25(reader.nextString());
                    break;
                case "item26":
                    campanha.setItem26(reader.nextString());
                    break;
                case "item27":
                    campanha.setItem27(reader.nextString());
                    break;
                case "item28":
                    campanha.setItem28(reader.nextString());
                    break;
                case "item29":
                    campanha.setItem29(reader.nextString());
                    break;
                case "item30":
                    campanha.setItem30(reader.nextString());
                    break;
                case "item31":
                    campanha.setItem31(reader.nextString());
                    break;
                case "item32":
                    campanha.setItem32(reader.nextString());
                    break;
                case "item33":
                    campanha.setItem3(reader.nextString());
                    break;
                case "item34":
                    campanha.setItem34(reader.nextString());
                    break;
                case "item35":
                    campanha.setItem35(reader.nextString());
                    break;
                case "item36":
                    campanha.setItem36(reader.nextString());
                    break;
                
                default : reader.skipValue();
            }
        }
        
        reader.endObject();
        return campanha;
    }
    
    private String transformContactInfo(String rawContactInfo){
    
        return rawContactInfo;
    }
}
