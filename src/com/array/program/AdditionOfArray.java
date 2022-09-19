package com.array.program;

import java.util.Arrays;

public class AdditionOfArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40};
		int b[] = {10,20,30,40};
		int c[] = new int[a.length];
		int j = 0;
		
		for(int i=0; i<a.length; i++) {
			
			c[j] = a[i] + b[j];
			j++;
		}
		System.out.println(" Addition of two Array = " + Arrays.toString(c));	
	}
}
