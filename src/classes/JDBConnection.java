/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author INVENTARIOS
 */
public class JDBConnection {
    public JDBConnection(){}
    
    public static void openConnection() throws Exception{
//        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:test.db");        
        Statement st = conn.createStatement();
        // st.execute("") //
    }
    //CLASE PARA SQL LITE
}
