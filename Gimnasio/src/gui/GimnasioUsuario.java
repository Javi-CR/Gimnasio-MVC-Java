/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import Control.GimnasioUsuarioControl;
import javax.swing.Timer;

/**
 *
 * @author javie
 */
public class GimnasioUsuario extends javax.swing.JFrame {

    /**
     * Creates new form GimnasioUsuario
     */
    public GimnasioUsuario() {
        initComponents();
        setTitle("Gimnasio (Usuario)");
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        BotSALIR = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaTaller = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotSALIR.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotSALIR.setText("Salir");
        BotSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotSALIRActionPerformed(evt);
            }
        });
        getContentPane().add(BotSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, 100, 30));

        TablaTaller.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "INSTRUCTOR", "HORARIO TALLER", "DURACION", "ZONA", "NIVEL", "DESCRIPCION"
            }
        ));
        jScrollPane1.setViewportView(TablaTaller);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 930, 470));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TALLERES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trasparencia.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 220, 490));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trasparencia.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 750, 490));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/dsdff.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        new PantallaPrincipal().setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void BotSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotSALIRActionPerformed
        // TODO add your handling code here:
        dispose();
        new PantallaPrincipal().setVisible(true);

    }//GEN-LAST:event_BotSALIRActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotSALIR;
    public javax.swing.JTable TablaTaller;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    public JButton getBotSALIR() {
        return BotSALIR;
    }

    public void setBotSALIR(JButton BotSALIR) {
        this.BotSALIR = BotSALIR;
    }

    public JTable getTablaTaller() {
        return TablaTaller;
    }

    public void setTablaTaller(JTable TablaTaller) {
        this.TablaTaller = TablaTaller;
    }

    public JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }


}
