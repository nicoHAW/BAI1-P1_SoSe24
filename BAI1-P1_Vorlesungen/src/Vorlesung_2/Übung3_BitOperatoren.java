package Aufgaben_Vorlesung_2;

public class Übung3_BitOperatoren {

    public static void main(String[] args){


        boolean i = !(2<=3);

        if (i) {
            System.out.printf("Wenn i = !(2<=3), dann ist i = %b \n\n", i);
        } else {
            System.out.printf("Bei i = !(2<=3), ist i leider falsch.\n\n");
        }

        System.out.printf("### ### ### ### ### ### ### ### ### ### ### ###\n\n");

        i = true;

        if (i) {
            System.out.printf("Wenn i = true, dann ist i = %b \n\n", i);
        } else {
            System.out.printf("Bei i = true, ist i leider falsch.\n\n");
        }

        System.out.printf("### ### ### ### ### ### ### ### ### ### ### ###\n\n");

        i = !true;

        if (i) {
            System.out.printf("Wenn i = !true, dann ist i = %b \n\n", i);
        } else {
            System.out.printf("Bei i = !true, ist i leider falsch.\n\n");
        }

        System.out.printf("### ### ### ### ### ### ### ### ### ### ### ###\n\n");

        i = !false;

        if (i) {
            System.out.printf("Wenn i = !false, dann ist i = %b \n\n", i);
        } else {
            System.out.printf("Bei i = !false, ist i leider falsch.\n\n");
        }

        System.out.printf("### ### ### ### ### ### ### ### ### ### ### ###\n\n");

        i = false;

        if (i) {
            System.out.printf("Wenn i = false, dann ist i = %b \n\n", i);
        } else {
            System.out.printf("Bei i = false, ist i leider falsch.\n\n");
        }

        System.out.printf("### ### ### ### ### ### ### ### ### ### ### ###\n\n");

        i = (2<=3) && (6>5);

        if (i) {
            System.out.printf("Wenn i = (2<=3) && (4>5), dann ist i = %b \n\n", i);
        } else {
            System.out.printf("Bei i = (2<=3) && (4>5), ist i leider falsch.\n\n");
        }

        System.out.printf("### ### ### ### ### ### ### ### ### ### ### ###\n\n");

        i = (3<=3) || (4>5);

        if (i) {
            System.out.printf("Wenn i = (2<=3) || (4>5), dann ist i = %b \n\n", i);
        } else {
            System.out.printf("Bei i = (2<=3) || (4>5), ist i leider falsch.\n\n");
        }

    }


}
