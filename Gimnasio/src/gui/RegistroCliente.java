/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;
import Gimnasio.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo
 */
public class RegistroCliente extends javax.swing.JFrame {
Conexion.conexion con = new Conexion.conexion();
Connection cn = con.conectar();
    public RegistroCliente() {
        initComponents();
        setTitle("Registro (Cliente)");
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

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cedula = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CorrE = new javax.swing.JTextField();
        NombreComple1 = new javax.swing.JTextField();
        NumT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        ed = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Direccio = new javax.swing.JTextField();
        Direc = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Crear Usuario Cliente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 410, 50));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registrarse");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(153, 153, 153), java.awt.Color.gray, new java.awt.Color(204, 204, 204)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 200, 50));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Numero de Cedula");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, -1));

        Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CedulaActionPerformed(evt);
            }
        });
        jPanel2.add(Cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 220, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setText("Correo electronico");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        CorrE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrEActionPerformed(evt);
            }
        });
        jPanel2.add(CorrE, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 330, -1));

        NombreComple1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreComple1ActionPerformed(evt);
            }
        });
        jPanel2.add(NombreComple1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 260, -1));

        NumT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumTActionPerformed(evt);
            }
        });
        jPanel2.add(NumT, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 150, 20));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel5.setText("Número de telefónico");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 1, 14)); // NOI18N
        jLabel6.setText("Contraseña");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Nombre Completo");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, -1));

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        jPanel2.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 330, -1));

        ed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ed.setAlignmentX(55.0F);
        ed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edActionPerformed(evt);
            }
        });
        jPanel2.add(ed, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 100, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Edad");
        jLabel7.setAlignmentX(55.0F);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, -1, -1));

        Direccio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccioActionPerformed(evt);
            }
        });
        jPanel2.add(Direccio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 390, -1));

        Direc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Direc.setText("Dirección");
        jPanel2.add(Direc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 450, 280));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trasparencia.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 630, 410));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registro1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void edActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edActionPerformed

    private void CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CedulaActionPerformed
      
    }//GEN-LAST:event_CedulaActionPerformed

    private void CorrEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorrEActionPerformed

    private void NumTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumTActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String CorrEl = "";
        String Pass = "";
        String Nombre = NombreComple1.getText();
        String Ced = Cedula.getText();
        CorrEl = CorrE.getText();
        String Tel = NumT.getText();
        Pass = Password.getText();
        String edad = ed.getText();
        String Direc = Direccio.getText();

        if (Nombre.isEmpty() || Ced.isEmpty() || CorrEl.isEmpty() || Tel.isEmpty() || Pass.isEmpty() || edad.isEmpty() || Direc.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error al ingresar al sistema, debe llenar todas las casillas.");
        } else {
            try {
                int cedula = Integer.parseInt(Ced);
                Cliente cliente = new Cliente(Nombre, edad, Direc, Tel, Integer.parseInt(Ced), 0, CorrEl, Pass);
                cliente.ValidacionRegistro(Nombre, Ced, CorrEl, Tel, Pass, edad, Direc);
         
                if (CorrEl.contains("@") && CorrEl.contains(".com")) {
                    try{
                    String consulta= " insert into registroCliente (id, Nombre, Edad, Direccion, telefono, Correo, Contraseña, Cedula) values('"+cliente.getID()+"', '"+Nombre+"', '"+edad+"', '"+Direc+"', '"+Tel+"', '"+CorrEl+"',  '"+Pass+"',  '"+Ced+"' )";
                    PreparedStatement ps = cn.prepareStatement(consulta);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Registro exitoso!");
                    con.desconectar();
                    }catch(SQLException e){
                        JOptionPane.showMessageDialog(null, "No se pudo registrar usuario");
                        e.printStackTrace();
                    
                    }
                    dispose(); // Cerrar la ventana actual (registro)

                    PantallaPrincipal MPTN = new PantallaPrincipal();
                    MPTN.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "El correo electronico debe de contener @ y .com");
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(null, "La cédula debe de ser un numero entero");

            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void NombreComple1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreComple1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreComple1ActionPerformed

    private void DireccioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccioActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cedula;
    private javax.swing.JTextField CorrE;
    private javax.swing.JLabel Direc;
    private javax.swing.JTextField Direccio;
    private javax.swing.JTextField NombreComple1;
    private javax.swing.JTextField NumT;
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField ed;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
