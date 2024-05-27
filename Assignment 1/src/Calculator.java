//Day1 Assignement 3

/*
Create java application for the following
Accept 2 numbers from user & operation to perform
1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit
Display the result of the operation. 
Java app must continue to run till user chooses exit option.
*/

import java.util.Scanner;
import java.lang.*;

class Calculator
{

public static void main(String[] args){
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter First Number : ");
	int num1=sc.nextInt();

	System.out.println("Enter Second Number : ");
	int num2=sc.nextInt();
	
	System.out.println("1. Addition :");
	System.out.println("2. Substraction :");
	System.out.println("3. Multiplication :");
	System.out.println("4. Division :");
	System.out.println("5. Exit :");

	

	boolean b = false;
	
	do
	{
		System.out.println("Enter your Choice :");
	int ch = sc.nextInt();
	
	switch(ch){
	 
		case 1:
			{
				System.out.println("Addition is :"+ (num1+num2));
				break;
			}
		case 2:
			{
				System.out.println("Substraction is :"+ (num1-num2));
				break;
			}
		case 3:
			{
				System.out.println("Multiplication is :"+ (num1*num2));
				break;
			}
		case 4:
			{	
				System.out.println("Enter First Number : ");
				double numd1=sc.nextDouble();

				System.out.println("Enter Second Number : ");
				double numd2=sc.nextDouble();

				System.out.println("Division is :"+ (numd1/numd2));
				break;
			}

		case 5:
			{
				System.out.println("Exited Successfully");	
				b=true;			
			}
	}
	}while(!b);
	sc.close();
}

}
