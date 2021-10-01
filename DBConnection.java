/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DBConnection {
      private static Connection conn;
 
    static
    {
         try
        {
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//DESkTOP-7FGSMGQ/xe","onlineexam","student");
           
         }
        catch(Exception e)
        {
           e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Cannot connect to database");
        }
        
    }
    public static Connection getConnection()
    {
        return conn;
    }
    public static void closeConnection()
    {
       try
       {
           conn.close();
       }
       catch(SQLException s)
       {
           s.printStackTrace();
           System.out.println("unable to close connection");
           
       }
    }
    
}
