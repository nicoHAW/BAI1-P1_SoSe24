package Vorlesung16_10062024;

import java.util.*;

public class InDerVorlesung {

    public static void main( String[] args ){

        Collection<String> c = new ArrayList<String>();
        
        for ( int i=0; i<10; i++ ){ c.add( (new Integer(i)).toString() ); }
        //Iterator iterObject = c.iterator();
        /*
        while ( iterObject.hasNext() ){
            String elem = (String)iterObject.next();
            System.out.printf("%s ", elem );
        }//while
        Iterator<String> iterString = c.iterator();

        while ( iterString.hasNext() ){
            String elem = iterString.next();
            System.out.printf("%s ", elem );
        }//while

         */
        for ( String elem : c ){ System.out.printf("%s ", elem ); }

        Iterator<String> i = c.iterator();

        while ( i.hasNext() ){
            String e1 = i.next();
            if ( i.hasNext() ){ String e2 = i.next(); }
            // System.out.printf("%s %s ", e1, e2 );
            i.remove();
        }//while
        for ( String elem : c ){ System.out.printf("%s ", elem ); }
    }//method()

}
