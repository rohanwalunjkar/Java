package com.stack;

public class FixedStack implements Stack {

	Customer cs[]=new Customer[size];
	
	int top=0;
	
	@Override
	public void push(Customer c) {
		
		if(top<size)
		{	
			
			cs[top++]=c;
					
		}
		else
		{
			System.out.println("Stack is full");
		}
			
	}

	@Override
	public void pop() {
		
		if(--top>=0)
		{	
			System.out.println(cs[top].toString());
			cs[top]=null;
			
		}
		else
		{
			System.out.println("Stack UnderFlow");
		}
		
		
	}

	
}
