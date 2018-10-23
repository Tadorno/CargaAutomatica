/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.dao.factory;

import br.com.vivo.cargaautomatica.dao.util.ConnectionUtilOCS;
import br.com.vivo.cargaautomatica.dao.util.IConnectionUtil;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author tadorno
 */
public class ConnectionFactory {
    
    public static final int GEN_OCS = 1;
    public static final int OUTRO = 2;
    
    public static Connection getConnection(int idDatabase) throws SQLException, ClassNotFoundException{

        IConnectionUtil connectionUtil;
        switch(idDatabase){
            case GEN_OCS:
                connectionUtil = new ConnectionUtilOCS();
                return connectionUtil.getConnection();
            default:
                throw new IllegalArgumentException("Tipo de banco desconhecido");
        }
    }
}
