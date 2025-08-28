package ArrayPack;

import java.util.Scanner;
public class SelectionSort {
	public static void selectionSort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
		int minindex=i;
		for(int j=i+1;j<arr.length;j++) {
			minindex=j;
		    if(arr[i]>arr[minindex]) {
		    	int temp=arr[i];
		 		arr[i]=arr[minindex];
		 		arr[minindex]=temp;
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
		selectionSort(arr);	
	}
}
