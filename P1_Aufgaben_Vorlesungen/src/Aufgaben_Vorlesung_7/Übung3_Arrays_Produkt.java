package Aufgaben_Vorlesung_7;

public class Übung3_Arrays_Produkt {

    public static void main(String[] args){



        System.out.println("#### #### #### ####");
        System.out.println("");
        System.out.println("Meine Lösung");

        int[] a;
        a = new int[]{1, 2, 3, 4, 5};

        int sum = 1;

        for (int element : a) {
            sum *= element;
            System.out.println(sum);
        }

        System.out.println("");
        System.out.println("#### #### #### ####");
        System.out.println("");
        System.out.println("MUSTER Lösung");

        int[] b;
        b = new int[]{1, 2, 3, 4, 5};

        int p = 1;
        for (int element : a) {
            p *= element;
        }
        System.out.println( "PRODUKT = " + p );


    }


}
