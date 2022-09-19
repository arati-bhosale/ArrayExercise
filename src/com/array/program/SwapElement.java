package com.array.program;
import java.util.Arrays;
import java.util.Scanner;
public class SwapElement {

	public static void main(String[] args) {
		
		swap();
	}

	public static void swap() {

		int p[] = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index number in array");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =0;
		
		   c = p[a];
		p[a] = p[b];
		p[b] = c;
		System.out.println(Arrays.toString(p));
	}
}
