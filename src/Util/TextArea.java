/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Util;

import java.util.ArrayList;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TextArea {

        public String Impresion(ArrayList pta) {
        ArrayList<Long> impresion = new ArrayList();
        impresion=pta;
        String convertidor = "";
        for (int i = 0; i < 500; i++) {
            convertidor = convertidor + String.valueOf(impresion.get(i)) + " ";
        }
        return convertidor;
    }

}
