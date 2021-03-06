/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.UserManager;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class UserLogin extends javax.swing.JFrame
{

    /**
     * Creates new form UserLogin
     */
    public UserLogin()
    {
        initComponents();
        setLocationRelativeTo(null);
    }
    public static String currUser;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUsers_Label = new javax.swing.JLabel();
        userPassword_Field = new javax.swing.JPasswordField();
        username_Field = new javax.swing.JTextField();
        addUsers_Label1 = new javax.swing.JLabel();
        login_Button = new javax.swing.JButton();
        back_Button = new javax.swing.JButton();
        addUser_Button = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addUsers_Label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addUsers_Label.setForeground(new java.awt.Color(33, 33, 33));
        addUsers_Label.setText("Password");
        getContentPane().add(addUsers_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 620, -1, -1));

        userPassword_Field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPassword_FieldActionPerformed(evt);
            }
        });
        getContentPane().add(userPassword_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 650, 610, -1));
        getContentPane().add(username_Field, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 610, -1));

        addUsers_Label1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        addUsers_Label1.setForeground(new java.awt.Color(33, 33, 33));
        addUsers_Label1.setText("User");
        getContentPane().add(addUsers_Label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        login_Button.setText("Log In");
        login_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(login_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 700, -1, -1));

        back_Button.setText("Back");
        back_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 700, -1, -1));

        addUser_Button.setBackground(new java.awt.Color(102, 255, 255));
        addUser_Button.setForeground(new java.awt.Color(33, 33, 33));
        addUser_Button.setText("Add new user");
        addUser_Button.setBorderPainted(false);
        addUser_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUser_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addUser_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 750, -1, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F1Lights2 (2) - Copy.PNG"))); // NOI18N
        getContentPane().add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-230, 0, 1020, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userPassword_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_userPassword_FieldActionPerformed
    {//GEN-HEADEREND:event_userPassword_FieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassword_FieldActionPerformed

    private void login_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_login_ButtonActionPerformed
    {//GEN-HEADEREND:event_login_ButtonActionPerformed
        // TODO add your handling code here:
         currUser = username_Field.getText();
         char [] arr = userPassword_Field.getPassword();
        
        //essentially a .toString method
         String password = "";
        for (int i = 0; i < arr.length; i++) 
         {
            password += arr[i];
         }
        //System.out.println(password);
        //String password = Arrays.toString((userPassword_Field.getPassword()));
        
        if (UserManager.isValid(currUser, password))
        {
            //set current user in current user file
            UserManager.addCurrentUser(currUser);
            
            new PathChoice().setVisible(true);
            
            dispose(); 
        }
        else 
        {
            JOptionPane.showMessageDialog(this, "Username Or Password Incorrect.");
        } 
    }//GEN-LAST:event_login_ButtonActionPerformed

    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_back_ButtonActionPerformed
    {//GEN-HEADEREND:event_back_ButtonActionPerformed
        // TODO add your handling code here:
        new HomeScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_ButtonActionPerformed

    private void addUser_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addUser_ButtonActionPerformed
    {//GEN-HEADEREND:event_addUser_ButtonActionPerformed
        // TODO add your handling code here:
        new AddUserScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_addUser_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addUser_Button;
    private javax.swing.JLabel addUsers_Label;
    private javax.swing.JLabel addUsers_Label1;
    private javax.swing.JButton back_Button;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JButton login_Button;
    private javax.swing.JPasswordField userPassword_Field;
    private javax.swing.JTextField username_Field;
    // End of variables declaration//GEN-END:variables
}
//