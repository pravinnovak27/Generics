package com.bridgelabz;

class MyException extends Exception {
    public MyException(String a)
    {       
        super(a);
    }
}
 public class CustomExp {
     
    public static void main(String args[])
    {
        try {
             
            throw new MyException("Watermelon");
        }
        catch (MyException ex) {
            System.out.println("Bicycle");
            System.out.println(ex.getMessage());
        }
    }
}