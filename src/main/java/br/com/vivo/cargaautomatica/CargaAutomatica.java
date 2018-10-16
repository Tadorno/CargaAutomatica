/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica;

import br.com.vivo.cargaautomatica.service.CampanhaTelevendasService;



/**
 *
 * @author tadorno
 */
public class CargaAutomatica {

    private final static int TELEVENDAS = 0;
    
    public static void main(String... args) {
        
        try{
            int tipoCampanha = Integer.parseInt(args[0]);
            
            switch(tipoCampanha){
                case TELEVENDAS:
                    CampanhaTelevendasService service = new CampanhaTelevendasService();
                    service.realizarCarga();
                    break;
                    
                default:
                    throw new IllegalArgumentException("Tipo de campanha inválida");
            }
        }catch(IndexOutOfBoundsException iobx){
            throw new IllegalArgumentException("Não foi informado argumentos para a execução da rotina");
        }catch(NumberFormatException nfe){
            throw new IllegalArgumentException("Valor de argumento inválido");
        }

    }
}
