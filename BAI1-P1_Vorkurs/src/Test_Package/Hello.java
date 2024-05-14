package Test_Package;

public class Hello {
    
    public static void main(String [] unused) {
        
        //Ein paar Textausgaben:
        System.out.print("hello world\n");
        System.out.print("Hallo Welt\n");
        System.out.print("noch ein Text\n");
        
        //Ein Array, das int Werte Enthaelt
        int[] numArray = {1,2,3,4,5,6};
        
        //Eine for-Schleife, die den Inhalt des Arrays mit etwas Text auf der Console ausgibt
        for (int i = 0; i <= numArray.length; i++ ) {
            System.out.printf("i = %d liefert aus numArray: %d \n",i,numArray[i]);
        }
        
    }
}
