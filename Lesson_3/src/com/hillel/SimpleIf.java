package com.hillel;
  
public class SimpleIf{

     public static void main(String... args){

        byte a = 5;
        byte b = 12;

        byte max = CalculateMaximum(a, b);

        System.out.println("Maximum = " + max);
       

     }

     public static byte CalculateMaximum(byte a, byte b){

        byte max = a > b ? a : b;
        return max;
     }
}