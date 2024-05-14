package Test_Package;

public class Aufgabe5_Methoden {
    
    public static void main(String[] args) {
        
       String a;
       
       a = printHelloWorld("huhuh");
       
       System.out.print(a);

    }
    
    public static String printHelloWorld (String a) {
        
        if (a == "Hallo") {
           
            return "Hello World";
            
        } else  {
            
            return "Geh weg!";
            
        }
        
    }    
}