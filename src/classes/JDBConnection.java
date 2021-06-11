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
    public static void insertQuery(String SQLquery, int numberOfParameters) {
        PreparedStatement prepStat = null;
        try {
            //stat.executeQuery(SQLquery);
            switch(numberOfParameters) {
                case 1:
                    prepStat = conn.prepareStatement(SQLquery);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                default:
                    break;
            }
            /*prepStat.executeUpdate();   
            closeConnection();*/
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }        
   }
    
    public static void updateQuery(String query) {
        Statement updStat = null;
        try {
            stat.executeUpdate(query);
            conn.commit();
            closeConnection();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }   
        
    }
    //CLASE PARA SQL LITE
}
