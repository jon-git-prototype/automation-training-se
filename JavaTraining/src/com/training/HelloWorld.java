package com.training;

public class HelloWorld {
	
	public void xnonStatic() {
		System.out.println("Non Static");
		int eight = 8;
		int nine = 9;
		
		if (eight == nine) {
			System.out.println("number is equal");
			
		}else if(eight != nine) {
			System.out.println("number is not equal");
		}
	}
	
	public static void xStatic() {
		System.out.println("Static");
		
		String val = "30";
		
		switch(val) {
		
		case "10":
			System.out.println("val");
			break;
		case "20": 
			System.out.println("val");
			break;
		case "30": 
			System.out.println("val");
			break;
		case "40": 
			System.out.println("val");
			break;
		default:
			System.out.println("else");
		}
		
	}
	
	public int compTotal(int a, int b) {
		int c = 0;
		c = a + b;
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld helloNonStatic = new HelloWorld();
		System.out.println("Hello World");
		xStatic();
		helloNonStatic.xnonStatic();
		
	}

}
