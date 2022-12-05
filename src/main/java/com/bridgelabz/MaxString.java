package com.bridgelabz;

public class MaxString {
    public static void main(String[] args) {

        
        String e = "Watermelon", f = "heimdallwitch" , g = "Banana";

         
        testMaximum (e,f,g); 
    }

     

    private static void testMaximum(String e, String f, String g) {
        String max = e;

        
        if(f.compareTo(e)>0){
            max = f;
        }
        if(g.compareTo(max)>0){
            max = g;
        }

        
        System.out.println("Maximum String is: "+max);

    }

}
