package Vorlesung_8;

public class Test_Methode {

    public void test( int... args ){

        
        for( int i=0; i<args.length; i++ ){
            System.out.printf(
                    "Der %d.Parameter mit dem Index %d lautet: %d\n",
                    i+1, i, args[i]
                    );
        }//for
    }//method()
    
    public void doTest(){
        test( 2, 5, 7 );
        System.out.println( "THE END" );
    }//method()
}//class