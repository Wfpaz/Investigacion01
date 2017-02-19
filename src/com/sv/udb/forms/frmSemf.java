/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.forms;

import com.sv.udb.clases.Fondo;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author bernardo
 */
public class frmSemf extends javax.swing.JFrame {

    /**
     * Creates new form frmSemf
     */
    Timer timerR, timerA, timerV;
    int Estado[], Retro[];
    public frmSemf() {
        initComponents();
        this.generar(96, 36, pnlRojo, "R", Color.red, "STOP!");
        this.generar(96, 36, pnlAmarillo, "A", Color.yellow, "CAUTION!");
        this.generar(96, 36, pnlVerde, "V", Color.green, "GO!");
        Estado = new int[3];
        Retro = new int[3];
        Estado[0] = 0;
        Estado[1] = 0;
        Estado[2] = 0;
        Retro[0] = 1;
        Retro[1] = 1;
        Retro[2] = 1;
        this.pnlAmarillo.setVisible(false);
        this.pnlRojo.setVisible(false);
        this.setSize(280, 450);
        this.setLocationRelativeTo(null);
        Fondo img1 = new Fondo("com/sv/udb/images/fondo.jpg", 250, 318);
        pnlRojo.add(img1);
        pnlRojo.repaint();
        Fondo img2 = new Fondo("com/sv/udb/images/fondo.jpg", 250, 318);
        pnlAmarillo.add(img2);
        pnlAmarillo.repaint();
        Fondo img3 = new Fondo("com/sv/udb/images/fondo.jpg", 250, 318);
        pnlVerde.add(img3);
        pnlVerde.repaint();
        this.timerR = new Timer (100, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
               cambiarColor(pnlRojo, timerR, Color.red, timerV, pnlVerde, 0);
            }
        });
        this.timerA = new Timer (50, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                cambiarColor(pnlAmarillo, timerA, Color.yellow, timerR, pnlRojo, 1);
            }
        });
        this.timerV = new Timer (100, new ActionListener ()
        {
            public void actionPerformed(ActionEvent e)
            {
                cambiarColor(pnlVerde, timerV, Color.green, timerA, pnlAmarillo, 2);
            }
        });
    }
    
    private void cambiarColor(JPanel panel, Timer t, Color c, Timer sig, JPanel siguiente, int indice) {
        if (Estado[indice] < 75){
                    if(panel.getComponent(Estado[indice]) instanceof JTextField) {
                        if (panel.getComponent(Estado[indice]).getBackground().equals(Color.white))
                        {   
                            panel.getComponent(Estado[indice]).setBackground(c);
                        }
                        else 
                        {
                            panel.getComponent(Estado[indice]).setBackground(Color.white);
                        }
                    }
                    Estado[indice]++;
                }
                else if (Retro[indice] < 7)
                {
                    if(panel.getComponent(Retro[indice]) instanceof JTextField) {
                        if (panel.getComponent(Retro[indice]).getBackground().equals(Color.white))
                        {   
                            panel.getComponent(Retro[indice]).setBackground(c);
                        }
                        else 
                        {
                            panel.getComponent(Retro[indice]).setBackground(Color.white);
                        }
                    }
                    Retro[indice] = Retro[indice]+2;
                }
                else
                {
                    if (panel.getBackground().equals(Color.white)){
                        panel.setBackground(Color.black);
                        panel.setVisible(false);
                        siguiente.setVisible(true);
                        siguiente.setBackground(Color.white);
                        sig.start();
                    }
                    else
                    {
                        Estado[indice] = 0;
                        Retro[indice] = 1;
                        t.stop();
                    }
                    Estado[indice] = 0;
                    Retro[indice] = 1;
                }
    }
    
  /*  private int buscar() {
        int resp = 0;
        for (int i = 0; i < pnlRojo.getComponentCount()-1; i++)
        {
            try {
                if (pnlRojo.getComponent(i).getName().equals("R"+R1)){
                resp = i;
                JOptionPane.showMessageDialog(this, pnlRojo.getComponent(i).getName());
                return resp;
            }
            } catch (Exception ex){ ex.printStackTrace();} 
            
        }
        return resp;
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRojo = new javax.swing.JPanel();
        pnlVerde = new javax.swing.JPanel();
        pnlAmarillo = new javax.swing.JPanel();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlRojo.setBackground(new java.awt.Color(0, 0, 0));
        pnlRojo.setMaximumSize(new java.awt.Dimension(250, 350));
        pnlRojo.setMinimumSize(new java.awt.Dimension(250, 350));
        pnlRojo.setPreferredSize(new java.awt.Dimension(250, 350));

        javax.swing.GroupLayout pnlRojoLayout = new javax.swing.GroupLayout(pnlRojo);
        pnlRojo.setLayout(pnlRojoLayout);
        pnlRojoLayout.setHorizontalGroup(
            pnlRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnlRojoLayout.setVerticalGroup(
            pnlRojoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        pnlVerde.setBackground(new java.awt.Color(255, 255, 255));
        pnlVerde.setMaximumSize(new java.awt.Dimension(250, 350));
        pnlVerde.setMinimumSize(new java.awt.Dimension(250, 350));
        pnlVerde.setPreferredSize(new java.awt.Dimension(250, 350));
        pnlVerde.setRequestFocusEnabled(false);

        javax.swing.GroupLayout pnlVerdeLayout = new javax.swing.GroupLayout(pnlVerde);
        pnlVerde.setLayout(pnlVerdeLayout);
        pnlVerdeLayout.setHorizontalGroup(
            pnlVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnlVerdeLayout.setVerticalGroup(
            pnlVerdeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        pnlAmarillo.setBackground(new java.awt.Color(0, 0, 0));
        pnlAmarillo.setMinimumSize(new java.awt.Dimension(250, 350));
        pnlAmarillo.setPreferredSize(new java.awt.Dimension(250, 350));

        javax.swing.GroupLayout pnlAmarilloLayout = new javax.swing.GroupLayout(pnlAmarillo);
        pnlAmarillo.setLayout(pnlAmarilloLayout);
        pnlAmarilloLayout.setHorizontalGroup(
            pnlAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        pnlAmarilloLayout.setVerticalGroup(
            pnlAmarilloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnIniciar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlVerde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlRojo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnIniciar)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void generar(int x, int y, JPanel panel, String pref, Color c, String p) {
        panel.removeAll();
        JTextField[] campos;
        campos = new JTextField[75];
        for (int i = 0; i < 75; i++)
        {
            campos[i] = new JTextField();
            campos[i].setFocusable(false);
            campos[i].setSize(20, 20);
            campos[i].setName(pref+i);
            if (i % 2 == 0 && i < 72){
                campos[i].setBackground(c);
            }
            else
            {
                campos[i].setBackground(Color.white);
            }
        }
        int espacio = 15;
        campos[0].setLocation(x, y);
        campos[1].setLocation(x, y+(espacio*6));
        campos[2].setLocation(x-espacio, y);
        campos[3].setLocation(x, y+(espacio*7));
        campos[4].setLocation(x+espacio, y);
        campos[5].setLocation(x, y+(espacio*8));
        campos[6].setLocation(x-(espacio*2), y);
        campos[7].setLocation(x, y+(espacio*9));
        campos[8].setLocation(x+(espacio*2), y);
        campos[9].setLocation(x, y+(espacio*10));
        campos[10].setLocation(x, y+espacio);
        campos[11].setLocation(x, y+(espacio*11));
        campos[12].setLocation(x-espacio, y+espacio);
        campos[13].setLocation(x, y+(espacio*12));
        campos[14].setLocation(x+espacio, y+espacio);
        campos[15].setLocation(x, y+(espacio*13));
        campos[16].setLocation(x-(espacio*3), y);
        campos[17].setLocation(x, y+(espacio*14));
        campos[18].setLocation(x+(espacio*3), y);
        campos[19].setLocation(x-espacio, y+(espacio*14));
        campos[20].setLocation(x, y+(espacio*2));
        campos[21].setLocation(x+espacio, y+(espacio*14));
        campos[22].setLocation(x-(espacio*2), y+espacio);
        campos[23].setLocation(x-(espacio*2), y+(espacio*14));
        campos[24].setLocation(x+(espacio*2), y+espacio);
        campos[25].setLocation(x+(espacio*2), y+(espacio*14));
        campos[26].setLocation(x-espacio, y+(espacio*2));
        campos[27].setLocation(x-espacio, y+(espacio*13));
        campos[28].setLocation(x+espacio, y+(espacio*2));
        campos[29].setLocation(x+espacio, y+(espacio*13));
        campos[30].setLocation(x-(espacio*3), y+espacio);
        campos[31].setLocation(x-(espacio*3), y+(espacio*14));
        campos[32].setLocation(x+(espacio*3), y+espacio);
        campos[33].setLocation(x+(espacio*3), y+(espacio*14));
        campos[34].setLocation(x-(espacio*2), y+(espacio*2));
        campos[35].setLocation(x-(espacio*2), y+(espacio*13));
        campos[36].setLocation(x+(espacio*2), y+(espacio*2));
        campos[37].setLocation(x+(espacio*2), y+(espacio*13));
        campos[38].setLocation(x, y+(espacio*3));
        campos[39].setLocation(x-espacio, y+(espacio*12));
        campos[40].setLocation(x-(espacio*3), y+(espacio*2));
        campos[41].setLocation(x+espacio, y+(espacio*12));
        campos[42].setLocation(x+(espacio*3), y+(espacio*2));
        campos[43].setLocation(x-(espacio*3), y+(espacio*13));
        campos[44].setLocation(x-espacio, y+(espacio*3));
        campos[45].setLocation(x+(espacio*3), y+(espacio*13));
        campos[46].setLocation(x+espacio, y+(espacio*3));
        campos[47].setLocation(x-(espacio*2), y+(espacio*12));
        campos[48].setLocation(x-(espacio*2), y+(espacio*3));
        campos[49].setLocation(x+(espacio*2), y+(espacio*12));
        campos[50].setLocation(x+(espacio*2), y+(espacio*3));
        campos[51].setLocation(x-espacio, y+(espacio*11));
        campos[52].setLocation(x-(espacio*3), y+(espacio*3));
        campos[53].setLocation(x+espacio, y+(espacio*11));
        campos[54].setLocation(x+(espacio*3), y+(espacio*3));
        campos[55].setLocation(x-(espacio*3), y+(espacio*12));
        campos[56].setLocation(x, y+(espacio*4));
        campos[57].setLocation(x+(espacio*3), y+(espacio*12));
        campos[58].setLocation(x-espacio, y+(espacio*4));
        campos[59].setLocation(x-(espacio*2), y+(espacio*11));
        campos[60].setLocation(x+espacio, y+(espacio*4));
        campos[61].setLocation(x+(espacio*2), y+(espacio*11));
        campos[62].setLocation(x-(espacio*2), y+(espacio*4));
        campos[63].setLocation(x-(espacio*3), y+(espacio*11));
        campos[64].setLocation(x+(espacio*2), y+(espacio*4));
        campos[65].setLocation(x+(espacio*3), y+(espacio*11));
        campos[66].setLocation(x, y+(espacio*5));
        campos[67].setLocation(x-espacio, y+(espacio*10));
        campos[68].setLocation(x-espacio, y+(espacio*5));
        campos[69].setLocation(x+espacio, y+(espacio*10));
        campos[70].setLocation(x+espacio, y+(espacio*5));
        campos[71].setLocation(x+(espacio*2), y+(espacio*10));
        campos[72].setLocation(x-(espacio*2), y+(espacio*10));
        campos[73].setLocation(x+espacio, y+(espacio*9));
        campos[74].setLocation(x-espacio, y+(espacio*9));
        for (int i = 0; i < 75; i++)
        {
            panel.add(campos[i], i);
        }
        panel.repaint();
    }
    
    
    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        // TODO add your handling code here:
        timerV.start();

    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(frmSemf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSemf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSemf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSemf.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSemf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel pnlAmarillo;
    private javax.swing.JPanel pnlRojo;
    private javax.swing.JPanel pnlVerde;
    // End of variables declaration//GEN-END:variables
}
