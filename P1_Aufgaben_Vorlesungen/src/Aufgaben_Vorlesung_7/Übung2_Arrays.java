package Aufgaben_Vorlesung_7;

public class Übung2_Arrays {

    public static void main(String[] args){




         int [] a;
         a = new int[] {1, 2, 3, 4, 5};
         int sum=0;
         int numberOfElements = a.length;


        //Aufgabe - Berechne die Summe von 1-4

         System.out.println("#### #### #### ####");
         System.out.println("");
         System.out.println("Meine Lösung");

         for (int element : a) {
              sum +=element; // ist das gleiche wie sum = sum + a[i];
              }
         System.out.println("Meine Lösung = " + sum);

         System.out.println("");
         System.out.println("#### #### #### ####");
         System.out.println("");
         System.out.println("MUSTER Lösung");

        int[] b;
        b = new int[]{1, 2, 3, 4, 5};
        int sum2 = 0;
        int numberOfElements2 = b.length;

        for( int i=0; i<numberOfElements2; i++ ){
            sum2 += b[i];
        }//for
        System.out.println( "SUMME = " + sum2 );
    }


}
