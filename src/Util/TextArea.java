
package Util;

import java.util.ArrayList;
/*
  TextAreas.
*/

public class TextArea {

    public String Impresion(ArrayList pta) {
        ArrayList<Long> impresion = new ArrayList();
        impresion = pta;
        String convertidor = "";
        for (int i = 0; i < 500; i++) {
            convertidor = convertidor + String.valueOf(impresion.get(i)) + " ";
        }
        return convertidor;
    }

}
