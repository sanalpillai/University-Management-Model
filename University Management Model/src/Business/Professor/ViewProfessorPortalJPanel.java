/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Business.Professor;

import Business.Student.Enrollment;
import Business.Student.EnrollmentHistory;
import Business.Student.StudentLoginHistory;
import Business.Student.studentLogin;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author anzal
 */
public class ViewProfessorPortalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewProfessorPortalJPanel
     */
   
    private ProfessorLogin loggedinUser;
    javax.swing.JPanel workArea;
    ProfessorLoginHistory history1;
    CourseHistory c_history;
    private Course cos;
    StudentLoginHistory history;
    private studentLogin loggedInUser;
    EnrollmentHistory enrollmentList;
    private Enrollment enroll;
    
    public ViewProfessorPortalJPanel(JPanel workArea, ProfessorLoginHistory history1 , ProfessorLogin loggedinUser,CourseHistory c_history,Course cos,StudentLoginHistory history,studentLogin loggedInUser,EnrollmentHistory enrollmentList,Enrollment enroll) {
    
        initComponents();
        this.workArea = workArea;
        this.history1 = history1;
        this.loggedinUser = loggedinUser;
        this.c_history = c_history;
        this.cos = cos;
        this.loggedInUser = loggedInUser;
        this.enrollmentList = enrollmentList;
        this.enroll = enroll;
        this.history = history;
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

        btnManageCourse = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnViewAccount = new javax.swing.JButton();
        btnManageAccount = new javax.swing.JButton();
        btnDeleteAccount = new javax.swing.JButton();
        btnCreateCourse = new javax.swing.JButton();
        btnManageGradeStudent = new javax.swing.JButton();
        btnAnnouncements = new javax.swing.JButton();

        btnManageCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/catalogue.png"))); // NOI18N
        btnManageCourse.setText("Manage Course Catalog");
        btnManageCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCourseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VIEW PROFESSOR PORTAL");

        btnViewAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/profile.png"))); // NOI18N
        btnViewAccount.setText("View Account");
        btnViewAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAccountActionPerformed(evt);
            }
        });

        btnManageAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/admin.png"))); // NOI18N
        btnManageAccount.setText("Manage Account");
        btnManageAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageAccountActionPerformed(evt);
            }
        });

        btnDeleteAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/user.png"))); // NOI18N
        btnDeleteAccount.setText("Delete Account");
        btnDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAccountActionPerformed(evt);
            }
        });

        btnCreateCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/teacher.png"))); // NOI18N
        btnCreateCourse.setText("Create Course");
        btnCreateCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCourseActionPerformed(evt);
            }
        });

        btnManageGradeStudent.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/graduated.png"))); // NOI18N
        btnManageGradeStudent.setText("Manage Students ");
        btnManageGradeStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageGradeStudentActionPerformed(evt);
            }
        });

        btnAnnouncements.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Business/icons/megaphone.png"))); // NOI18N
        btnAnnouncements.setText("Post Announcements");
        btnAnnouncements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnnouncementsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCourse, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAnnouncements, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnManageGradeStudent))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnViewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAnnouncements, btnCreateCourse, btnDeleteAccount, btnManageAccount, btnManageCourse, btnManageGradeStudent, btnViewAccount});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManageAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnViewAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(btnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnCreateCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnManageCourse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnManageGradeStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(btnAnnouncements, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(5570, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAnnouncements, btnCreateCourse, btnDeleteAccount, btnManageAccount, btnManageCourse, btnManageGradeStudent, btnViewAccount});

    }// </editor-fold>//GEN-END:initComponents

    private void btnManageCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCourseActionPerformed
        // TODO add your handling code here:
        
        ManageCourseCatalogJPanel panel = new ManageCourseCatalogJPanel(workArea,history1,loggedinUser,c_history,cos,history,loggedInUser,enrollmentList,enroll);
        workArea.add("ManageCourseCatalogJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnManageCourseActionPerformed

    private void btnViewAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAccountActionPerformed
        // TODO add your handling code here:
        
        ViewProfessorAccountJPanel panel = new ViewProfessorAccountJPanel(workArea,history1,loggedinUser,c_history,cos,history,loggedInUser,enrollmentList,enroll);
        workArea.add("ViewProfessorAccountJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
        
    }//GEN-LAST:event_btnViewAccountActionPerformed

    private void btnManageAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageAccountActionPerformed
        // TODO add your handling code here:
        
        ManageProfessorAccountJPanel panel = new ManageProfessorAccountJPanel(workArea,history1,loggedinUser,c_history,cos,history,loggedInUser,enrollmentList,enroll);
        workArea.add("ManageProfessorAccountJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnManageAccountActionPerformed

    private void btnDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAccountActionPerformed
        // TODO add your handling code here:
        
       
        int dailogButton = JOptionPane.YES_NO_OPTION;
            int dailogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the account details?","Warning",dailogButton);
            
            if(dailogResult == JOptionPane.YES_OPTION){
        
        
        history1.deleteStudent(loggedinUser);
        history1.refreshHistory();
        
        JOptionPane.showMessageDialog(this, "Professor deleted Successfully");
            }
        
       ProfessorLoginPageJPanel panel = new ProfessorLoginPageJPanel(workArea,history1,loggedinUser,c_history,cos,history,loggedInUser,enrollmentList,enroll);
        workArea.add("ProfessorLoginPageJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnDeleteAccountActionPerformed

    private void btnCreateCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCourseActionPerformed
        // TODO add your handling code here:
        
        CreateCourseJPanel panel = new CreateCourseJPanel(workArea,history1,loggedinUser,c_history,cos,history,loggedInUser,enrollmentList,enroll);
        workArea.add("CreateCourseJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        
    }//GEN-LAST:event_btnCreateCourseActionPerformed

    private void btnManageGradeStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageGradeStudentActionPerformed
        // TODO add your handling code here:
        
    ManageGradeStudentProfessorJPanel panel = new ManageGradeStudentProfessorJPanel(workArea, history1, loggedinUser, c_history, cos, history, loggedInUser, enrollmentList, enroll);
    workArea.add("ManageGradeStudentProfessorJPanel", panel);
    CardLayout layout = (CardLayout) workArea.getLayout();
    layout.next(workArea);
        
    }//GEN-LAST:event_btnManageGradeStudentActionPerformed

    private void btnAnnouncementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnnouncementsActionPerformed
        // TODO add your handling code here:
        
    AnnouncementPostingJPanel panel = new AnnouncementPostingJPanel(workArea, history1, loggedinUser, c_history, cos, history, loggedInUser, enrollmentList, enroll);
    workArea.add("AnnouncementPostingJPanel", panel);
    CardLayout layout = (CardLayout) workArea.getLayout();
    layout.next(workArea);
        
    }//GEN-LAST:event_btnAnnouncementsActionPerformed

    private void customizeComponents() {
        // Set background color
        this.setBackground(new Color(44, 62, 80));

        // Set font and text color for labels
        Font labelFont = new Font("Tahoma", Font.BOLD, 12);
        Color textColor = new Color(236, 240, 241);

        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 28));
        jLabel1.setForeground(textColor);

        // Set button style
        Color buttonBackground = new Color(52, 152, 219);
        Color buttonTextColor = new Color(255, 255, 255);
        Border buttonBorder = BorderFactory.createEmptyBorder(10, 25, 10, 25);

        btnManageCourse.setBackground(buttonBackground);
        btnManageCourse.setForeground(buttonTextColor);
        btnManageCourse.setBorder(buttonBorder);
        btnViewAccount.setBackground(buttonBackground);
        btnViewAccount.setForeground(buttonTextColor);
        btnViewAccount.setBorder(buttonBorder);
        btnManageAccount.setBackground(buttonBackground);
        btnManageAccount.setForeground(buttonTextColor);
        btnManageAccount.setBorder(buttonBorder);
        btnDeleteAccount.setBackground(buttonBackground);
        btnDeleteAccount.setForeground(buttonTextColor);
        btnDeleteAccount.setBorder(buttonBorder);
        btnCreateCourse.setBackground(buttonBackground);
        btnCreateCourse.setForeground(buttonTextColor);
        btnCreateCourse.setBorder(buttonBorder);
        btnManageGradeStudent.setBackground(buttonBackground);
        btnManageGradeStudent.setForeground(buttonTextColor);
        btnManageGradeStudent.setBorder(buttonBorder);
        btnAnnouncements.setBackground(buttonBackground);
        btnAnnouncements.setForeground(buttonTextColor);
        btnAnnouncements.setBorder(buttonBorder);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnnouncements;
    private javax.swing.JButton btnCreateCourse;
    private javax.swing.JButton btnDeleteAccount;
    private javax.swing.JButton btnManageAccount;
    private javax.swing.JButton btnManageCourse;
    private javax.swing.JButton btnManageGradeStudent;
    private javax.swing.JButton btnViewAccount;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
