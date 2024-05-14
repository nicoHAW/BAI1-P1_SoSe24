package Aufgaben_Vorlesung_7;

public class Test_Arrays_MehrdimensionaleArrays {

    public static void main(String[] args){

        int[][][] m; // hat den Grund-Typ int
        m = new int[3][4][5];
        int i = 0;
        for( int x=0; x<3; x++ ){
            for( int y=0; y<4; y++ ){
                for( int z=0; z<5; z++ ){
                    m[x][y][z] = i++;
                    System.out.println(m[0][1][0]);
                }//for
            }//for
        }//for
    } // public void
} // class
