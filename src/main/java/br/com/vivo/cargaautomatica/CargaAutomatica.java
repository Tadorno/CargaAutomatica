/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica;

import br.com.vivo.cargaautomatica.service.factory.CampanhaServiceFactory;



/**
 *
 * @author tadorno
 */
public class CargaAutomatica {

    public static void main(String... args) {
        
        try{
            int tipoCampanha = Integer.parseInt(args[0]);
            
            CampanhaServiceFactory.getService(tipoCampanha).realizarCarga();
        }catch(IndexOutOfBoundsException iobx){
            throw new IllegalArgumentException("Não foi informado argumentos para a execução da rotina", iobx);
        }catch(NumberFormatException nfe){
            throw new IllegalArgumentException("Valor de argumento inválido", nfe);
        }

    }
}
