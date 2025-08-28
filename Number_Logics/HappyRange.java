package MyPack;

public class HappyRange {
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
		int start=0,end=100;
		for(int i=start;i<end;i++) {
			if(isHappy(i)) {
				System.out.println(i);
			}
		}

	}

}
