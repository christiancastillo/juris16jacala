/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author INVENTARIOS
 */
public class JDBConnection {
    public JDBConnection(){
        
    }
    
    /*
    Nota: Descargar version x86 del JDK
    */
    
    private static Connection conn = null;
    private static Statement stat = null;
    private static ResultSet rs = null;
    
    public static void openConnection(){             
        try {
            Class.forName("org.sqlite.JDBC");   
            String url = "jdbc:sqlite:C:\\supervisionesssh\\db.db";
            conn = DriverManager.getConnection(url);
            
            stat = conn.createStatement();            
             DatabaseMetaData meta = conn.getMetaData();
             JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } 
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }       
        // st.execute("") //
    }
    
    public static void closeConnection(){
        try {
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }        
    }
    
    // FUNCIONES PARA DMLs
    public static void insertQuery(String SQLquery) {
        try {
            stat.executeQuery(SQLquery);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }        
   }
    
    public static void updateQuery(String query) {
        Statement updStat = null;
        try {
            stat.executeUpdate(query);
            conn.commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }   
        
    }
    //CLASE PARA SQL LITE
}
