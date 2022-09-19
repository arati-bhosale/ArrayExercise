package com.array.program;

import java.util.Arrays;

public class AssendingNumber {

	public static void main(String[] args) {
		
		assendingOrder();
	}
		private static void assendingOrder() {
		
		int a[] = {30,20,40,50,60,10};
		int b[] = new int[a.length];
		int c;
		System.out.println(" before array = " + Arrays.toString(a));
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					c    = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
	     System.out.println(" After sorting assending order in array = " + Arrays.toString(a));		
	}
}
