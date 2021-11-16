/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hotel_system;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ADMIN
 */
public class MY_CONNECTION {
  
    public Connection createConnection(){
        Connection connection = null;
        
        MysqlDataSource mds = new MysqlDataSource();
        
        mds.setServerName("localhost");
        mds.setPortNumber(3307);
        mds.setUser("root");
        mds.setPassword("");
        mds.setDatabaseName("java_hotel_db");
        
        try {
            connection = mds.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MY_CONNECTION.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return connection;
    }
    
}
