package com.largestnum;

import java.util.Scanner;

public class LargestNumber {
	
public int largestNumber(int num1,int num2,int num3){
		
		if(num1>num2 && num1>num3)
			return num1;
		else if(num2>num1 && num2>num3)
			return num2;
		else
			return num3;
	}

	public static void main(String[] args) {
		
		LargestNumber largenum=new LargestNumber();
		System.out.println("Please enter first number");
		Scanner scan1=new Scanner(System.in);
		  int num1=scan1.nextInt();
		
		System.out.println("Please enter second number");
		Scanner scan2=new Scanner(System.in);
		int num2=scan2.nextInt();
		
		System.out.println("Please enter third number");
		Scanner scan3=new Scanner(System.in);
		int num3=scan3.nextInt();
		
		System.out.println("Largest of three numbers is: "+largenum.largestNumber(num1,num2,num3));

	}

	
}
