package Util;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Util extends javax.swing.JFrame {
    ArrayList<Long> pta = new ArrayList();

    public ArrayList AbrirArchivo() {

        File read;

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
          
            JOptionPane.showMessageDialog(null, "No se encontro archivo");
            
        }
        return pta;

    }

    public ArrayList Ordenar() {
        
        int mid = pta.size() / 2;
        
        do {           
            for (int i = mid; i < pta.size(); i++) {               
                long test = (long) pta.get(i);
                int j = i;
                
                do {                    
                    pta.set(j, pta.get(j - mid));
                    j = j - mid;
               
                } while (j >= mid && (long) pta.get(j - mid) > test);                
                pta.set(j, test);
                
            }
            mid = mid / 2;
        
        } while (mid > 0);        
        return pta;
        
    }

    public String GuardarArchivo() {
        
        File read_w;
        String mensaje = null;
        JFileChooser escritura = new JFileChooser();
        System.out.println(pta.size());
        
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
            
        } catch (IOException e) {
        }
        
        return mensaje;
    }
    public String Impresion() {
        String convertidor = "";
        for (int i = 0; i < 300; i++) {
            convertidor = convertidor + String.valueOf(pta.get(i)) + " ";
        }
        return convertidor;
    }
    public ArrayList<Long> getPta() {
        return pta;
    }

    public void setPta(ArrayList<Long> pta) {
        this.pta = pta;
    }
}
