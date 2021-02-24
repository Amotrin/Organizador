
package Negocio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFileChooser;

public class NArchivo {

        private String documento="";
        private String aux;
        private String texto = "";
        private String convertido="";
        
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getAux() {
        return aux;
    }

    public void setAux(String aux) {
        this.aux = aux;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getConvertido() {
        return convertido;
    }

    public void setConvertido(String convertido) {
        this.convertido = convertido;
    }
        
       @Override
    public String toString() {
        return "NArchivo{" + "documento=" + documento + ", aux=" + aux + ", texto=" + texto + ", convertido=" + convertido + '}';
    }


}
