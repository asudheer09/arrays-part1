package com.example.whileloop;

public class SumOfNumbersUsingWhile {

	public static void main(String[] args) {
		
		int i=0, sum=0;
		
		while(i<=10) {
			sum=sum+i;
			i++;
		}
		
		System.out.println("sum of numbers are "+sum);
		
	}

}
