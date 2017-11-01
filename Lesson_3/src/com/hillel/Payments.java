package com.hillel;

import java.util.Scanner;

public class Payments{

	public static void main(String... args){

                Scanner scanner = new Scanner(System.in);

                System.out.print("Type quantity of days: ");            
                int days = scanner.nextInt();
                
                System.out.print("Type price for each day : ");            
                int price = scanner.nextInt();

                
	        int totalPrice= days * price;

		if(days >= 5 && days <= 7){

			totalPrice -= 20;
		}
		 if(days > 7){

            totalPrice -= 50;
            
		}


        System.out.println(totalPrice);
	}
 

}