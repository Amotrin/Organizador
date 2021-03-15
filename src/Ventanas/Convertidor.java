package Ventanas;

import Util.ShellSort;
import Util.TextArea;
import javax.swing.JOptionPane;
import Util.Util;
/*
    Menu secundario.
*/
public class Convertidor extends javax.swing.JFrame {

    Util util = new Util();
    ShellSort sort = new ShellSort();
    TextArea imp = new TextArea();

    public Convertidor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        button1 = new java.awt.Button();
        BotonAbrir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        button1.setLabel("button1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAbrir.setText("Abrir Archivos");
        BotonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 220, 40));

        BotonGuardar.setText("Guardar Archivo");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 220, 40));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 400, 90, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(488, 400, 90, 40));

        txtarea.setLineWrap(true);
        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 260, 240));

        jTextArea2.setLineWrap(true);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);
        jTextArea2.getAccessibleContext().setAccessibleParent(jScrollPane1);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 260, 240));

        jButton3.setText("Descendente");
        jButton3.setActionCommand("descendente");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Descendente(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 300, 125, 25));

        jButton4.setText("Ascendente");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ascendente(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(284, 170, 125, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/200-2007939_perfect-white-gradient-4k-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void BotonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbrirActionPerformed

        util.AbrirArchivo();
        txtarea.setText(imp.Impresion(util.getPta()));

    }//GEN-LAST:event_BotonAbrirActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed

        util.GuardarArchivo();
        JOptionPane.showMessageDialog(null, "Archivo guardado");

    }//GEN-LAST:event_BotonGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Principal b = new Principal();
        b.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void Descendente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Descendente
        sort.Descent(util.getPta());
        jTextArea2.setText(imp.Impresion(util.getPta()));
    }//GEN-LAST:event_Descendente

    private void Ascendente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ascendente
        sort.Ascent(util.getPta());
        jTextArea2.setText(imp.Impresion(util.getPta()));
    }//GEN-LAST:event_Ascendente

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
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAbrir;
    private javax.swing.JButton BotonGuardar;
    private java.awt.Button button1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
