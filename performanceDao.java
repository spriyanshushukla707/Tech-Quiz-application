/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.Dao;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.StudentScorePojo;
import TechQuizApp.pojo.performancePojo;
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
public class performanceDao {
    public static ArrayList<String>getAllExamId(String studentId)throws SQLException{
        ArrayList<String>al=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examId from performance where userId=?");
        ps.setString(1,studentId);
        ResultSet rs=ps.executeQuery();
       while(rs.next()){
           al.add(rs.getString(1));
       }
        return al;
    }
    public static void addPerformance(performancePojo performance) throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into performance values(?,?,?,?,?,?,?)");
      ps.setString(1, performance.getUserId());
  ps.setString(2, performance.getExamId());
           ps.setInt(3,performance.getRight());
           ps.setInt(4,performance.getWrong());
           ps.setInt(5,performance.getUnattempted());
           ps.setDouble(6,performance.getPer());
           ps.setString(7,performance.getLanguage());
           ps.executeUpdate();

    }
    public static ArrayList<String> getAllStudentId()throws SQLException
    {
       String qry="select distinct userid from performance";
       ArrayList<String> studentIdList=new ArrayList<>();
       Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
           while(rs.next()){
               String id=rs.getString(1);
               studentIdList.add(id);
           }
               
    return studentIdList;                      
   }
   public static StudentScorePojo getScore(String studentId,String examId)throws SQLException{
       StudentScorePojo scorePojo=new StudentScorePojo();
       Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select language,percentage from performance where userId=? and examId=?");
        ps.setString(1, studentId);
        ps.setString(2, examId);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
            scorePojo.setLanguage(rs.getString(1));
            scorePojo.setPercentage(rs.getDouble(2));
           
        }
        
         System.out.println(scorePojo.getLanguage());
        System.out.println(scorePojo.getPercentage());
        return scorePojo;
   }
  public static ArrayList<performancePojo> getAllData()throws SQLException{
       String qry="Select * from Performance";
       ArrayList<performancePojo> performanceList=new ArrayList<performancePojo>();
       Connection conn=DBConnection.getConnection();
              Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery(qry);
       while(rs.next()){
               String userId=rs.getString(1);
               String examId=rs.getString(2);
               String language=rs.getString(7);
               int right=rs.getInt(3);
               int wrong=rs.getInt(4);
               int unattempted=rs.getInt(5);
               double per=rs.getDouble(6);
               performancePojo p=new performancePojo();
               p.setExamId(examId);
               p.setUserId(userId);
               p.setLanguage(language);
               p.setPer(per);
               p.setUnattempted(unattempted);
               p.setRight(right);
               p.setWrong(wrong);
               performanceList.add(p);
               System.out.println(p);
          }
       return performanceList;
         
        }


   
}
