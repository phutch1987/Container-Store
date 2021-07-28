/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContainerStore;

import java.nio.file.Paths;
import java.sql.*;
import javax.swing.JOptionPane;


public class DatabaseConnect {
    
    private Connection con; 
    private String URL;
    Customer customer;
    Warehouse wh;
    
    String path = Paths.get("").toAbsolutePath().toString();

    public Connection DbCon() throws SQLException{
                
        try {

            URL = "jdbc:sqlite:" + path + "\\ContainerStoreData\\ContainerStore.db";
            con = DriverManager.getConnection(URL);
            
            
        }catch(SQLException e) {
            
           JOptionPane.showInputDialog(e.getMessage());
        }
        
        return con;
    }
    
}
