package com.array.program;

public class Average {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			
			sum = sum + a[i];
		}
		
		double avg = sum / a.length;
		System.out.println(" Average of given array is = " + avg);
	}
}
