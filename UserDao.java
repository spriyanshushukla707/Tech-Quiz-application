/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.Dao;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.userPojo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class UserDao {
    public static boolean validateUser(userPojo obj)throws SQLException
    {
        
        Connection c=DBConnection.getConnection();
        PreparedStatement ps=c.prepareStatement("Select * from users where userid=? and password=? and usertype=?");
        ps.setString(1,obj.getUserId());
        ps.setString(2, obj.getPassword());
        ps.setString(3, obj.getUserType());
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    public static boolean addUser(userPojo user)throws SQLException
    {
        boolean status = true;
      Connection conn=DBConnection.getConnection();
      PreparedStatement ps=conn.prepareStatement("Select * from users where userId=?");
      ps.setString(1, user.getUserId());
     ResultSet rs=ps.executeQuery();
     if(rs.next())
     {
        status=false; 
     }
     else
     {
         ps=conn.prepareStatement("insert into users values(?,?,?)");
         ps.setString(1, user.getUserId());
         ps.setString(2, user.getPassword());
         ps.setString(3, user.getUserType());
         ps.executeUpdate();
         
     }
     return status;
     
    }
 


    public static boolean changePassword(String userid,String password)throws SQLException{
        String qry="Update users set password=? where userid=?";
        boolean status=true;
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,password);
        ps.setString(2,userid);
        int ans=ps.executeUpdate();
        if(ans==0)
               status=false;
     return status;
     } 

}
