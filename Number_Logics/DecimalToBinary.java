package MyPack;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int decimal_number=sc.nextInt();
		int ans=0;
		int power=1;
		while(decimal_number>0) {
			int parity=decimal_number%2;
			ans+=parity*power;
			power*=10;
			decimal_number/=2;
		}
		System.out.println(ans);
	}

}
