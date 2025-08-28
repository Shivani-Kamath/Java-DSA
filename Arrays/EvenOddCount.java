package ArrayPack;
import java.util.*;

public class EvenOddCount {
	public static int Evencount(int n,int arr[]) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		
		}
		return count;
	}
	public static int Oddcount(int n,int arr[]) {
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		
		}
		return count;
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
		System.out.println("Count Even:"+Evencount(n,arr));
	    System.out.println("Count Odd:"+Oddcount(n,arr));
		
	}

}
