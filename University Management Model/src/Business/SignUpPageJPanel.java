/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business;

import Business.Admin.ManageAdminJPanel;
import Business.Professor.ProfessorLogin;
import Business.Professor.ProfessorLoginHistory;
import Business.Professor.ProfesssorSignUpJPanel;
import Business.Student.StudentLoginHistory;
import Business.Student.StudentSignUpJPanel;
import Business.Student.studentLogin;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author anzal
 */
public class SignUpPageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpPageJPanel
     */
    
    javax.swing.JPanel workArea;
    StudentLoginHistory history;
    ProfessorLoginHistory history1;
    ProfessorLogin loggedinUser;
    studentLogin loggedInUser;
    
    public SignUpPageJPanel(StudentLoginHistory history,JPanel ssu,ProfessorLoginHistory history1,ProfessorLogin loggedinUser,studentLogin loggedInUser) {
        this.history = history;
        this.workArea = ssu;
        this.history1 = history1;
        this.loggedinUser = loggedinUser;
        this.loggedInUser = loggedInUser;
        initComponents();
        customizeComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnStudSignup = new javax.swing.JButton();
        btnPofSignup = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SIGNUP PAGE");

        btnStudSignup.setText("Student Sign-Up");
        btnStudSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudSignupActionPerformed(evt);
            }
        });

        btnPofSignup.setText("Professor Sign-Up");
        btnPofSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPofSignupActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/signup_1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPofSignup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStudSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(625, 625, 625))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPofSignup, btnStudSignup});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(btnStudSignup)
                .addGap(18, 18, 18)
                .addComponent(btnPofSignup)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPofSignup, btnStudSignup});

    }// </editor-fold>//GEN-END:initComponents

    private void btnStudSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudSignupActionPerformed
        // TODO add your handling code here:
        
        StudentSignUpJPanel panel = new StudentSignUpJPanel(history,workArea,loggedInUser);
        workArea.add("StudentSignUpJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnStudSignupActionPerformed

    private void btnPofSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPofSignupActionPerformed
        // TODO add your handling code here:
        ProfesssorSignUpJPanel panel = new ProfesssorSignUpJPanel(workArea,history1,loggedinUser);
        workArea.add("ProfesssorSignUpJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnPofSignupActionPerformed

    private void customizeComponents() {
        // Set background color
        this.setBackground(new Color(44, 62, 80));

        // Set font and text color for labels
        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 28));
        jLabel1.setForeground(new Color(236, 240, 241));

        // Set button style
        customizeButton(btnStudSignup);
        customizeButton(btnPofSignup);
    }

    private void customizeButton(javax.swing.JButton button) {
        button.setBackground(new Color(52, 152, 219));
        button.setForeground(new Color(255, 255, 255));
        button.setBorder(BorderFactory.createEmptyBorder(10, 25, 10, 25));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPofSignup;
    private javax.swing.JButton btnStudSignup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}