package com.app.fruits;

public class Apple extends Fruits {
	
	
	
	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
		// TODO Auto-generated constructor stub
	}

	public String taste()
	{
		return "sweet n sour";
	}
	
	public void jam()
	{
		System.out.println("Name is "+getName()+" with color is"+getColor()+"making jam!");
	}
	
	public boolean equals(Apple obj) {
		if (obj.taste() == "sour")
			return true;
		return false;
	}
}
