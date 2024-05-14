package Test_Package;

public class Aufgabe5_Methoden2 {
    
    public static void main(String[] args) {
        
       String a;
       
       a = printHelloWorld("Ja");
       
       System.out.print(a);

    }
    
    public static String printHelloWorld (String a) {
        String erg = "?";
       
        if (a == "Ja") {
            erg = "Nein"; 
            }
        
        if (a == "Nein") {
            erg = "Ja";
        }
        return erg;
        
        }    
}