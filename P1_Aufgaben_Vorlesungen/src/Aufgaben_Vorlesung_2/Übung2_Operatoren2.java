package Aufgaben_Vorlesung_2;

public class Übung2_Operatoren2 {

    public static void main(String[] args){


        int i = 7/3;
        System.out.printf("Was ist i bei 7/3? i = %d \n\n", i);

        double d = 7/3;
        System.out.printf("Was ist ein double bei 7/3? d = %2.2f \n\n", d);

        double f = 7;
        double fd = f/3;
        System.out.printf("Was ist ein double bei 7/3? fd = %2.2f \n\n", fd);


        // Module

        int m = 11;
        int modulo = 3;
        int result = m % modulo;
        System.out.printf("Was passiert bei Modulo 11 und 3? %d \n\n", result);



    }


}
