package com.array.program;
import java.util.Arrays;
import java.util.Scanner;
public class DecendingOrder {

public static void main(String[] args) {
	
	decending();
}
    public static void decending() {
	    
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter index which is lowest  element");
    	int num = sc.nextInt();
    	int a[] = {50, 30, 10, 40, 20};
    	int b[] = new int[a.length];
    	int c;
    	
    	if(num>0 && num<a.length){
    	for(int i=0; i<a.length; i++) {
    		
    		for(int j=i+1; j<a.length; j++) {
    			
    			if(a[i]<a[j]) {
    				
    			c    = a[i];
    			a[i] = a[j];
    			a[j] = c;
    				
    			}
    		}
    	} 	 System.out.println(Arrays.toString(a));
    	System.out.println(num + " of lowest element :" + a[a.length-num]);

    	} 
    	else  
    		System.out.println("value is not present");
}
   
}
