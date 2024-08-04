package Vorlesung13;

public class Vorlesung13_Code {

    public static void main(String[] args){

        int n = 8;

        int[] m = new int[n];

        for (int i=0; i<n; i++) {
        System.out.print(m[i]+",");
        }

        for (int i=0; i<n; i++) {
            m[i]=i;
            System.out.print(m[i]+",");
            }
        
    } // public void
} // class
