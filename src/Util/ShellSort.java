
package Util;

import java.util.ArrayList;
/*
    ShellSort metodo de ordenamiento logico.
*/
public class ShellSort {

    public ArrayList Ascent(ArrayList pta) {
        System.out.println(pta.size());

        int mid = pta.size() / 2;

        while (mid > 0) {
            for (int i = mid; i < pta.size(); i++) {
                long test = (long) pta.get(i);
                int j = i;

                while (j >= mid && (long) pta.get(j - mid) > test) {
                    pta.set(j, pta.get(j - mid));
                    j = j - mid;

                }
                pta.set(j, test);

            }
            mid = mid / 2;
        }
        return pta;

    }

    public ArrayList Descent(ArrayList pta) {
        System.out.println(pta.size());

        int mid = pta.size() / 2;

        while (mid > 0) {
            for (int i = mid; i < pta.size(); i++) {
                long test = (long) pta.get(i);
                int j = i;

                while (j >= mid && (long) pta.get(j - mid) < test) {
                    pta.set(j, pta.get(j - mid));
                    j = j - mid;

                }
                pta.set(j, test);

            }
            mid = mid / 2;
        }
        return pta;

    }

}
