package MyPack;

public class MagicRange {
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
		int start=2,end=100;
		for(int i=start;i<end;i++) {
			if(isMagic(i)) {
				System.out.println(i+" ");
			}
		}

	}

}
