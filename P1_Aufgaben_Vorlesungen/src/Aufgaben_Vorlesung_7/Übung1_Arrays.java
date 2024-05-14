package Aufgaben_Vorlesung_7;

public class Übung1_Arrays {

    public static void main(String[] args){




        int[] a;  //initialisierung eines Arrays Anfang typ, dann Name
        a = new int[5]; // definiert die Größe eines Arrays
        for( int i=0; i<5; i++ )
         {
            a[i]=i; //automatische initialisierung durch for-schleie
        }

        int[] b;
        b = new int[]{5, 6, 7, 8}; //Manuelle initialisierung

        int[] c = {1, 2, 3, 4}; //Kurze schreibweise

        c[1] = c[3] + c[2];
        System.out.println(c[1]);  // Array 0 = 1, 1= 2, 2=3, 3=4, Darum Ergebnis = 7.

        // AUFGABE: Initialisiere einen Array k mit den Werte 1-5.

        int[] k;
        k = new int[100];
        for (int i = 0; i<5; i++) {
            k[i]=i;
        }
        System.out.println(k.length); //mit lenght gibt man die Anzahl der Array-Elemente aus.

        System.out.println();



    }


}
