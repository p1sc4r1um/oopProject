/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopprojectnet;

/**
 *
 * @author almof
 */
public class PeopleMenu extends javax.swing.JFrame {

    /**
     * Creates new form PeopleMenu
     */
    public PeopleMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createPersonBtn = new javax.swing.JButton();
        editPersonBtn = new javax.swing.JButton();
        deletePersonBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        createPersonBtn.setText("Create Person");
        createPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPersonBtnActionPerformed(evt);
            }
        });
        getContentPane().add(createPersonBtn);

        editPersonBtn.setText("Edit Person");
        editPersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editPersonBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editPersonBtn);

        deletePersonBtn.setText("Delete Person");
        deletePersonBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletePersonBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deletePersonBtn);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPersonBtnActionPerformed
        setContentPane(new CreatePersonPanel());
        revalidate();
    }//GEN-LAST:event_createPersonBtnActionPerformed

    private void editPersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editPersonBtnActionPerformed
        setContentPane(new EditPersonPanel());
        revalidate();
    }//GEN-LAST:event_editPersonBtnActionPerformed

    private void deletePersonBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletePersonBtnActionPerformed
        setContentPane(new DeletePersonPanel());
        revalidate();
    }//GEN-LAST:event_deletePersonBtnActionPerformed

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
            java.util.logging.Logger.getLogger(PeopleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PeopleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PeopleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PeopleMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PeopleMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createPersonBtn;
    private javax.swing.JButton deletePersonBtn;
    private javax.swing.JButton editPersonBtn;
    // End of variables declaration//GEN-END:variables
}