package com.app.fruits;

import java.util.Objects;

public class Fruits {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;
	
	public Fruits(String color, double weight, String name, boolean fresh) {

		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}
	
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public double getWeight() {
		return weight;
	}



	public void setWeight(double weight) {
		this.weight = weight;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public boolean isFresh() {
		return fresh;
	}



	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	public String disName()
	{
		return name;
	}



	@Override
	public String toString()
	{
		return "Name : "+name+" color : "+color+" weight : "+weight;
	}
	
	
	public String taste()
	{
		return "No specific taste";
	}
	
	public boolean equals(Fruits obj) {
		return false;
	}


	
	}
	
	

