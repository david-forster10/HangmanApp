/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmanapp;

import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Vanilla
 */
public class HangmanApp extends Global
{
    public static void main(String[] args) 
    {
        if (DatabaseConnection() == false) {
        JOptionPane.showMessageDialog(null, "Failed to connect to database", "system", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
        }
        
        StartJFrame form = new StartJFrame();
        form.setVisible(true);
        }
    
    public static boolean DatabaseConnection (){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hangman","user","user");
            Statement stmt=(Statement)con.createStatement();
            
            String sql = "Select * From tblwords";
    ResultSet rst;
    rst = stmt.executeQuery(sql);

    while (rst.next()) {
        Db.add(rst.getString("Word"));
    }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(HangmanApp.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
   