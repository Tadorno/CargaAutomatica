/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.dao.factory;

import br.com.vivo.cargaautomatica.dao.util.ConnectionUtilOCS;
import br.com.vivo.cargaautomatica.dao.util.IConnectionUtil;
import br.com.vivo.cargaautomatica.model.enums.DataBaseEnum;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author tadorno
 */
public class ConnectionFactory {
    
    public static Connection getConnection(DataBaseEnum database) throws SQLException, ClassNotFoundException{

        IConnectionUtil connectionUtil;
        switch(database){
            case GEN_OCS:
                connectionUtil = new ConnectionUtilOCS();
                return connectionUtil.getConnection();
            default:
                throw new IllegalArgumentException("Tipo de banco desconhecido");
        }
    }
}
