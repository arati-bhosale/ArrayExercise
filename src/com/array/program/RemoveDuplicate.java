package com.array.program;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		int a[] = {2,2,5,5,6,8};
		int count;
		System.out.println(" before array " + Arrays.toString(a));
		System.out.println(" After removing duplicate element in array ");
		for(int i=0; i<a.length; i++) {
			count = 0;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			
			if(count<1) {
			
			System.out.print("  " + a[i] );
			}
		}
	}
}
