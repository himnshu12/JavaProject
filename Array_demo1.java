package com.him;

public class Array_demo1 {

	public static void main(String args[]) {
		
		
		int arr[]= {6,5,4,3,2,1};
		int b1[]=new int[arr.length];
		int count=0;
		for(int i=arr.length-1;i>=0;i--) {
			b1[count]=arr[i];
			count++;
		}
		System.out.println("-------Reverse Array is-------");
		for(int j=0;j<b1.length;j++) {
			System.out.print(b1[j]+" ");
		}
		
	}
	
	
}
