package com.app.fruits;

public class Mango extends Fruits {
	
	
	
	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste()
	{
		return "sweet";
	}
	
	public String disName()
	{
		return getName();
	}
	
	public void pulp()
	{
		System.out.println("Name is "+getName()+" with color is"+getColor()+"creating  pulp!");
	}
	
	public boolean equals(Mango obj) {
		if (obj.taste() == "sour")
			return true;
		return false;
	}
}
