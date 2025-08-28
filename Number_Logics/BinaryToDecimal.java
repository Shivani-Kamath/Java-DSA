package MyPack;
import java.util.Scanner;

public class BinaryToDecimal {
	 public static int power(int base,int exp){
	        int res=1;
	        while(exp>0){
	            res=res*base;
	            exp--;
	        }
	        return res;
	    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0,rem=0,d=0;
		while(n>0) {
			rem=n%10;
			if(rem==1){
				d+=power(2,count);
			}
				count++;
				n=n/10;
			
		}
		System.out.println(d);

	}

}
