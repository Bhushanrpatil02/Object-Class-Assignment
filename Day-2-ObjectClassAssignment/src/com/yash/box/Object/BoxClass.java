package com.yash.box.Object;

public class BoxClass {
	   
	    int width; int height ;int depth ;
	    
	   public BoxClass(int width, int height, int depth)
	    {
	        
	        this.width = width;
	        this.height = height;
	        this.depth = depth;
	    }
	    
	    public int volume()
	    {
	        int volume;    
	        volume=width*height*depth;
	        return volume;
	    }
	    
	    public static void main(String[] args)
	    {
	        BoxClass b=new BoxClass(7,8,9);
	        
	        System.out.println("Volume Of Box Is - "+b.volume());
	        
	    }
	}