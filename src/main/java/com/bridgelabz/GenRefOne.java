package com.bridgelabz;

public class GenRefOne {
      
     public static void main(String[] args) {

         
        System.out.println("Welcome to Generic Program.");

         
        Integer a = 20, b = 50, c = 80;
        Float p = 20.85f, q = 90.55f, r = 80.98f;
        String e = "Apple", f = "Peach", g = "Banana";

         
       GenRefOne.getMaximum(a, b, c);
       GenRefOne.getMaximum(p, q, r);
       GenRefOne.getMaximum(e, f, g);
    }

     
    private static <T extends Comparable> void getMaximum(T a, T b, T c) {

        
        T max = a;
        if (b.compareTo(a) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }

         
        System.out.println("Maximum ::" + max);

    }
}
