package Test_Package;

public class Klasse_Aufgabe2 {


    public static void main(String[] args) 
{

// FOLIE 54!
        
     /*
      * for (Initialisierung ; Abbruchbedingung ; Inkrement) {
      *     doSomething;
      * }
      */

 // Was ist das Problem der Schleife? 
        
       // antwort: 1. X & Y Sind nicht definiert und dann ist es eine Endlosschleife. 
        
      /*  
       * int x = 3;
       * int y = 5;
       * 
       * while (x <= y || y <= x) {
       *     
       *    System.out.println("Bedingung Erfüllt");
       * 
       * }  
       */
        
        int n = 5;
        int k = 12;
        
        if (n++ < 6) {
            System.out.println(n + ++k);
        } else {
            System.out.println(n);
        }
}

}