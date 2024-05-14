package Test_Package;

public class Aufgabe5_Methoden_Hallo_oneReturn {
    
    public static void main(String[] args) {
        
       String a;
       
       a = printHelloWorld("Nein");
       
       System.out.print(a);

    }
    
    public static String printHelloWorld (String a) {
        
      
        if (a == "Hallo") {
           
            a = "Hello World";
            
        } else  {
            
            a = "Geh weg!";
            
        }
        return a;
    }    
}