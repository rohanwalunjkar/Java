//Day1 Assignment 1

/*
Accept 2 double values from User (using Scanner). Check data type.
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.
Hint : Method of Scanner to use : hasNextDouble , nextDouble 
*/

import java.util.Scanner;
import java.lang.*;

 class CheckDouble
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter two Double Number");
		  
		  //double num2=sc.nextDouble();
		  double num1=0,num2=0;
		  if( sc.hasNextDouble())
		  {
			 num1=sc.nextDouble();
			
		  }
		  else
		  {
			  System.out.println("Entered Wrong Input ");
		  }
		
		  if( sc.hasNextDouble())
		  {
			  num1=sc.nextDouble();
			}
		  else
		  {
			  System.out.println("Entered Wrong Input ");
		  }
		  
		  System.out.println("Average"+(num1+num2)/2);
		  
		  sc.close();
	}
}