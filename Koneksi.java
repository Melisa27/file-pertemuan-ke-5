/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dabar;

import java.sql.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Robot
 */
public class Koneksi {
    private static connection databasekoneksi;
    public static connection koneksiDB() throws SQLException {
        if (databasekoneksi == null) {
            try{
                String DB = "jdbc:mysql://localhost:3306/dabar";
                String user = "root";
                String pass = "";
                
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                databasekoneksi = (connection) DriverManager.getConnection(DB,user,pass);
                
            }catch ( Exception e) {
                JoptionPane.showMessageDialog(null,"Koneksi GAGAL");
                
            } 
        }return databasekoneksi;
    }

    private static class JoptionPane {

        private static void showMessageDialog(Object object, String koneksi_GAGAL) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public JoptionPane() {
        }
    }
    
}
