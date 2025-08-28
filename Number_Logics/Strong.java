package MyPack;

public class Strong {
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		return fact;
	}
	public static void strong(int n) {
		int sum=0,rem=0,fact=0,c=n;
		while(n>0) {
			rem=n%10;
			fact=fact(rem);
			sum=sum+fact;
			n=n/10;
		}
		if(sum==c) {
			System.out.println("strong");
		  }
		  else {
			  System.out.println("not");
		  }
		}
	
	public static void main(String[] args) {
		strong(2);

	}

}
