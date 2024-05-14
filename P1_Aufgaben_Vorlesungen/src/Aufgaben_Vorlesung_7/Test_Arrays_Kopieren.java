package Aufgaben_Vorlesung_7;

import java.util.Arrays;

public class Test_Arrays_Kopieren {

    public static void main(String[] args){

        int n = 8;

        int[] m = new int[n];

        System.out.println("INITIALISIERUNG\n");

        for (int i=0; i<n; i++) {
            System.out.println("Position " + i + " enthält " + m[i]);
        }
        System.out.println("\nZUWEISUNG WERTE\n");
        for (int i=0; i<n; i++) {
            m[i]=i+1;
            System.out.println("Position " + i + " enthält " + m[i]);
        }
        System.out.println("");
        System.out.println("KOPIE ERSTELLEN\n");

        int[] copyM = Arrays.copyOf(m, m.length);

        for (int i=0; i<n; i++) {
            m[i]=i;
            System.out.println("Position "+ i + " enthält: " + copyM[i]);
        }
    } // public void
} // class
