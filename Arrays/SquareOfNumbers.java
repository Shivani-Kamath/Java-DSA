package ArrayPack;
import java.util.*;
public class SquareOfNumbers {
	public static void SquareArray(int n,int arr[]) {
		
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]*arr[i]);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of Elements:");
		int a=sc.nextInt();
		int arr[]=new int[a];
		System.out.println("Enter Elements:");
		for(int i=0;i<a;i++) {
			arr[i]= sc.nextInt();
		}
		SquareArray(a,arr);

	}

}
