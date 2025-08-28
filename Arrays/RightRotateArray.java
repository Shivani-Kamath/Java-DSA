package ArrayPack;

import java.util.Scanner;

public class RightRotateArray {
 public static void rotateArray(int n,int arr[]) {
	 int temp=arr[arr.length-1];
	 for(int i=1;i<arr.length;++i) {
		 arr[n-i]=arr[n-i-1];
	 }
	 arr[0]=temp;
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
