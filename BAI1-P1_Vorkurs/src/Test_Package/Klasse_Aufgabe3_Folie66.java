package Test_Package;

public class Klasse_Aufgabe3_Folie66 {


    public static void main(String[] args) 
{

// FOLIE 66!
        
     /*
      * for (Initialisierung ; Abbruchbedingung ; Inkrement) {
      *     doSomething;
      * }
      */

 // Was ist das Problem der Schleife? 
        
       // antwort: 1. X & Y Sind nicht definiert und dann ist es eine Endlosschleife. 
        
        int a = 1;
        
        for (int i = 1 ; i < 10 ; i++) {
            a = i * a;
            System.out.println(i);
        }

        
}

}