package Aufgaben_Vorlesung_2;

public class Übung1_TypeCast {

    public static void main(String[] args){


        double d = 5.05;
        int i = (int) d; // was ist i?

        System.out.printf("was passiert, wenn man double 5.05 als int castet und druckt?\n");
        System.out.printf("i ist = %d\n\n", i); // i-ist 5. Die Zahl wird einfach abgeschnitten.

        // Thema Intervalle

        int h = (int) (d + 0.7); //Merke, Addition dann in Klammern.

        System.out.printf("h ist = %d\n\n", h);

        System.out.printf("was passiert, wenn man  int x = 0xFFFF druckt?\n");

        int x = 0xFFFF;

        System.out.printf("x ist = %d \n\n", x);

        short s = (short) x;

        System.out.printf("was passiert, wenn man  short s = x druckt?\n");
        System.out.printf("s ist = %d", s);

        
        
    }


}
