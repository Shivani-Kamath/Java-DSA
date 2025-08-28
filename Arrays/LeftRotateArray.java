package ArrayPack;

import java.util.Scanner;

public class LeftRotateArray {
 public static void rotateArray(int n,int arr[]) {
	 int temp=arr[0];
	 for(int i=1;i<arr.length;++i) {
		 arr[i-1]=arr[i];
	 }
	 arr[arr.length-1]=temp;
	 for(int i=0;i<arr.length;i++) {
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
		rotateArray(n,arr);
			
		
	}
}
