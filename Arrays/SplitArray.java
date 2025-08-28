package ArrayPack;

import java.util.Scanner;

public class SplitArray {
	public static int splitArray(int n, int arr[],int index) {
		for(int i=0;i<index;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=index;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		return 0;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements:");
		int n=sc.nextInt();
		System.out.println("Enter index:");
		int index=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		splitArray(n,arr,index);
		
    }
}
