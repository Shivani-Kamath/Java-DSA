package MyPack;

public class Happy {

	public static boolean isHappy(int n) {
		int rem=1,sum=0;
		do {
			sum=0;
			while(n>0) {
				rem=n%10;
				sum+=(rem*rem);
				n=n/10;
			}
			n=sum;
		}while(sum>6);
		if(sum==1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		if(isHappy(7)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
