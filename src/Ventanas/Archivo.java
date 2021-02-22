/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author edwin
 */
public class Archivo {
    
        public String leerTxt(String direccion){
        String texto = "";
        try{
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String temp = " ";
            String bfRead; 
            while((bfRead = bf.readLine()) != null){
                temp = temp + bfRead + " "; //Guardar texto del archivo
            }
            
            texto = temp;
            
        }catch(Exception e){
            System.err.println("No se encontro archivo");
        }
        
        return texto;
    }
    
}
