/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.dao.util;

import br.com.vivo.cargaautomatica.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tadorno
 */
public class ConnectionUtilOCS implements IConnectionUtil{
    
    private final String DRIVER = "oracle.jdbc.driver.OracleDriver";

    private final String CONNECTION_STRING = PropertySingleton.getProperty("database-ocs-connection-string");

    private final String USER = PropertySingleton.getProperty("database-ocs-username");

    private final String PWD = PropertySingleton.getProperty("database-ocs-password");
    
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException{
        Class.forName(DRIVER);
        Connection con = DriverManager.getConnection(CONNECTION_STRING, USER, PWD);
        
        return con;
    }	

}
