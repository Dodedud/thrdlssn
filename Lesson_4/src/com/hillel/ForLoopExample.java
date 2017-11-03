package com.hillel;

public class ForLoopExample{
    
    public static void main(String[] args){
        
       /* int i = 11;
        do{
            System.out.println("Hello, world!");
        }while(i < 10)*/
        
       /* for (int i = 0;i < 10; i++){
            System.out.println(i);*/
        
        int number = Integer.parseInt(args[0]);
        int sum = 0;
        while(number > 0){
            
            int n = number % 10;
            sum += n; 
            number /= 10;
 
        }
            System.out.println("Sum= " + sum);
        }
} 
