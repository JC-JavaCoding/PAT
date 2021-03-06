/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Experimenting.UI;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author janch
 */
public class Stint2 extends javax.swing.JFrame
{
    public static String folderName, stintFilePath;
    private String stintType, stintCompound;
    private double fuelload, laptime;
    private int tyreAge, stintLaps = 0;
    private FileWriter fw;
    private DefaultTableModel tableModel, overviewTableModel ;
    /**
     * Creates new form Stint2
     */
    public Stint2()
    {
        initComponents();
        tableModel = (DefaultTableModel) lapsDataTable.getModel();
        overviewTableModel = (DefaultTableModel) lapsDataTableOverview.getModel();
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        stintInfo_Pane = new javax.swing.JPanel();
        stintName_Label = new javax.swing.JLabel();
        stintName_Field = new javax.swing.JTextField();
        provideInfo_Label = new javax.swing.JLabel();
        stintCompound_Label = new javax.swing.JLabel();
        tyreCompoundComboBox = new javax.swing.JComboBox<>();
        stintType_Label = new javax.swing.JLabel();
        stintType_ComboBox = new javax.swing.JComboBox<>();
        fuelLoad_Label = new javax.swing.JLabel();
        startFuelLoad_Field = new javax.swing.JTextField();
        tyreAgeLabel = new javax.swing.JLabel();
        tyreAgeSpinner = new javax.swing.JSpinner();
        createStintButton = new javax.swing.JButton();
        lapDataPane = new javax.swing.JPanel();
        panelHeader_Label = new javax.swing.JLabel();
        lapDataFuelLoad_label = new javax.swing.JLabel();
        lapFuelLoad_Field = new javax.swing.JTextField();
        lapTime_Label = new javax.swing.JLabel();
        laptime_Field = new javax.swing.JTextField();
        addLapButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lapsDataTable = new javax.swing.JTable();
        overview_Pane = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lapsDataTableOverview = new javax.swing.JTable();
        overviewHeader_Label = new javax.swing.JLabel();
        numLaps_Label = new javax.swing.JLabel();
        numLapsInStint_Display = new javax.swing.JTextField();
        startingFuel_Label = new javax.swing.JLabel();
        startingFuel_DisplayField = new javax.swing.JTextField();
        stintLaps_Label = new javax.swing.JLabel();
        confirmStrat_Button = new javax.swing.JButton();
        back_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        stintName_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        stintName_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stintName_Label.setText("Please provide a name for your stint.");

        provideInfo_Label.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        provideInfo_Label.setForeground(new java.awt.Color(153, 153, 153));
        provideInfo_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        provideInfo_Label.setText("Please provide info for your stint");

        stintCompound_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stintCompound_Label.setText("Stint Compound");

        tyreCompoundComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soft", "Medium", "Hard" }));
        tyreCompoundComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                tyreCompoundComboBoxActionPerformed(evt);
            }
        });

        stintType_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stintType_Label.setText("Stint Type");

        stintType_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Qualifying", "Race Pace", "Development" }));
        stintType_ComboBox.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                stintType_ComboBoxActionPerformed(evt);
            }
        });

        fuelLoad_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fuelLoad_Label.setText("Fuel Load (kg)");

        tyreAgeLabel.setText("Tyre Age (laps)");

        tyreAgeSpinner.addChangeListener(new javax.swing.event.ChangeListener()
        {
            public void stateChanged(javax.swing.event.ChangeEvent evt)
            {
                tyreAgeSpinnerStateChanged(evt);
            }
        });

        createStintButton.setText("Create Stint");
        createStintButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                createStintButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stintInfo_PaneLayout = new javax.swing.GroupLayout(stintInfo_Pane);
        stintInfo_Pane.setLayout(stintInfo_PaneLayout);
        stintInfo_PaneLayout.setHorizontalGroup(
            stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stintInfo_PaneLayout.createSequentialGroup()
                .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stintInfo_PaneLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(stintName_Field)
                            .addComponent(provideInfo_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                            .addGroup(stintInfo_PaneLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fuelLoad_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tyreCompoundComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(startFuelLoad_Field)
                                    .addComponent(stintCompound_Label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(stintType_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tyreAgeSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(stintType_ComboBox, 0, 1, Short.MAX_VALUE)
                                    .addComponent(tyreAgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(54, 54, 54))))
                    .addGroup(stintInfo_PaneLayout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(createStintButton)))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(stintInfo_PaneLayout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(stintName_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                    .addGap(54, 54, 54)))
        );
        stintInfo_PaneLayout.setVerticalGroup(
            stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stintInfo_PaneLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(stintName_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(provideInfo_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stintCompound_Label)
                    .addComponent(tyreAgeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tyreCompoundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tyreAgeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuelLoad_Label)
                    .addComponent(stintType_Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stintType_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(startFuelLoad_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(createStintButton)
                .addGap(103, 103, 103))
            .addGroup(stintInfo_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(stintInfo_PaneLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(stintName_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(345, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Stint information", stintInfo_Pane);

        panelHeader_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        panelHeader_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelHeader_Label.setText("Add Lap Data to System");

        lapDataFuelLoad_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lapDataFuelLoad_label.setText("Fuel Load (kg)");

        lapTime_Label.setText("Lap Time (seconds)");

        laptime_Field.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                laptime_FieldActionPerformed(evt);
            }
        });

        addLapButton1.setText("Add Lap");
        addLapButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                addLapButton1ActionPerformed(evt);
            }
        });

        lapsDataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String []
            {
                "Lap", "Time"
            }
        ));
        jScrollPane2.setViewportView(lapsDataTable);

        javax.swing.GroupLayout lapDataPaneLayout = new javax.swing.GroupLayout(lapDataPane);
        lapDataPane.setLayout(lapDataPaneLayout);
        lapDataPaneLayout.setHorizontalGroup(
            lapDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lapDataPaneLayout.createSequentialGroup()
                .addGroup(lapDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lapDataPaneLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(lapDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lapDataFuelLoad_label, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                            .addComponent(lapFuelLoad_Field))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addGroup(lapDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laptime_Field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lapTime_Label, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(lapDataPaneLayout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(addLapButton1)))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lapDataPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(lapDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelHeader_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(27, 27, 27))
        );
        lapDataPaneLayout.setVerticalGroup(
            lapDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lapDataPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelHeader_Label, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lapDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lapTime_Label)
                    .addComponent(lapDataFuelLoad_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lapDataPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laptime_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lapFuelLoad_Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addLapButton1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        jTabbedPane2.addTab("Lap Data", lapDataPane);

        lapsDataTableOverview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String []
            {
                "Lap", "Time"
            }
        ));
        jScrollPane3.setViewportView(lapsDataTableOverview);

        overviewHeader_Label.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        overviewHeader_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        overviewHeader_Label.setText("Just a quick overview before you go:");

        numLaps_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        numLaps_Label.setText("Number of laps in the stint:");

        numLapsInStint_Display.setEditable(false);

        startingFuel_Label.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        startingFuel_Label.setText("Starting fuel amount:");

        startingFuel_DisplayField.setEditable(false);

        stintLaps_Label.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        stintLaps_Label.setForeground(new java.awt.Color(153, 153, 153));
        stintLaps_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stintLaps_Label.setText("Stint Laps:");

        confirmStrat_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        confirmStrat_Button.setText("CONFIRM");

        back_Button.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        back_Button.setText("BACK");

        javax.swing.GroupLayout overview_PaneLayout = new javax.swing.GroupLayout(overview_Pane);
        overview_Pane.setLayout(overview_PaneLayout);
        overview_PaneLayout.setHorizontalGroup(
            overview_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overview_PaneLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(overview_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(stintLaps_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(overviewHeader_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                    .addGroup(overview_PaneLayout.createSequentialGroup()
                        .addGroup(overview_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numLaps_Label)
                            .addComponent(startingFuel_Label))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(overview_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numLapsInStint_Display)
                            .addComponent(startingFuel_DisplayField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overview_PaneLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(back_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmStrat_Button)
                .addGap(55, 55, 55))
        );
        overview_PaneLayout.setVerticalGroup(
            overview_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, overview_PaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(overviewHeader_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(overview_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numLaps_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numLapsInStint_Display, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(overview_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(startingFuel_Label)
                    .addComponent(startingFuel_DisplayField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(stintLaps_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(overview_PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmStrat_Button)
                    .addComponent(back_Button))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Overview", overview_Pane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*this is basically backend stuffs but as this class is in the experimenting folder im not gonna work it into the backend yet*/
    private void setTable()
    {
         tableModel.addRow(new Object[]{"" + fuelload, "" + laptime});
         overviewTableModel.addRow(new Object[]{"" + fuelload, "" + laptime});
    }
    
    private void tyreCompoundComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tyreCompoundComboBoxActionPerformed
    {//GEN-HEADEREND:event_tyreCompoundComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tyreCompoundComboBoxActionPerformed

    private void stintType_ComboBoxActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_stintType_ComboBoxActionPerformed
    {//GEN-HEADEREND:event_stintType_ComboBoxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_stintType_ComboBoxActionPerformed

    private void createStintButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_createStintButtonActionPerformed
    {//GEN-HEADEREND:event_createStintButtonActionPerformed
        //get folder name/ raceweekend name
        try
        {
             Scanner sc = new Scanner(new File("data\\currFolder.txt")).useDelimiter("#");
             folderName = sc.next();
             sc.close();
        } catch (FileNotFoundException ex)
        {
            System.out.println("FileNotFoundException at stint 2 scanner");
        }
        /*error checking*/
        //System.out.println(folderName + "\\"+ stintName_Field.getText() +".txt");
        
        //create file
        stintFilePath = "data\\"+ folderName +"\\"+ stintName_Field.getText() +".txt";
        File dataFile = new File(stintFilePath);
        
        //addInfo to data file
        stintCompound = tyreCompoundComboBox.getSelectedItem().toString();
        stintType = stintType_ComboBox.getSelectedItem().toString();
        tyreAge = Integer.parseInt(tyreAgeSpinner.getValue().toString());
        try
        {
            fw = new FileWriter(dataFile, true);
            
            /*the data to save in the stint file:
            - MAIN INFORMATION -
            * compoundType
            * stintType
            
            - CHANGING INFORMATION -
            * fuelLoad
            * laptime
            * tyreAge
            * lapsInStint
            
            + FORMAT +
            compound#stintType#
            fuelLoad#laptime#tyreAge#lapsNr
            fuelLoad#laptime#tyreAge#lapsNr
            */
            
            String introData = stintCompound +"#"+ stintType +"\n";
            fw.append(introData);
            
            fw.close();
        }
        catch(java.io.IOException e)
        {
            System.out.println("File not found");
            e.printStackTrace();
        }
    }//GEN-LAST:event_createStintButtonActionPerformed

    private void addLapButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_addLapButton1ActionPerformed
    {//GEN-HEADEREND:event_addLapButton1ActionPerformed
        // TODO add your handling code here:
        laptime = Double.parseDouble(laptime_Field.getText());
        /*NOTE exception handling for users needed*/
        
        
        fuelload = Double.parseDouble(lapFuelLoad_Field.getText());
        stintLaps ++; //asuming ther appropriate values have been input by the user
        tyreAge ++;
        //add laptime, fuelload, numlaps to stint file
        try 
        {
            fw = new FileWriter(new File(stintFilePath), true);
            
            //unnecessary but for readability: 
            // Format fuelLoad#laptime#tyreAge#lapsNr
            String lapInformation = fuelload +"#"+ laptime +"#"+ tyreAge +"#"+ stintLaps +"\n";
            fw.append(lapInformation);
            
//add lap data to table:
            setTable();
            
            fw.close();
        }
        catch(java.io.IOException e)
        {
            System.out.println("java.io.FileNotFoundException at 463, Stint2");
        }
    }//GEN-LAST:event_addLapButton1ActionPerformed

    private void laptime_FieldActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_laptime_FieldActionPerformed
    {//GEN-HEADEREND:event_laptime_FieldActionPerformed
        // TODO add your handling code here:
        /*REDUNDANT*/
    }//GEN-LAST:event_laptime_FieldActionPerformed

    private void tyreAgeSpinnerStateChanged(javax.swing.event.ChangeEvent evt)//GEN-FIRST:event_tyreAgeSpinnerStateChanged
    {//GEN-HEADEREND:event_tyreAgeSpinnerStateChanged
        /*every time the button is clicked, update tyreAge*/
//        Spinner mySpinner = (Spinner)findViewById()
//        tyreAge = Integer.parseInt(tyreAgeSpinner.getName());
    }//GEN-LAST:event_tyreAgeSpinnerStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(Stint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(Stint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(Stint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(Stint2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new Stint2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addLapButton1;
    private javax.swing.JButton back_Button;
    private javax.swing.JButton confirmStrat_Button;
    private javax.swing.JButton createStintButton;
    private javax.swing.JLabel fuelLoad_Label;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lapDataFuelLoad_label;
    private javax.swing.JPanel lapDataPane;
    private javax.swing.JTextField lapFuelLoad_Field;
    private javax.swing.JLabel lapTime_Label;
    public javax.swing.JTable lapsDataTable;
    public javax.swing.JTable lapsDataTableOverview;
    private javax.swing.JTextField laptime_Field;
    private javax.swing.JTextField numLapsInStint_Display;
    private javax.swing.JLabel numLaps_Label;
    private javax.swing.JLabel overviewHeader_Label;
    private javax.swing.JPanel overview_Pane;
    private javax.swing.JLabel panelHeader_Label;
    private javax.swing.JLabel provideInfo_Label;
    private javax.swing.JTextField startFuelLoad_Field;
    private javax.swing.JTextField startingFuel_DisplayField;
    private javax.swing.JLabel startingFuel_Label;
    private javax.swing.JLabel stintCompound_Label;
    private javax.swing.JPanel stintInfo_Pane;
    private javax.swing.JLabel stintLaps_Label;
    private javax.swing.JTextField stintName_Field;
    private javax.swing.JLabel stintName_Label;
    private javax.swing.JComboBox<String> stintType_ComboBox;
    private javax.swing.JLabel stintType_Label;
    private javax.swing.JLabel tyreAgeLabel;
    private javax.swing.JSpinner tyreAgeSpinner;
    private javax.swing.JComboBox<String> tyreCompoundComboBox;
    // End of variables declaration//GEN-END:variables
}
