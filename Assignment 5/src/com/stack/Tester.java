package com.stack;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		Stack f=null;
		while(!flag)
		{
			System.out.println("1.Choose fixed Stack");
			System.out.println("2.Choose Growable Stack");
			System.out.println("3.Push");
			System.out.println("4.Pop");
			System.out.println("0.Exit");
			
			System.out.println("Enter your choice");
			switch (sc.nextInt()) {
			case 1:
					f=new FixedStack();
					break;
			
			case 2:
					f=new GrowableStack();
					break;
				
			case 3:	
					
					System.out.println("Enter the id, name and address");
					f.push(new Customer(sc.nextInt(),sc.next(),sc.next()));
					break;
			case 4:
					f.pop();
					break;
				
			}
			
		}
		sc.close();
	}

}
