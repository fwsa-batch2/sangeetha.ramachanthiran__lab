package test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[] [] arrayName = {{12,13,14,15,16},{21,23,24,25,26},{32,33,34,35,36},{41,42,43,44,45}};
//        System.out.println(arrayName[][]);
        for (int i=0; i< arrayName.length; i++) {
//            System.out.println(Arrays.toString(arrayName[i]));

            for (int j=0; j<arrayName[i].length; j++) {
                System.out.print(arrayName[i][j] + " ");
            }
            System.out.println();
        }
    }

}
