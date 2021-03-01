package Ventanas;

import Negocio.NArchivo;
import Util.Util;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Convertidor extends javax.swing.JFrame {

    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;
    FileReader leer;
    File read;
    File read_w;
    FileWriter write;
    NArchivo objeto;
    Util util = new Util();
    ArrayList pta = new ArrayList();

    public Convertidor() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public ArrayList AbrirArchivo() {
        JFileChooser jf = new JFileChooser();
        try {
            jf.setFileSelectionMode(JFileChooser.FILES_ONLY);
            jf.showOpenDialog(null);
            read = jf.getSelectedFile();
            FileReader archiv = new FileReader(read);
            BufferedReader buffer = new BufferedReader(archiv);

            Long temp;
            String bfRead;
            temp = System.currentTimeMillis();
            while ((bfRead = buffer.readLine()) != null) {
                pta.add(Long.parseLong(bfRead));
            }
            Long tempf = System.currentTimeMillis();
            System.out.println("lectura completada:" + (tempf - temp));
            System.out.println(pta.size());
        } catch (IOException e) {
            System.err.println("No se encontro archivo");
        }
        Collections.sort(pta);
        String convertidor = "";
        for (int i = 0; i < 500; i++) {
            convertidor = convertidor + String.valueOf(pta.get(i)) + " ";
        }
        txtarea.setText(convertidor);

        return pta;
    }

    public String GuardarArchivo() {
        String mensaje = null;
        JFileChooser escritura = new JFileChooser();
        try {
            escritura.setFileSelectionMode(JFileChooser.FILES_ONLY);
            escritura.showOpenDialog(null);
            read_w = escritura.getSelectedFile();
            FileWriter wt = new FileWriter(read_w);
            BufferedWriter bf_w = new BufferedWriter(wt);
            for (int i = 0; i < pta.size(); i++) {
                bf_w.write(String.valueOf(pta.get(i)) + "\n");
            }
            bf_w.close();
            mensaje = "Archivo Guardado";
        } catch (Exception e) {
        }
        return mensaje;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonAbrir = new javax.swing.JButton();
        BotonGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BotonAbrir.setText("Abrir Archivos");
        BotonAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbrirActionPerformed(evt);
            }
        });
        getContentPane().add(BotonAbrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 220, 40));

        BotonGuardar.setText("Guardar Archivo");
        BotonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, 220, 40));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 90, 40));

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, 90, 40));

        txtarea.setLineWrap(true);
        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 460, 240));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/200-2007939_perfect-white-gradient-4k-wallpaper.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbrirActionPerformed

        AbrirArchivo();

    }//GEN-LAST:event_BotonAbrirActionPerformed

    private void BotonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonGuardarActionPerformed
        GuardarArchivo();
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    // End of variables declaration//GEN-END:variables
}
