package Test_Package;

public class Klasse_Aufgabe1 {


    public static void main(String[] args) 
{

// FOLIE 54!
        
        
int a = 25 / 4;
System.out.println("Zeile 9 = " + a);

// Wir als 6 ausgegeben weil keine Gleitkommazahl definiert
double b = 25 / 4;
System.out.println("Zeile 11 = " + b);
 
double c = 25.0 / 4.0;
System.out.println("Zeile 14 = " + c);

/* hier kommt 16 raus, weil erst der wert a verwendet wird der ist hier
 * noch 6 ... dann erhöht um 1 also 7 und addiert um a+1 also 8 ... also 6+8 */
int d = ++a + a++;
System.out.println("Zeile 18 = " + d);

//6 ... dann 7 + 7


// Was wird ausgewertet?
// Welchen Wert hat X?

boolean x = a <= b && 4 < 2*2 && !false;

System.out.println(!false);

}

}