package MyPack;

public class Neon {

	public static boolean isNeon(int n) {
		int square=0,sum=0,rem=0;
		square=n*n;
		while(square>0) {
			rem=square%10;
			sum=sum+rem;
			square=square/10;
			
		}
		if(sum==n) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		if(isNeon(9)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
