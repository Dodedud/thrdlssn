package com.hillel;
 
public class Test{

   Public static void main(String... args){

      int a = 10;
      int b = 15;
      int c = 3;

      /*if(a > b){

          if(c > a){

              System.out.println(c);
          }else{

               System.out.println(a);           
            }
      }else{

          if(b > c){

               System.out.println(c);
          }else{

               System.out.println(b);           
            }
       }*/

        int max = (a > b && a > c) ? a : (b > c ? b : c);
   }



}