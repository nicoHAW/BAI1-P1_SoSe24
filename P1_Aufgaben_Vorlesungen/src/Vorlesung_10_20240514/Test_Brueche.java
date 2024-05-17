package Vorlesung_10_20240514;

public class Test_Brueche {

    public static void test( int... args ){

        add(3, 4);
        
    }//method()


    class Fraction {
        int n; // numerator -> Fedvariable
        int d; // denominator -> Fedvariable

        void add( Fraction f ){
            this.n = this.n*f.d + f.n*this.d; //this beszieht sich auf die Feldvariable. mit f.d bezeiht man sich auf die Variable innerhalb dieser Methode. 
            this.d = this.d*f.d;

            System.out.println(this.n);
        }//method()

    }//class
}//class  
