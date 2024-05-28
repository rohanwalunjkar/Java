package com.rohan.tester;
import java.util.Scanner;
import com.rohan.core.Point2D;

class TestPoint
{	
	Scanner sc=new Scanner(System.in);
	
	public static void main(String [] args)
	{
			Point2D p1=new Point2D(10,20);
			Point2D p2=new Point2D(30,40);
			
			System.out.println(p1.show());
			System.out.println(p2.show());
			
			if(p1.isEqual(p2))
				System.out.println("Same");
			else
				System.out.println("Different");
			
			double distance=p1.calculateDistance(p2);
			
			System.out.println("Distance between two point is"+distance);
	}

}