/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.Dao;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.QuestionPojo;
import TechQuizApp.pojo.QuestionStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;


public class QuestionDao {
    public static void addQuestion(QuestionStore Qs)throws SQLException
    {
        ArrayList<QuestionPojo>qList=Qs.getAllQuestion();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("insert into questions values(?,?,?,?,?,?,?,?,?)");
       for(QuestionPojo obj:qList)
       {
           ps.setString(1, obj.getExamId());
           ps.setInt(2, obj.getQno());
           ps.setString(3,obj.getQuestion());
           ps.setString(4,obj.getAnswer1());
           ps.setString(5,obj.getAnswer2());
           ps.setString(6,obj.getAnswer3());
           ps.setString(7,obj.getAnswer4());
           ps.setString(8,obj.getCorrectAnswer());
           ps.setString(9, obj.getLanguage());
           ps.executeUpdate();
       

       }
      }
     public static ArrayList<QuestionPojo> getQuestbyExamid(String examId)throws SQLException{
           
     
        ArrayList<QuestionPojo> qlist=new ArrayList<>();
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from Questions where examId=? order by qno");
        ps.setString(1, examId);
        ResultSet rs= ps.executeQuery();
        while(rs.next()){
            int qno=rs.getInt(2);
            String examid=rs.getString(1);
            String question=rs.getString(3);
            String ans1=rs.getString(4);
            String ans2=rs.getString(5);
            String ans3=rs.getString(6);
            String ans4=rs.getString(7);
            String correctans=rs.getString(8);
            String language=rs.getString(9);
            QuestionPojo qp=new QuestionPojo();
            qp.setExamId(examid);
            qp.setQno(qno);
            qp.setQuestion(question);
            qp.setAnswer1(ans1);
             qp.setAnswer2(ans2);
              qp.setAnswer3(ans3);
               qp.setAnswer4(ans4);
               qp.setCorrectAnswer(correctans);
               qlist.add(qp);
               System.out.println("1");
              
        }
        return qlist;
    }

    public static void updateQuestion(QuestionStore qs,String exid) throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("update questions set questions=?,Answer1=?,Answer2=?,Answer3=?,Answer4=?,correct_answer=?,language=? where examid=? and Qno=?");
        ArrayList<QuestionPojo> alist=qs.getAllQuestion();
        Iterator itr=alist.iterator();
        while(itr.hasNext())
        {
            QuestionPojo qp=(QuestionPojo)itr.next();
            ps.setString(8,qp.getExamId());
            ps.setInt(9,qp.getQno());
            ps.setString(1,qp.getQuestion());
            ps.setString(2,qp.getAnswer1());
            ps.setString(3,qp.getAnswer2());
            ps.setString(4,qp.getAnswer3());
            ps.setString(5,qp.getAnswer4());
            ps.setString(6,qp.getCorrectAnswer());
            ps.setString(7,qp.getLanguage());
            ps.executeUpdate(); 
        }        
    }
}
