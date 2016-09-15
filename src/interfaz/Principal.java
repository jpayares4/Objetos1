/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Clase.Denominador0Exception;
import Clase.Fracciones;
import javax.swing.JOptionPane;

/**
 *
 * @author Payares
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
      cmbConvertirMixto.setEnabled(false);
      cmbLimpiar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumerador1 = new javax.swing.JTextField();
        txtDenominador1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtNumerador2 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtDenominador2 = new javax.swing.JTextField();
        cmbOperacion = new javax.swing.JComboBox<>();
        cmbCalcular = new javax.swing.JButton();
        cmbLimpiar = new javax.swing.JButton();
        cmbConvertirMixto = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        txtDenominador4 = new javax.swing.JTextField();
        txtNumerador4 = new javax.swing.JTextField();
        txtEntero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtNumerador3 = new javax.swing.JTextField();
        txtDenominador3 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        cmbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Calculadora de  Fraccionarios");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        txtNumerador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerador1ActionPerformed(evt);
            }
        });
        txtNumerador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 60, -1));

        txtDenominador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador1KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 60, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 60, -1));

        txtNumerador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumerador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtNumerador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 60, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 60, -1));

        txtDenominador2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDenominador2KeyTyped(evt);
            }
        });
        jPanel1.add(txtDenominador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 60, -1));

        cmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        jPanel1.add(cmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        cmbCalcular.setText("Calcular");
        cmbCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmbCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        cmbLimpiar.setText("Limpiar");
        cmbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(cmbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, -1));

        cmbConvertirMixto.setText("Convertir  a Mixto");
        cmbConvertirMixto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbConvertirMixtoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbConvertirMixto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Convercion a numero Mixto"));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 10));

        txtDenominador4.setEditable(false);
        jPanel2.add(txtDenominador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 60, -1));

        txtNumerador4.setEditable(false);
        txtNumerador4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumerador4ActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumerador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 60, -1));

        txtEntero.setEditable(false);
        jPanel2.add(txtEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 60, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 230, 120));

        jLabel2.setText("=");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Fraccionarios"));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNumerador3.setEditable(false);
        jPanel3.add(txtNumerador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 60, -1));

        txtDenominador3.setEditable(false);
        jPanel3.add(txtDenominador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 60, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 60, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 150, 110));

        cmbSalir.setText("Salir");
        cmbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSalirActionPerformed(evt);
            }
        });
        jPanel1.add(cmbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(611, 341));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumerador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
        
    }//GEN-LAST:event_txtNumerador1KeyTyped

    private void txtDenominador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador1KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
        
    }//GEN-LAST:event_txtDenominador1KeyTyped

    private void txtNumerador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumerador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtNumerador2KeyTyped

    private void txtDenominador2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDenominador2KeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
        
    }//GEN-LAST:event_txtDenominador2KeyTyped

    private void cmbCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCalcularActionPerformed

      int  n1, n2, d1, d2,op;
        Fracciones f1, f2, f3 = null;

  
        if (txtNumerador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " ingrese el numerador de la  fracción #1", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador1.requestFocusInWindow();
        } else if (txtDenominador1.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " ingrese el denominador de la  fracción #1", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador1.requestFocusInWindow();
        } else if (txtNumerador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " ingrese el numerador de la  fracción #2", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumerador2.requestFocusInWindow();
        } else if (txtDenominador2.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, " ingrese el denominador de la fracción #2", "Error", JOptionPane.ERROR_MESSAGE);
            txtDenominador2.requestFocusInWindow();
        } else {
            cmbConvertirMixto.setEnabled(true);

            op = cmbOperacion.getSelectedIndex();
            n1 = Integer.parseInt(txtNumerador1.getText());
            d1 = Integer.parseInt(txtDenominador1.getText());
            n2 = Integer.parseInt(txtNumerador2.getText());
            d2 = Integer.parseInt(txtDenominador2.getText());

            try {
                f1 = new Fracciones(n1, d1);
                f2 = new Fracciones(n2, d2);

                switch (op) {
                    case 0:
                    f3 = f1.sumar(f2);
                    break;
                    case 1:
                    f3 = f1.resta(f2);
                    break;
                    case 2:
                    f3 = f1.multiplicacion(f2);
                    break;
                    case 3:
                    f3 = f1.division(f2);
                    break;

                }
                txtNumerador3.setText("" + f3.getNumerador());
                txtDenominador3.setText("" + f3.getDenominador());
                txtEntero.setText("");
                cmbCalcular.setEnabled(false);
                cmbLimpiar.setEnabled(true);

            } catch (Denominador0Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                if (txtDenominador1.getText().equalsIgnoreCase("0")) {
                    txtDenominador1.requestFocusInWindow();
                    txtDenominador1.selectAll();
                } else if (txtDenominador2.getText().equalsIgnoreCase("0")) {
                    txtDenominador2.requestFocusInWindow();
                    txtDenominador2.selectAll();
                }
            }
            
        }

        
       
        
    }//GEN-LAST:event_cmbCalcularActionPerformed

    private void cmbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLimpiarActionPerformed
        txtNumerador1.setText("");
        txtDenominador1.setText("");
        txtNumerador2.setText("");
        txtDenominador2.setText("");
        txtNumerador3.setText("");
        txtDenominador3.setText("");
        txtNumerador4.setText("");
        txtDenominador4.setText("");        
        txtEntero.setText("");
        txtNumerador1.requestFocusInWindow();
        cmbConvertirMixto.setEnabled(false);      
        cmbOperacion.setSelectedIndex(0);
        cmbLimpiar.setEnabled(false);
        cmbCalcular.setEnabled(true);
    }//GEN-LAST:event_cmbLimpiarActionPerformed

    private void cmbConvertirMixtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbConvertirMixtoActionPerformed
        int num, dem, mixto;

        num = Integer.parseInt(txtNumerador3.getText());
        dem = Integer.parseInt(txtDenominador3.getText());
        
        if (num > dem) {
            mixto = num / dem;

            txtNumerador4.setText("" + (num % dem));
            txtDenominador4.setText("" + dem);
            txtEntero.setText("" + mixto);
            cmbConvertirMixto.setEnabled(false);
            cmbLimpiar.setEnabled(true);
            cmbCalcular.setEnabled(false);

        } else {
            JOptionPane.showMessageDialog(this, "el resultado debe ser una fraccion impropia para poder convertirla a número mixto", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
            cmbConvertirMixto.setEnabled(false);
            cmbLimpiar.setEnabled(true);
        }
        
    }//GEN-LAST:event_cmbConvertirMixtoActionPerformed

    private void txtNumerador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerador1ActionPerformed

                
    }//GEN-LAST:event_txtNumerador1ActionPerformed

    private void txtNumerador4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumerador4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumerador4ActionPerformed

    private void cmbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cmbSalirActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbCalcular;
    private javax.swing.JButton cmbConvertirMixto;
    private javax.swing.JButton cmbLimpiar;
    private javax.swing.JComboBox<String> cmbOperacion;
    private javax.swing.JButton cmbSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtDenominador1;
    private javax.swing.JTextField txtDenominador2;
    private javax.swing.JTextField txtDenominador3;
    private javax.swing.JTextField txtDenominador4;
    private javax.swing.JTextField txtEntero;
    private javax.swing.JTextField txtNumerador1;
    private javax.swing.JTextField txtNumerador2;
    private javax.swing.JTextField txtNumerador3;
    private javax.swing.JTextField txtNumerador4;
    // End of variables declaration//GEN-END:variables
}
