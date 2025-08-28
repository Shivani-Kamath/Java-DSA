package MyPack;

import java.util.Scanner;

public class BinaryToOctal {

	 public static int power(int base,int exp){
	        int res=1;
	        while(exp>0){
	            res=res*base;
	            exp--;
	        }
	        return res;
	    }
	 public static int reverse(int m){
	        int res=0,rem=0;
	        while(m>0){
	            rem=m%10;
	            m=m/10;
	            res=res*10+rem;

	        }
	        return res;
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=101011;
		int count=0,rem=0,d=0,s=0,m=0,c=0;
		while(n>0){
			rem=n%1000;
			count=0;
			while(rem>0) {
				
				s=rem%10;
				if(s==1){
					d+=power(2,count);
				}
				count++;
				rem=rem/10;
				
			}	m=d;
				n=n/1000;
				d=0;
				c=reverse(m);
				System.out.print(c);
				
		}
	}
}
