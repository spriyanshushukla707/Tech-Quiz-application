/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.pojo;

import java.util.Objects;

/**
 *
 * @author DELL
 */
public class answerPojo {
    private String Examid;
    private String subject;
    private int qno;
    private String chosenAnswer;
    private String correctAnswer;

    public answerPojo() {
    }

    @Override
    public String toString() {
        return "answerPojo{" + "Examid=" + Examid + ", subject=" + subject + ", qno=" + qno + ", chosenAnswer=" + chosenAnswer + ", correctAnswer=" + correctAnswer + '}';
    }

    public String getExamid() {
        return Examid;
    }

    public void setExamid(String Examid) {
        this.Examid = Examid;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getQno() {
        return qno;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public String getChosenAnswer() {
        return chosenAnswer;
    }

    public void setChosenAnswer(String chosenAnswer) {
        this.chosenAnswer = chosenAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final answerPojo other = (answerPojo) obj;
        if (this.qno != other.qno) {
            return false;
        }
        if (!Objects.equals(this.Examid, other.Examid)) {
            return false;
        }
        if (!Objects.equals(this.subject, other.subject)) {
            return false;
        }
        if (!Objects.equals(this.chosenAnswer, other.chosenAnswer)) {
            return false;
        }
        if (!Objects.equals(this.correctAnswer, other.correctAnswer)) {
            return false;
        }
        return true;
    }

    public answerPojo(String Examid, String subject, int qno, String chosenAnswer, String correctAnswer) {
        this.Examid = Examid;
        this.subject = subject;
        this.qno = qno;
        this.chosenAnswer = chosenAnswer;
        this.correctAnswer = correctAnswer;
    }
    
    
    
}
