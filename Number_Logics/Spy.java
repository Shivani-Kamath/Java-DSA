package MyPack;

public class Spy {

	public static boolean isSpy(int n) {
		int sum=0,product=1,rem=0,c=n;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		rem=0;
		while(c>0) {
			rem=c%10;
			product=product*rem;
			c=c/10;
			
		}
		
		
		if(sum==product) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		if(isSpy(1124)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
