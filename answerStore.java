/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.pojo;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class answerStore {
    ArrayList<answerPojo> answerlist;
public answerStore(){
    answerlist=new ArrayList<>();
} 
public void addAnswer(answerPojo answer){
    answerlist.add(answer);
}
public answerPojo getAnswer(int pos){
  return answerlist.get(pos);
}
public void removeAnswer(int pos){
    answerlist.remove(pos);
}
 public void setAnswerAt(int pos,answerPojo answer){
     answerlist.add(pos,answer);
 } 
 public ArrayList<answerPojo> getAllAnswer(){
     return answerlist;
 }
 public int getcount(){
     return answerlist.size();
 }
 public answerPojo getAnswerByQno(int qno){
  for(answerPojo answer:answerlist){
     if(answer.getQno()==qno){
         return answer;
     } 
  } 
return null;  
 }
 public int removeAnswer(answerPojo answer){
     int pos=answerlist.indexOf(answer);
     return pos;
 }
    
}
