package com.app.fruits;

public class Orange extends Fruits {

	
	
	public Orange(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}

	
	public String taste()
	{
		return "sour";
	}
	
	public void juice()
	{
		System.out.println("Name is "+getName()+" with weight is"+getWeight()+"creating Juice!");
	}
	
	
	public boolean equals(Orange obj) {
		if (obj.taste() == "sour")
			return true;
		return false;
	}
}
