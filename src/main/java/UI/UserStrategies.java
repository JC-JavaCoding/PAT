/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.StratManager;
import Backend.StrategyCalculator;
import Backend.UserManager;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Jcj
 */
public class UserStrategies extends javax.swing.JFrame
{

    /**
     * Creates new form UserStrategies
     */
    public UserStrategies()
    {
        initComponents();
        setLocationRelativeTo(null);
        
        DefaultListModel<String> listModel = new DefaultListModel<>();
        String[] savedStrategies = StratManager.getStrategiesAsArray( UserManager.getCurrentUser());
        
        //if the array is not empty:
        if(savedStrategies.length != 0)
        {
            for (String strategie : savedStrategies) //iterating through the array, SUPER COOLLL
            {
                listModel.addElement(strategie);
            }
        }
        else
        {
            //JOptionPane.showMessageDialog(this, "No Strategies found");
            listModel.addElement("No Strategies Available");
        }
        savedStrats_List.setModel(listModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        home_Button = new javax.swing.JButton();
        savedStrats_Label = new javax.swing.JLabel();
        back_Button = new javax.swing.JButton();
        addStrat_Button = new javax.swing.JButton();
        deleteStratButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        savedStrats_List = new javax.swing.JList<>();
        background_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F1Logo.png"))); // NOI18N
        home_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                home_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(home_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 30));

        savedStrats_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        savedStrats_Label.setForeground(new java.awt.Color(33, 33, 33));
        savedStrats_Label.setText("These are your current Saved strategies:");
        getContentPane().add(savedStrats_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 550, 350, 40));

        back_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back_Button.setText("BACK");
        back_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                back_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(back_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 750, 100, -1));

        addStrat_Button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addStrat_Button.setText("ADD");
        addStrat_Button.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addStrat_ButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addStrat_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 610, 100, -1));

        deleteStratButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteStratButton.setText("DELETE");
        deleteStratButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                deleteStratButtonActionPerformed(evt);
            }
        });
        getContentPane().add(deleteStratButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 680, 100, -1));

        savedStrats_List.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        savedStrats_List.setModel(new javax.swing.AbstractListModel<String>()
        {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        savedStrats_List.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(savedStrats_List);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 410, 180));

        background_Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/F1Lights4 - Copy.png"))); // NOI18N
        background_Label.setMaximumSize(new java.awt.Dimension(1290, 1080));
        background_Label.setMinimumSize(new java.awt.Dimension(1290, 1080));
        background_Label.setPreferredSize(new java.awt.Dimension(1290, 1080));
        getContentPane().add(background_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(-235, 0, 1025, 900));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStrat_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addStrat_ButtonActionPerformed
    {//GEN-HEADEREND:event_addStrat_ButtonActionPerformed
        // TODO add your handling code here:
        new User_Tyre_InputScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_addStrat_ButtonActionPerformed

    private void home_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_home_ButtonActionPerformed
    {//GEN-HEADEREND:event_home_ButtonActionPerformed
        // TODO add your handling code here:
        new HomeScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_home_ButtonActionPerformed

    private void back_ButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_back_ButtonActionPerformed
    {//GEN-HEADEREND:event_back_ButtonActionPerformed
        // TODO add your handling code here:
        new PathChoice().setVisible(true);
        dispose();
    }//GEN-LAST:event_back_ButtonActionPerformed

    private void deleteStratButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_deleteStratButtonActionPerformed
    {//GEN-HEADEREND:event_deleteStratButtonActionPerformed
        // TODO add your handling code here:
        //if the user has selected a strategy:
        if (savedStrats_List.getSelectedValue() != null)
        {
            String stratSelected = savedStrats_List.getSelectedValue();
            StratManager.deleteStrategy(stratSelected, UserManager.getCurrentUser());

            //setting the outputlist as the one was now deleted.
            DefaultListModel<String> listModel = new DefaultListModel<>();
            String[] savedStrategies = StratManager.getStrategiesAsArray( UserManager.getCurrentUser());

            for(int i = 0; i < savedStrategies.length; i++)
            {
                System.out.println(savedStrategies[i]);
            }
            //if the array is not empty:
            if(savedStrategies.length != 0)
            {
                System.out.println("In If Statement: USERSTRATEGIES");
                for (String strategie : savedStrategies) //iterating through the array, SUPER COOLLL
                {
                    listModel.addElement(strategie);
                }
            }
            else
            {
                listModel.addElement("No Strategies Available");
            }
            savedStrats_List.setModel(listModel);
        }
    }//GEN-LAST:event_deleteStratButtonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStrat_Button;
    private javax.swing.JButton back_Button;
    private javax.swing.JLabel background_Label;
    private javax.swing.JButton deleteStratButton;
    private javax.swing.JButton home_Button;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel savedStrats_Label;
    private javax.swing.JList<String> savedStrats_List;
    // End of variables declaration//GEN-END:variables
}