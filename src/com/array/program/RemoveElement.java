package com.array.program;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		
		removeElement();
	}

	public static void removeElement() {
		
		int a[] = {40,50,60,70};
		int b[] = new int [a.length-1];
		System.out.println(Arrays.toString(a));
		int j = 0;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to remove :");
		int num = sc.nextInt();
		
		for(int i=0; i<a.length; i++) {
			
			if(num == a[i])
				count++;
		}
		if(count != 0) {
			for(int i=0; i<a.length; i++) {
				
				if(a[i] != num) {
					b[j] = a[i];
					j++;
				}
			}
		}
		else {
			System.out.println("Element is not present in array :" +num);
		}
		if(count != 0)
			System.out.println("After removing element :" +Arrays.toString(b));
	}

	
}
