/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.model.adapter;

import br.com.vivo.cargaautomatica.model.CampanhaGenerica;
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
public class CampanhaGenericaAdapter extends TypeAdapter<CampanhaGenerica>{

    @Override
    public void write(JsonWriter writer, CampanhaGenerica t) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CampanhaGenerica read(JsonReader reader) throws IOException {
        
        CampanhaGenerica campanha = new CampanhaGenerica();
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
                default : reader.skipValue();
            }
        }
        
        reader.endObject();
        return campanha;
    }
    
}
