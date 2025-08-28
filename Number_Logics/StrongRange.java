package MyPack;

public class StrongRange {
	
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		return fact;
	}
	public static boolean strong(int n) {
		int sum=0,rem=0,fact=0,c=n;
		while(n>0) {
			rem=n%10;
			sum+=fact(rem);
			n=n/10;
		}
		if(sum==c) {
			return true;
		}
		else {
			return false;
		}}

	public static void main(String[] args) {
		int start=2,end=200;
		for(int i=start;i<=end;i++) {
			if(strong(i)) {
				System.out.println(i+" ");
			}
		}

	}

}
