package MyPack;

public class Magic {

	public static boolean isMagic(int n) {
		int sum=0,rem=0;
		while(n>=10) {
			sum=0;
			while(n>0) {
			sum+=n%10;
			n=n/10;
		}
			n=sum;
		}
		if(n==1) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		if(isMagic(6174)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
