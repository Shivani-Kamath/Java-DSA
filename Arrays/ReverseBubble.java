package ArrayPack;

import java.util.Scanner;

public class ReverseBubble {
	
	public static void bubbleSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
			    if(arr[j]>arr[j+1]) {
			    	int temp=arr[j];
			 		arr[j]=arr[j+1];
			 		arr[j+1]=temp;
			    }
		}	
		
	 }
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		bubbleSort(arr);
	}
}
