package Aufgaben_Vorlesung_2;

public class Übung4_byteVariablen {

    public static void main(String[] args){


        byte b1 = 0x2A;
        byte b2 = 0x1F;
        
        System.out.printf("Was ist b1 bei 0x2A? b1 = %b\n", b1);
        System.out.printf("Was ist b2 bei 0x1F? b2 = %b\n", b2);
        System.out.printf("Was ist b2 bei 0x1F? b2 = %b\n", ~b2);

        int bSum;

        bSum = b1 - b2;
        
        System.out.printf("Was ist denn bSum = %b\n", bSum);
        
        System.out.printf("### ### ### ### ");

       /*
        * if (b1 | b2) {
        *    System.out.printf("Ja, b1 = %b oder b2=%b", b1, b2);
        *} else {
        *    System.out.printf("Nein, b1 = %b oder b2=%b", b1, b2);
        *}
        *
        *if (b1 & b2) {
        *    System.out.printf("Ja, b1 = %b oder b2=%b", b1, b2);
        *} else {
        *    System.out.printf("Nein, b1 = %b oder b2=%b", b1, b2);
        *}
        *
        *Frage: Wie verwendet man hier b1 & b2 und b1 | b2?
        */


        System.out.printf("### ### ### ### ");

    }


}
