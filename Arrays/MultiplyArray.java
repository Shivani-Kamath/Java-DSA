package ArrayPack;
import java.util.*;
public class MultiplyArray {
	public static int MultiplyArray(int n,int arr[]) {
		int sum=1;
		for(int i=1;i<n;i++) {
			sum=sum*arr[i];
		}
		return sum;
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
		System.out.println(MultiplyArray(a,arr));

	}

}
