package Aufgaben_Vorlesung_7;

public class Übung4_Arrays_SiebVonErasthos2 {

    public static void main(String[] args){

        //Array
        int n=100;
        boolean[] p=new boolean [n];

        //Set entries true
        for (int i=2; i<n; i++) {
            p[i]=true;
        } // end fot

        //delete products
        for (int i=2; i<n; i++) {
            if (p[i])
             {
                for (int j=i*i; j<n; j=j+i) {
                    p[j]=false;
                } // end inner for
            }
        } // end outer for

        // Print prime
        for (int i=2; i<n; i++) {
            if (p[i]) {
                System.out.print(i+" ");
            }
        }

    } // public void
} // class
