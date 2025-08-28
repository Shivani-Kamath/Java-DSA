package ArrayPack;

import java.util.Scanner;

public class LinearSearch {
	public static boolean linearSearch(int n,int arr[],int k) {
		int pos=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==k) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Elements:");
		int n=sc.nextInt();
		System.out.println("Enter Key:");
		int k=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		if(linearSearch(n,arr,k)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
