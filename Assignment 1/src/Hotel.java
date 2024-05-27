//Day1 Assignment 2

/*
Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(10) , display total bill & exit.
*/

import java.util.Scanner;
import java.lang.*;

class Hotel
{

public static void main(String [] args)
{	
	
Scanner sc=new Scanner(System.in);

int sum=0;
boolean b=false;
do
{
System.out.println("Menu");
System.out.println("1.Dosa:50Rs");
System.out.println("2.Samosa:20Rs");
System.out.println("3.Idli:20Rs");
System.out.println("4.POha:20Rs");
System.out.println("5.Cake:10Rs");
System.out.println("6.Exit");
System.out.println("Enter Your Item");

int ch=sc.nextInt();

switch(ch)
{
	case 1:
			{
				sum+=50;
				break;
			}
	case 2:
			{
				sum+=20;
				break;
			}
	case 3:
			{
				sum+=20;
				break;
			}
	case 4:
			{
				sum+=20;
				break;
			}	
	case 5:
			{
				sum+=10;
				break;
			}
	case 6:
			{
				System.out.println("Your Order is Confirmed");
				b=true;
			}


}



}while(!b);

		System.out.println("Your Bill Amount is"+sum);


	sc.close();
}
}