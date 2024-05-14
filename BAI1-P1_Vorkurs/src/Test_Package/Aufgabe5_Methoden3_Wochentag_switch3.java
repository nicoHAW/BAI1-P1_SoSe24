package Test_Package;

public class Aufgabe5_Methoden3_Wochentag_switch3 {
    
    public static void main(String[] args) {
        
       String a;
       
       a = printHelloWorld("Montag");
       
       System.out.print(a);

    }
    
    public static String printHelloWorld (String a) {
        String erg;
        
        switch (a) { 
            case ("Mo") :
            case ("Montag"):
            case ("Dienstag"):
            case ("Mittwoch"):
            case ("Donnerstag"):
            case ("Freitag"): erg = "Aufstehen, Vorlesung!"; break;
            case ("Samstag"): 
            case ("Sonntag"): erg = "Ausschlafen!"; break; 
            default: erg = "Keine Ahnung, was du willst!";
        }
        return erg;
    }
}