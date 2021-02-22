/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author edwin
 */
public class IngSoftware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> num = new ArrayList();
        
        Scanner sc = new Scanner(System.in);
        String dato = new String();
        
        dato = "texto_tmp.txt";
        File archivo = new File(dato); 
        Archivo a = new Archivo();
        
        String texto = a.leerTxt(dato);
        
        System.out.println(texto.length());
        
        for (int i = 0; i < texto.length(); i++) {
            String[] parts = texto.split(" ");
            try{
                num.add(Integer.parseInt(parts[i]));
            }catch(Exception e){
               
            } 
        }
        
        Collections.sort(num);
        
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
        
    }
    
}
