/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author jolortegui
 */
public class clsConeccion {
    String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    
    public Connection getConnection() {
        Connection cn = null;
        try {
            Class.forName(DRIVER);
            String url = "jdbc:sqlserver://;databaseName=;user=;password=;";
            cn = DriverManager.getConnection(url);
        } catch (Exception e) {
            
        }
        
        return cn;
    }
}