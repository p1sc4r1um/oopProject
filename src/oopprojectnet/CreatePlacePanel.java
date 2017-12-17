/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectnet;

import java.awt.Component;
import java.awt.Window;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.ArrayList;
import javax.swing.SwingUtilities;

/**
 *
 * @author zmcdo
 */
public class CreatePlacePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePlacePanel
     */
    public CreatePlacePanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    String[] placesType = {"garden", "sportsfield", "exhibitions", "pubs"};
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelPlace = new javax.swing.JLabel();
        placeName = new javax.swing.JTextField();
        placeType = new javax.swing.JComboBox<>(placesType);
        labelPlaceType = new javax.swing.JLabel();
        placeCreateBtn = new javax.swing.JButton();
        placeClearBtn = new javax.swing.JButton();
        placeBackBtn = new javax.swing.JButton();
        additional1 = new javax.swing.JLabel();
        additional2 = new javax.swing.JLabel();
        additionalText1 = new javax.swing.JTextField();
        additionalText2 = new javax.swing.JTextField();
        coordsLabel = new javax.swing.JLabel();
        placeCoords = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPlace.setText("Name:");
        add(labelPlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 43, -1, -1));

        placeName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeNameActionPerformed(evt);
            }
        });
        add(placeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 137, -1));

        placeType.setModel(new javax.swing.DefaultComboBoxModel<>(placesType));
        placeType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placeTypeMouseClicked(evt);
            }
        });
        placeType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeTypeActionPerformed(evt);
            }
        });
        add(placeType, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 113, -1, -1));
        ItemListener itemListenerPlaceType = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                String item = (String) evt.getItem();
                switch (item) {
                    case "garden":
                    additional1.setText("Garden Area: ");
                    break;
                    case "sportsfield":
                    additional1.setText("Sports' type: ");
                    break;
                    case "exhibitions":
                    additional1.setText("Art's type: ");
                    additional2.setText("Price: ");
                    break;
                    case "pubs":
                    additional1.setText("Capacity: ");
                    additional2.setText("Minimum Input: ");
                    break;
                }
            }
        };
        placeType.addItemListener(itemListenerPlaceType);

        labelPlaceType.setText("Type:");
        add(labelPlaceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 116, -1, -1));

        placeCreateBtn.setText("Create");
        placeCreateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeCreateBtnActionPerformed(evt);
            }
        });
        add(placeCreateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 238, -1, -1));

        placeClearBtn.setText("Clear");
        placeClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeClearBtnActionPerformed(evt);
            }
        });
        add(placeClearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 238, -1, -1));

        placeBackBtn.setText("Back");
        placeBackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                placeBackBtnMouseClicked(evt);
            }
        });
        add(placeBackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 238, -1, -1));

        additional1.setText("Garden Area:");
        add(additional1, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 151, -1, -1));
        add(additional2, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 192, -1, -1));

        additionalText1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionalText1ActionPerformed(evt);
            }
        });
        add(additionalText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 148, 99, -1));

        additionalText2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionalText2ActionPerformed(evt);
            }
        });
        add(additionalText2, new org.netbeans.lib.awtextra.AbsoluteConstraints(254, 192, 99, -1));

        coordsLabel.setText("Coords:");
        add(coordsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 81, -1, -1));

        placeCoords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeCoordsActionPerformed(evt);
            }
        });
        add(placeCoords, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 78, 137, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void placeNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeNameActionPerformed
    

    private void placeTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeTypeActionPerformed

    private void placeTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeTypeMouseClicked
        
    }//GEN-LAST:event_placeTypeMouseClicked

    private void additionalText1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionalText1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_additionalText1ActionPerformed

    private void placeCreateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeCreateBtnActionPerformed
        try {
            if("".equals(placeName.getText()) || "".equals(new String(additionalText1.getText())) || "".equals(new String(placeCoords.getText()))) {
                JOptionPane.showMessageDialog(null, "you need to input the place's info", "error", JOptionPane.ERROR_MESSAGE);

            }
            else {
                String name = placeName.getText();
                String type = (String) placeType.getSelectedItem();
                String coords = placeCoords.getText();
                String additional1, additional2;
                Places newPlace = null;
                int bool = 0;
                switch (type) {
                    case "garden": 
                        additional1 = additionalText1.getText();
                        try{
                            int num = Integer.parseInt(additional1);
                            newPlace = new Gardens(coords, name, additional1);
                            bool = 1;

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "garden area must be a number!", "error", JOptionPane.ERROR_MESSAGE);
                            additionalText1.setText(null);
                        }
                        break;
                    case "sportsfield": 
                        additional1 = additionalText1.getText();
                        newPlace = new SportsField(coords, name, additional1);
                        bool = 1;
                        break;
                    case "exhibitions": 
                        additional1 = additionalText1.getText();
                        additional2 = additionalText2.getText();
                        try{
                            int num = Integer.parseInt(additional2);
                            newPlace = new Exhibitions(coords, name, additional1, additional2);
                            bool = 1;                                                        
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "exhibition price must be a number!", "error", JOptionPane.ERROR_MESSAGE);
                            additionalText2.setText(null);
                        }                        
                        break;
                    case "pubs":
                        additional1 = additionalText1.getText();
                        additional2 = additionalText2.getText();
                        try{
                            int num = Integer.parseInt(additional1);
                            int num2 = Integer.parseInt(additional2);
                            newPlace = new Pubs(coords, name, additional1, additional2, new ArrayList<>(), new ArrayList<>());
                            bool = 1;
                            
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "pub's minimum input and capacity must be a number!", "error", JOptionPane.ERROR_MESSAGE);
                            additionalText1.setText(null);
                            additionalText2.setText(null);
                            
                        }                          
                        break;
                }
                if(newPlace != null && bool == 1) {
                    Database.listPlaces.add(newPlace);
                    System.out.println(Database.listPlaces.get(0));
                }
                if(bool == 1) {
                    Object[] options = { "OK", "CREATE ANOTHER" };
                    Object optionSelected = JOptionPane.showOptionDialog(null, type + " created, Click OK to go back to program's menu or create another", "success",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                            null, options, options[0]);

                    switch (optionSelected.toString()){
                        case "0":
                            Component comp = SwingUtilities.getRoot(this);
                            ((Window) comp).dispose();
                            break;
                        case "1":
                            placeName.setText(null);
                            placeCoords.setText(null);
                            additionalText1.setText(null);
                            additionalText2.setText(null);
                            break;
                    }
                }
            }

        }
        catch(NumberFormatException e) {
            placeName.setText(null);
            placeCoords.setText(null);
            additionalText1.setText(null);
            additionalText2.setText(null);

        }
    }//GEN-LAST:event_placeCreateBtnActionPerformed

    private void placeCoordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeCoordsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeCoordsActionPerformed

    private void placeBackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_placeBackBtnMouseClicked
        Component comp = SwingUtilities.getRoot(this);
        ((Window) comp).dispose();
    }//GEN-LAST:event_placeBackBtnMouseClicked

    private void placeClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeClearBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_placeClearBtnActionPerformed

    private void additionalText2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionalText2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_additionalText2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel additional1;
    private javax.swing.JLabel additional2;
    private javax.swing.JTextField additionalText1;
    private javax.swing.JTextField additionalText2;
    private javax.swing.JLabel coordsLabel;
    private javax.swing.JLabel labelPlace;
    private javax.swing.JLabel labelPlaceType;
    private javax.swing.JButton placeBackBtn;
    private javax.swing.JButton placeClearBtn;
    private javax.swing.JTextField placeCoords;
    private javax.swing.JButton placeCreateBtn;
    private javax.swing.JTextField placeName;
    private javax.swing.JComboBox<String> placeType;
    // End of variables declaration//GEN-END:variables
}
