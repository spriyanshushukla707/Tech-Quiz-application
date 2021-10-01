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
public class performancePojo {
    private String examId;
    private String Language;
    private String userId;
    private int right;
    private int wrong;
    private int unattempted;
    private double per;

    public String getExamId() {
        return examId;
    }

    public performancePojo() {
    }

    public performancePojo(String examId, String Language, String userId, int right, int wrong, int unattempted, double per) {
        this.examId = examId;
        this.Language = Language;
        this.userId = userId;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.per = per;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }
    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getRight() {
        return right;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public int getWrong() {
        return wrong;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    @Override
    public String toString() {
        return "performancePojo{" + "examId=" + examId + ", Language=" + Language + ", userId=" + userId + ", right=" + right + ", wrong=" + wrong + ", unattempted=" + unattempted + ", per=" + per + '}';
    }
    
}
