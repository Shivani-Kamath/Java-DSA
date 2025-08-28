package MyPack;

public class NthStrong {

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
	
	public static int nthStrong(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(strong(num)) {
			count++;
		}
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println(nthStrong(5));

	}

}
