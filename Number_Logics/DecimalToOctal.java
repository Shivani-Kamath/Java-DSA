package MyPack;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=0;
		int power=1;
		while(n>0) {
			int parity=n%8;
			ans+=parity*power;
			power*=10;
			n=n/8;
	}
		System.out.println(ans);
	}

}
