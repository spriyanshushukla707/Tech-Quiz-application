/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.gui;

import TechQuizApp.Dao.QuestionDao;
import TechQuizApp.pojo.ExamPojo;
import TechQuizApp.pojo.QuestionPojo;
import TechQuizApp.pojo.QuestionStore;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class EditQuestionFrame extends javax.swing.JFrame {

     private QuestionStore qstore;
     private ExamPojo exam1;
     private int qno,pos=0;
    private HashMap <String,String> options;
    private String question ,option1,option2,option3,option4,correctOption;
    public EditQuestionFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public EditQuestionFrame(ExamPojo exam) {
        
         this();
        this.exam1=exam;
        qstore=new QuestionStore();
        options=new HashMap<>();
        qno=1;
        options.put("Option 1","Answer1");
        options.put("Option 2","Answer2");
        options.put("Option 3","Answer3");
        options.put("Option 4","Answer4");
         LoadQuestions();
         showQuestions();
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        lblQno = new javax.swing.JLabel();
        txtoption1 = new javax.swing.JTextField();
        txtoption2 = new javax.swing.JTextField();
        txtoption3 = new javax.swing.JTextField();
        txtoption4 = new javax.swing.JTextField();
        btnnext = new javax.swing.JButton();
        btncancle = new javax.swing.JButton();
        btndone = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbcorrectOption = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        lblTitle.setBackground(new java.awt.Color(0, 0, 0));
        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 153, 51));

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane1.setViewportView(txtQuestion);

        lblQno.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 153, 51));
        lblQno.setText("ques");

        btnnext.setText("next");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btncancle.setText("cancle");
        btncancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancleActionPerformed(evt);
            }
        });

        btndone.setText("done");
        btndone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoneActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 102));
        jLabel2.setText("CorrectOption");

        jcbcorrectOption.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jcbcorrectOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option 1", "Option 2", "Option 3", "Option 4" }));

        jLabel1.setIcon(new javax.swing.ImageIcon("P:\\java jse note\\java project\\TECH QUIZ APP\\onlineexam\\questionpaper4.jpg")); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 51));
        jLabel4.setText("Option 1");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 51));
        jLabel5.setText("Option 4");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 51));
        jLabel6.setText("Option 3");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 51));
        jLabel7.setText("Option 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(132, 132, 132)
                                .addComponent(jcbcorrectOption, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(txtoption4, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                    .addComponent(txtoption1))
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtoption2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                                        .addGap(139, 139, 139)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(txtoption3))))))
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(75, 75, 75)
                                        .addComponent(btncancle, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(62, 62, 62)
                                        .addComponent(btndone, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(213, 213, 213)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblusername, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtoption2)
                    .addComponent(txtoption1))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtoption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtoption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbcorrectOption, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndone)
                    .addComponent(btncancle)
                    .addComponent(btnnext))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        if(inputvalidate()==false)
        {
            JOptionPane.showMessageDialog(null,"Please fill all details about Questions","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        QuestionPojo qp=new QuestionPojo();
        correctOption=(String)jcbcorrectOption.getSelectedItem();
        String Optionname=options.get(correctOption);
        qp.setExamId(exam1.getExamid());
        qp.setAnswer1(option1);
        qp.setAnswer2(option2);
        qp.setAnswer3(option3);
        qp.setAnswer4(option4);
        qp.setCorrectAnswer(Optionname);
        qp.setQno(qno);
        qp.setQuestion(question);
        qp.setLanguage(exam1.getLanguage());
        //System.out.println(qp);
        QuestionPojo que=qstore.getQuestion(pos);
        //System.out.println(qstore);
        if(comparequestion(que,qp)==false)
        {
            qstore.removeQuestion(pos);
            qstore.setQuestionAt(pos,qp);
            //System.out.println(que);
            //System.out.println(qp);
            //System.out.println(qstore);
        }
        pos++;
        if(pos>=qstore.getCount())
        {
            pos=0;
        }
        qno++;
        if(qno>qstore.getCount())
        {
            qno=1;
        }
        lblQno.setText("Question no "+qno);
        showQuestions();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btncancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancleActionPerformed
        AdminOptionFrame adminf=new AdminOptionFrame();
        this.dispose();
        adminf.setVisible(true);
    }//GEN-LAST:event_btncancleActionPerformed

    private void btndoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoneActionPerformed
       if(inputvalidate()==false)
        {
            JOptionPane.showMessageDialog(null,"Please fill all details about Questions","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        QuestionPojo qp=new QuestionPojo();
        correctOption=(String)jcbcorrectOption.getSelectedItem();
        String Optionname=options.get(correctOption);
        qp.setExamId(exam1.getExamid());
        qp.setAnswer1(option1);
        qp.setAnswer2(option2);
        qp.setAnswer3(option3);
        qp.setAnswer4(option4);
        qp.setCorrectAnswer(Optionname);
        qp.setQno(qno);
        qp.setQuestion(question);
        qp.setLanguage(exam1.getLanguage());
        //System.out.println(qp);
        QuestionPojo que=qstore.getQuestion(pos);
        //System.out.println(qstore);
        if(comparequestion(que,qp)==false)
        {
            qstore.removeQuestion(pos);
            qstore.setQuestionAt(pos,qp);
            //System.out.println(que);
            //System.out.println(qp);
            //System.out.println(qstore);
        }
        
        if(JOptionPane.YES_OPTION==JOptionPane.showConfirmDialog(null,"Are You Sure You Want To Submit","Confirmantion",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE))
        {
            try
            {
                QuestionDao.updateQuestion(qstore,exam1.getExamid());
                JOptionPane.showMessageDialog(null,"Your Question Edit Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                AdminOptionFrame fr=new AdminOptionFrame();
                this.dispose();
                fr.setVisible(true);
            }
            catch(Exception ex)
            {
                JOptionPane.showMessageDialog(null,"Error with Databse ","Error",JOptionPane.ERROR_MESSAGE);
                ex.printStackTrace();
            }

        
        }
       

    }//GEN-LAST:event_btndoneActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuestionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuestionFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancle;
    private javax.swing.JButton btndone;
    private javax.swing.JButton btnnext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbcorrectOption;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextArea txtQuestion;
    private javax.swing.JTextField txtoption1;
    private javax.swing.JTextField txtoption2;
    private javax.swing.JTextField txtoption3;
    private javax.swing.JTextField txtoption4;
    // End of variables declaration//GEN-END:variables
private void LoadQuestions()
{
    try
    {
        ArrayList<QuestionPojo>qlist=QuestionDao.getQuestbyExamid(exam1.getExamid());
        for(QuestionPojo obj:qlist)
        {
            qstore.addQuestion(obj);
            System.out.println("a");
        }
       
    }
    catch(SQLException ex)
    {
        JOptionPane.showMessageDialog(null,"Error with Database ","Exception", JOptionPane.ERROR_MESSAGE);
        return ;
    }
    
}
private void  showQuestions()
{
    
    QuestionPojo question =qstore.getQuestion(pos);
     txtQuestion.setText(question.getQuestion());
     txtoption1.setText(question.getAnswer1());
     txtoption2.setText(question.getAnswer2());
     txtoption3.setText(question.getAnswer3());
     txtoption4.setText(question.getAnswer4());
     lblQno.setText("Question no:"+(qno));
     String correctans=question.getCorrectAnswer();
     switch(correctans)
     {
         case "Answer1":
         jcbcorrectOption.setSelectedIndex(0);
          break;
         case "Answer2":
         jcbcorrectOption.setSelectedIndex(1);
          break;
         case "Answer3":
         jcbcorrectOption.setSelectedIndex(2);
          break;
         case "Answer4":
         jcbcorrectOption.setSelectedIndex(3);
          break;
     }
}

    public boolean inputvalidate()
    {
        question=txtQuestion.getText().trim();
        option1=txtoption1.getText().trim();
        option2=txtoption2.getText().trim();
        option3=txtoption3.getText().trim();
        option4=txtoption4.getText().trim();
        correctOption=(String)jcbcorrectOption.getSelectedItem();
        if(question.isEmpty()||option1.isEmpty()||option1.isEmpty()||option2.isEmpty()||option3.isEmpty()||option4.isEmpty())
        {
            return false;
        }
        else
            return true;
    }
public boolean comparequestion(QuestionPojo poj,QuestionPojo poj2)
{
    if(poj.getCorrectAnswer().equals(poj2.getCorrectAnswer())&&poj.getAnswer1().equals(poj2.getAnswer1())&&poj.getAnswer2().equals(poj2.getAnswer2())
            &&poj.getAnswer3().equals(poj2.getAnswer3())&&poj.getAnswer4().equals(poj2.getAnswer4())&&poj.getQuestion().equalsIgnoreCase(poj2.getQuestion()))
        return true;
    else
        return false;
    
}
}
