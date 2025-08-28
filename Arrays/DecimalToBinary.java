package ArrayPack;

import java.util.Scanner;

public class DecimalToBinary {
	public static int decimalToBinary(int n) {
	  int ans=0,power=1;
    		  while (n > 0) {
                  int rem=n%2;
                  ans+=rem*power;
                  power*=10;
                  n/=2;
    		  }
    		  return ans;
      
	}
	 public static void decimalbinary(int n,int arr[]) {
		 for(int i=0;i<n;i++) {
			 System.out.println(decimalToBinary(arr[i]));
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
		
		decimalbinary(n,arr);
}
}