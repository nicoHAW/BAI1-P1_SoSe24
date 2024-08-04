package Aufgaben_Vorlesung_7;

public class Übung4_Arrays_SiebVonErasthos {

    public static void main(String[] args){

        int[] a;
        a = new int[100];

        //initialise [ai]
        for (int i=0; i<a.length; i++) {
            a[i]= i;
        }
        // Check for prim numbers
        System.out.println("#### Das Sind die Primzahlen von 1-100 #####");
        for (int i=0; i<a.length; i++) { //go through all a[i] and check modulo

            for (int modulo = 2; modulo < a[i]; modulo++) { //check a[i] for modulo
                if (a[i]%modulo == 0) {
                    a[i] = 0; //sets a[i] to zero if modulo
                } // end If modulo=0
            } //end for modulo

            if (a[i] > 1) {
                System.out.printf("%d, ", a[i]);
            } // end if

        } // End outer for
    }
}
