package MyPack;

public class NeonRange {

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
		int start=0,end=100;
		for(int i=start;i<end;i++) {
			if(isNeon(i)) {
				System.out.println(i);
			}
		}


	}

}
