package Test_Package;

public class Aufgabe5_Methoden3_Wochentag_switch {
    
    public static void main(String[] args) {
        
       String a;
       
       a = printHelloWorld("Samstag");
       
       System.out.print(a);

    }
    
    public static String printHelloWorld (String a) {
        String erg;
        
        switch (a) { 
            case ("Mo") :
            case ("Montag"): erg = "Aufstehen, Vorlesung!"; break;
            case ("Dienstag"): erg = "Aufstehen, Vorlesung!"; break;
            case ("Mittwoch"): erg = "Aufstehen, Vorlesung!"; break;
            case ("Donnerstag"): erg = "Aufstehen, Vorlesung!"; break;
            case ("Freitag"): erg = "Aufstehen, Vorlesung!"; break;
            case ("Samstag"): erg = "Ausschlafen!"; break; 
            case ("Sonntag"): erg = "Ausschlafen!"; break; 
            default: erg = "Keine Ahnung, was du willst!";
        }
        return erg;
    }
}