package com.example.whileloop;

import java.util.Scanner;

public class WhileLoopTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 9 X 1= 9
		 * 9 X 2= 18
		 * 
		 * 
		 * 9 X 10=90
		 */
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int n=sc.nextInt();
		int i=1;
		while(i<=10) {
			System.out.println(n+" X "+i+" = "+(n*i));
			i++;
		}
		
		
		
		

	}

}
