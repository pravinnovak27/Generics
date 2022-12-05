package com.bridgelabz;

public class MaxInteger {
    public static void main(String[] args) {

        //variables
        Integer a = 52, b = 34, c =10;
        
        testMaximum (a,b,c); //calling method
    }

    /*
    create testMaximum method and passing parameter
     */
    private static void testMaximum(Integer a, Integer b, Integer c) {
        Integer max = a;
        /*
        checking the condition and finding maximum no
         */
        if(b.compareTo(a)>0){
            max = b;
        }
        if(c.compareTo(max)>0){
            max = c;
        }
        System.out.println("Maximum Number is::"+max);
    }
}
