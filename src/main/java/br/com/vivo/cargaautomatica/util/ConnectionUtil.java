/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vivo.cargaautomatica.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tadorno
 */
public class ConnectionUtil {
    
    private static Connection con;
	
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

    private static final String CONNECTION_STRING = PropertySingleton.getProperty("database-connection-string");

    private static final String USER = PropertySingleton.getProperty("database-username");

    private static final String PWD = PropertySingleton.getProperty("database-password");
    
    /**
     * to load the database base driver
     * @return a database connection
     * @throws SQLException throws an exception if an error occurs
     */
    public static Connection getConnection() throws SQLException {
        if(con == null || !con.isClosed()){
            try {
                Class.forName(DRIVER);
            } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            con = DriverManager.getConnection(CONNECTION_STRING, USER, PWD);
        }
        return con;
    }	
	
    public static void close() throws SQLException{
        if(con != null && !con.isClosed()){
            con.close();
        }
    }
}
