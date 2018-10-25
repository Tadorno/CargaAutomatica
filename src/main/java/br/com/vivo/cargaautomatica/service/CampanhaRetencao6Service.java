/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.service;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tadorno
 */
public class CampanhaRetencao6Service extends CampanhaService{

    @Override
    public void realizarCarga() {
        Logger.getLogger(CampanhaRetencao6Service.class.getName()).log(Level.INFO, "Iniciando carga de campanha.");
        //Recupera dados do WS
        //Salva no banco
    }
  
}
