package ArrayPack;

import java.util.Scanner;

public class SwapAlternate {
 public static void swap(int n,int arr[]) {
	 int i=0;
	 while(i+1<arr.length) {
		 int temp=arr[i];
		 arr[i]=arr[i+1];
		 arr[i+1]=temp;
		 i+=2;
	 }
	 for(i=0;i<n;i++) {
		 System.out.print(arr[i]+" ");
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
		swap(n,arr);
			
		
	}
}
