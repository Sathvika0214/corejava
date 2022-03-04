package com.phase;

public class typecasting {

	public static void main(String[] args) {
		
		//implicit conversion
		System.out.println("Implicit Type Casting");
		
		byte b=125;
		System.out.println("Value of a: "+b);
		
		short s=b;
		System.out.println("Value of a: "+s);
		
		int i=s;
		System.out.println("Value of b: "+i);
		
	    long l=i;
		System.out.println("Value of d: "+l);
		
		float f=l;
		System.out.println("Value of c: "+f);
		 
		
        double d=f;
		System.out.println("Value of e: "+d);
		
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion:high to low: narrowing
		
		double x=45.5;
		int y=(int)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		
	}
}




