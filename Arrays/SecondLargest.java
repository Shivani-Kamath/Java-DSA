package ArrayPack;

import java.util.Scanner;

public class SecondLargest {
	public static int secondLarge(int n,int arr[]) {
		int max2=0,max1=0;
		max1=max2=arr[0];
		for(int i=0;i<arr.length-1;i++) {
			if(max1<arr[i]) {
				max2=max1;
				max1=arr[i];
			}else if(arr[i]>max2){
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
		int l=secondLarge(n,arr);
        System.out.println(l);
	}

}
