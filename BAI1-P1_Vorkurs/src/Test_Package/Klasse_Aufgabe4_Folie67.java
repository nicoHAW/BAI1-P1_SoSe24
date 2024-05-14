package Test_Package;

public class Klasse_Aufgabe4_Folie67 {


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
        
        boolean a;
        
        for (int i = 0 ; i < 100 ; i++) {
            if (i / 2 > 2) {
                a = true;
                System.out.println(a);
            }  else { 
                 a = false;
                System.out.println(a);
            }
             
         }
            
          

        
}

}