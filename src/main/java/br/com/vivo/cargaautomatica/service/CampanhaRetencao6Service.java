/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.service;

import br.com.vivo.cargaautomatica.model.CampanhaGenerica;
import br.com.vivo.cargaautomatica.util.PropertySingleton;

/**
 *
 * @author tadorno
 */
public class CampanhaRetencao6Service extends CampanhaService<CampanhaGenerica>{

    @Override
    public void realizarCarga() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPathOrigem(){
        return PropertySingleton.getProperty("file-crm_ret_6-origem-path");
    }
    
    @Override
    public String getPathDestino(){
        return PropertySingleton.getProperty("file-crm_ret_6-local-path");
    }
    
    @Override
    public String getFileName(){
        return PropertySingleton.getProperty("file-crm_ret_6-name");
    }

    @Override
    public Class getModelClass() {
        return CampanhaGenerica.class;
    }
    
}
