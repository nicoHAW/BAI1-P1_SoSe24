package Vorlesung_10_20240514;

public class Test_KlassenInit {

        public static void main( int... args ){
            
            Date x;
            x = new Date(); // Neues Exemplar des Typ (Klasse) Datum erstelen. 
            x.day = 11; // Datum wird zugewiesen. 
            x.month = "April"; // Monat wird zugewiesen. 
            x.year = 2006; // Jahr wird zugewiesen.

            System.out.printf("%s", x);

        }//method()
    }//class
