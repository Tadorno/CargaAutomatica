/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.model.adapter;

import br.com.vivo.cargaautomatica.model.CampanhaTelevendas;
import br.com.vivo.cargaautomatica.model.enums.CallResultEnum;
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
public class CampanhaTelevendasAdapter extends TypeAdapter<CampanhaTelevendas>{

    @Override
    public void write(JsonWriter writer, CampanhaTelevendas t) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CampanhaTelevendas read(JsonReader reader) throws IOException {
        
        CampanhaTelevendas campanha = new CampanhaTelevendas();
        reader.beginObject();
        
        while (reader.hasNext()) {
            String name = reader.nextName();
            switch(name){
                case "contact_info":
                    campanha.setContactInfo(reader.nextString());
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
                case "call_result":
                    campanha.setCallResult(
                            CallResultEnum.findByDescricao(reader.nextString()).getCod());
                    break;
                case "attempt":
                    campanha.setAttempt(reader.nextInt());
                    break;
                case "dial_sched_time":
                    campanha.setDialSchedTime(DateUtil.timeToSeconds(reader.nextString()));
                    break;   
                case "call_time":
                    campanha.setCallTime(DateUtil.timeToSeconds(reader.nextString()));
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
                case "campaign_id":
                    campanha.setCampaignId(reader.nextInt());
                    break;
                case "agent_id":
                    campanha.setAgentId(reader.nextString());
                    break;
                case "chain_id":
                    campanha.setChainId(reader.nextInt());
                    break;
                case "chain_n":
                    campanha.setChainN(reader.nextInt());
                    break;
                case "group_id":
                    campanha.setGroupId(reader.nextInt());
                    break;
                case "app_id":
                    campanha.setAppId(reader.nextInt());
                    break;
                case "treatments":
                    campanha.setTreatments(reader.nextString());
                    break;
                case "media_ref":
                    campanha.setMediaRef(reader.nextInt());
                    break;
                case "email_subject":
                    campanha.setEmailSubject(reader.nextString());
                    break;
                case "email_template_id":
                    campanha.setEmailTemplateId(reader.nextInt());
                    break;
                case "switch_id":
                    campanha.setSwitchId(reader.nextInt());
                    break;
                case "documento":
                    campanha.setDocumento(reader.nextString());
                    break;
                case "nome":
                    campanha.setNome(reader.nextString());
                    break;
                case "cidade":
                    campanha.setCidade(reader.nextString());
                    break;
                case "uf":
                    campanha.setUf(reader.nextString());
                    break;
                case "oferta_direcionada":
                    campanha.setOfertaDirecionada(reader.nextString());
                    break;
                case "media_rec_gasto":
                    campanha.setMediaRecGasto(reader.nextString());
                    break;
                case "media_sms":
                    campanha.setMediaSms(reader.nextString());
                    break;
                case "media_mb":
                    campanha.setMediaMb(reader.nextString());
                    break;
                case "pacote_de_internet":
                    campanha.setPacoteDeInternet(reader.nextString());
                    break;
                case "data_venc":
                    campanha.setDataVenc(reader.nextString());
                    break;
                case "convergente_gvt":
                    campanha.setConvergenteGvt(reader.nextString());
                    break;
                case "vivo_fixo":
                    campanha.setVivoFixo(reader.nextString());
                    break;
                case "observacao":
                    campanha.setObservacao(reader.nextString());
                    break;
                case "fone1":
                    campanha.setFone1(reader.nextString());
                    break;
                default : reader.skipValue();
            }
        }
        
        reader.endObject();
        return campanha;
    }
    
}
