package Aufgaben_Vorlesung_7;

public class Übung5_Arrays_Iterator_MultiArrays {

    public static void main(String[] args){

        int[][][] list = { {{ 1, 2},{ 3, 4},{ 5, 6}},
                           {{ 7, 8},{ 9,10},{11,12}},
                           {{13,14},{15,16},{17,18}}
                         };

        for( int[][] e1:list ) {
            for( int[] e2:e1 ) {
                for( int e3:e2 ) {
                    System.out.print( e3 + ", " );
                }//for
            }//for
        }//for


        int[][][] list2 = { {{ 1, 2},{ 3, 4},{ 5, 6}},
                           {{ 7, 8},{ 9,10},{11,12}},
                           {{13,14},{15,16},{17,18}}
                         };
        System.out.println("\n\n");

        for (int[][] element : list2) {
            for( int i2=0; i2<element.length; i2++ ){
                for( int i3 =0; i3<element[i2].length; i3++ ){
                    System.out.print( element[i2][i3]+", ");
                }//for
            }//for
        }//for



    } // public void
} // class
