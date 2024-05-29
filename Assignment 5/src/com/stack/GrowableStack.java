package com.stack;

public class GrowableStack implements Stack {

	public int s=3;
	Customer cs[]=new Customer[s];
	
	
	int top=-1;
	
	@Override
	public void push(Customer c) {
		
		if(top<s)
		{	
			
			cs[++top]=c;
			
					
		}
		else
		{
			Customer cs1[]=new Customer[s];
			
			
			for(int i=0;i<s;i++)
			{
				cs1[i]=cs[i];
			}
			
			int a=s;
			s=s*2;
			cs=new Customer[s];
			
			for(int i=0;i<a;i++)
			{
				cs[i]=cs1[i];
			}
			
			cs[top++]=c;
		}
			
	}

	@Override
	public void pop() {
		
		if(top>=0)
		{	
			System.out.println(cs[top].toString());
			cs[top]=null;
			top--;
			
		}
		else
		{
			System.out.println("Stack UnderFlow");
		}

}
}
