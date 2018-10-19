/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.service;

/**
 *
 * @author tadorno
 */
public interface ICampanhaService {
    
    /**
     * Realiza a carga no banco de dados
     */
    public abstract void realizarCarga();
   
}
