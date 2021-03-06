/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;

import com.sv.udb.clases.Fondo;

/**
 *
 * @author bernardo
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        Fondo img1 = new Fondo("com/sv/udb/images/Menu.jpg", 434, 425);
        PnlFondo.add(img1);
        PnlFondo.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnlFondo = new javax.swing.JPanel();
        btnReloj = new javax.swing.JLabel();
        btnSemaforo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PnlFondo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnReloj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/images/tiempo.png"))); // NOI18N
        btnReloj.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReloj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRelojMouseClicked(evt);
            }
        });

        btnSemaforo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sv/udb/images/semaforo.png"))); // NOI18N
        btnSemaforo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSemaforo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSemaforoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Creado por: Luis Araujo, Jose Morales, Walter Flores");

        javax.swing.GroupLayout PnlFondoLayout = new javax.swing.GroupLayout(PnlFondo);
        PnlFondo.setLayout(PnlFondoLayout);
        PnlFondoLayout.setHorizontalGroup(
            PnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFondoLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnSemaforo)
                .addGap(40, 40, 40)
                .addComponent(btnReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PnlFondoLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(71, 71, 71))
        );
        PnlFondoLayout.setVerticalGroup(
            PnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlFondoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(PnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSemaforo)
                    .addComponent(btnReloj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PnlFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSemaforoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSemaforoMouseClicked
        frmSemf frmSemf = new frmSemf();
        frmSemf.setVisible(true);
    }//GEN-LAST:event_btnSemaforoMouseClicked

    private void btnRelojMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRelojMouseClicked
        frmReloj frmReloj = new frmReloj();
        frmReloj.setVisible(true);
    }//GEN-LAST:event_btnRelojMouseClicked

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PnlFondo;
    private javax.swing.JLabel btnReloj;
    private javax.swing.JLabel btnSemaforo;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
