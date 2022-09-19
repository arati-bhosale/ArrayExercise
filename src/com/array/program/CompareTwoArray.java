package com.array.program;
import java.util.Arrays;
public class CompareTwoArray {

	public static void main(String[] args) {
		
		compare();
	}

	public static void compare() {
		
		int a[] = {10,20,30,40,50};
		int b[] = {10,20,30,40,50};
		int count =0;
		if(a!=null && b!=null) {
			
			if(a.length==b.length) {
				
				for(int i=0; i<a.length; i++) {
					if(a[i]!=b[i]) {
						count++;
					}
				}
				 System.out.println(Arrays.toString(a));
			     System.out.println(Arrays.toString(b));
			    
			     if(count==0) {
			    	 System.out.println("Both arrays exact macth");
			     }
			     else {
			    	 System.out.println("Both arrays exact not match");
			     }
			}else {
				System.out.println("Both array length is same");
			}
			
		}else {
			System.out.println("Array is null");
		}
	}
}
