package ArrayPack;

import java.util.Scanner;

public class ThirdLargestNumber {
	public static int thirdLarge(int n,int arr[]) {
		int max=0,max1=0,max2=0;
		max=arr[0];
		for(int i=0;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		max1=0;
		for(int i=0;i<n;i++) {
			if(max1<arr[i] && arr[i]<max) {
				max1=arr[i];
			}
		}
		max2=0;
		for(int i=0;i<n;i++) {
			if(max2<arr[i] && arr[i]<max1) {
				max2=arr[i];
			}
		}
		return max2;
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
		int l=thirdLarge(n,arr);
       
        System.out.println(l);
	}

}
