package Vorlesung_10_20240514;

public class Test_Brueche {

    public static void main( String[] args ){

        Fraction bla = new Fraction(1,2);
        Fraction blup = new Fraction(2,2);

        bla.add(blup);
        
    }//method()
 
}//class  

class Fraction {
    int n; // numerator -> Fedvariable
    int d; // denominator -> Fedvariable

    Fraction(int zaehler, int nenner) {
      
        n = zaehler;
        d = nenner;  
    }
    
    void add( Fraction f ){
        this.n = this.n*f.d + f.n*this.d; //this bezieht sich auf die Feldvariable. mit f.d bezeiht man sich auf die Variable innerhalb dieser Methode. 
        this.d = this.d*f.d;

        System.out.println(this.n);
    }//method()
}//class