package ArrayPack;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int arr[],int x,int low,int high) {
		while(low<=high) {
		int	mid=low+(high-low)/2;
			if(arr[mid]==x)
				return mid;
		    if(arr[mid]<x)
				 low=mid+1;
			else {
				 high=mid-1;	
		}
	}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number of Elements:");
		int n=sc.nextInt();
		
		System.out.println("Enter Elements:");
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter value to search");
		int x=sc.nextInt();
		
		sc.close();
		
		int low=arr[0];
		int high=arr[arr.length-1];
		
		
		System.out.println(binarySearch(arr,x,low,high));

	}

}
