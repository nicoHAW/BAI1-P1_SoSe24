package Aufgaben_Vorlesung_7;

public class Test_Arrays_ForEach_Iterator {

    public static void main(String[] args){




        int[] list = { 1, 2, 3, 4, 5, 7, 19};

        for (int element : list) {
            System.out.print( element+", " );
        }
        System.out.println(" ");
        //lässt sich alternativ schreiben als
        for( int e:list ) {
            System.out.print( e +", " );
        }




    } // public void
} // class
