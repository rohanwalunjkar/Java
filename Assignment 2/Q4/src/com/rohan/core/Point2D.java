package com.rohan.core;


public class Point2D
{
	private double x;
	private double y;
	
	public Point2D(int x,int y)
	{
		this.x=x;
		this.y=y;
	
	}
	
	public String show()
	{
	 return ("The X Coordinator is"+x+"Y co-ordinator is"+y);
	}
	
	
	public boolean isEqual(Point2D p)
	{
		if(this.x==p.x && this.y==p.y)
			return true;
		else
			return false;
		
	}
	
	public double calculateDistance(Point2D p)
	{
		double x1 =this.x;
		double y1 =this.y;
		
		double  c=(p.x-x1)*(p.x-x1)+(p.y-y1)*(p.y-y1);
		return (Math.sqrt(c));
	}
	
	
}