/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.Dao;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.ExamPojo;
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
public class ExamDao {
   
    public static boolean addExam(ExamPojo newExam)throws SQLException{
        String qry="insert into Exam values(?,?,?)";
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,newExam.getExamid());
        ps.setString(2,newExam.getLanguage());
        ps.setInt(3,newExam.getTotalquestion());
        int ans=ps.executeUpdate();
        return ans==1;
        
    }
     public static String getExamId()throws SQLException
    {
        Connection conn=DBConnection.getConnection();
       Statement st=conn.createStatement();
       int rowCount=0;
       ResultSet rs=st.executeQuery("Select count(*)as totalrows from exam ");
       if(rs.next())
           rowCount=rs.getInt(1);
       String newId="Ex"+(rowCount+1);
       return newId;
       
    }
    public static boolean ispprSet(String sub)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from Exam where language=?");
        ps.setString(1, sub);
        ResultSet rs=ps.executeQuery();
        return rs.next();
    }
    public static ArrayList<String> getExamidBySubject(String userid,String sub)throws SQLException{
        ArrayList<String> examList=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select examid from Exam where language=? minus select examid from performance where userid=?");
        ps.setString(1, sub);
        ps.setString(2, userid);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            examList.add(rs.getString(1));
        }
        return examList;        
    }
    public static int getQuestionCountByExam(String examid)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select total_question from exam where examid=?");
        ps.setString(1, examid);
        ResultSet rs=ps.executeQuery();
        rs.next();
     return rs.getInt(1);
    }

    public static ArrayList getExamBySubject(String lan) throws SQLException {
        String qry="select examid from exam where language=?";
        ArrayList <String> examidList=new ArrayList();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1, lan);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            examidList.add(rs.getString(1));
        }
        return examidList;
                
        }

}
