package ArrayPack;
import java.util.*;

public class MaxMin {
	public static int Max(int n,int arr[]) {
		int max=0;
		max=arr[0];
		for(int i=0;i<n;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int Min(int n,int arr[]) {
		int min=0;
		min=arr[0];
		for(int i=0;i<n;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
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
		System.out.println("Max:"+Max(n,arr));
		System.out.println("Min:"+Min(n,arr));

	}

}
