/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author cruzers
 */
public class My_Connection {
  
    public static Connection getConnection(){
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost/user_account","root","");
            
        } catch (Exception ex) {
            Logger.getLogger(My_Connection.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error Connecting to Server");
            JOptionPane.showMessageDialog(null,ex);
        }
        
        return con;
        
           
    }   
 }
