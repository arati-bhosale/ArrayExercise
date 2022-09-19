package com.array.program;
import java.util.Arrays;
import java.util.Scanner;

public class HighestElement {

	public static void main(String[] args) {
		
		highest();
	}

	public static void highest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index number ");
		int num = sc.nextInt();
		int []a = {30,150,50,68,100};
		int count;
		if(num>=0 && num < a.length) {
			for(int i=0; i<a.length; i++) {
				for(int j=i+1; j<a.length; j++) {
					if (a[i]>a[j]) {
						count = a[i];
						a[i]  = a[j];
						a[j]  = count;
					}
				}
			}
			System.out.println(Arrays.toString(a));
			System.out.println(num + " highest element is : " + a[a.length-num]);
		}else
			System.out.println(num + " index not present in Array ");
	}
}
