/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.service.factory;

import br.com.vivo.cargaautomatica.model.enums.TipoCampanhaEnum;
import br.com.vivo.cargaautomatica.service.CampanhaRetencao5Service;
import br.com.vivo.cargaautomatica.service.CampanhaRetencao6Service;
import br.com.vivo.cargaautomatica.service.CampanhaRetencao7Service;
import br.com.vivo.cargaautomatica.service.CampanhaRetencao8Service;
import br.com.vivo.cargaautomatica.service.CampanhaService;
import br.com.vivo.cargaautomatica.service.CampanhaTelevendasService;

/**
 *
 * @author tadorno
 */
public class CampanhaServiceFactory {
      
    public static CampanhaService getService(TipoCampanhaEnum tipoCampanha){
 
        switch(tipoCampanha){
            case TELEVENDAS:
                return new CampanhaTelevendasService();
            case CRM_RET_5:
                return new CampanhaRetencao5Service();
            case CRM_RET_6:
                return new CampanhaRetencao6Service();
            case CRM_RET_7:
                return new CampanhaRetencao7Service();
            case CRM_RET_8:
                return new CampanhaRetencao8Service();
                    
            default:
                throw new IllegalArgumentException("Tipo de campanha inválida");
        }
    }
}
