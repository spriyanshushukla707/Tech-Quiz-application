/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.pojo;

/**
 *
 * @author DELL
 */
public class ExamPojo {
    private String examid;
    private String language;
    private int totalquestion;

    public ExamPojo(String examid, String language, int totalquestion) {
        this.examid = examid;
        this.language = language;
        this.totalquestion = totalquestion;
    }

    public String getExamid() {
        return examid;
    }

    public ExamPojo(String examid, String language) {
        this.examid = examid;
        this.language = language;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getTotalquestion() {
        return totalquestion;
    }

    public void setTotalquestion(int totalquestion) {
        this.totalquestion = totalquestion;
    }
    
    
}
