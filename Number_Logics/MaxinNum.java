package MyPack;

public class MaxinNum {

	
	public static int large1(int m,int n) {
		int max=0;
		if(m>n) {
		max=m;
		}
		else {
			max=n;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int n=28102;
		int max=0,rem=0,large=0;
		while(n>0) {
			rem=n%10;
			large=large1(rem,max);
			max=large;
			n=n/10;
		}
		System.out.println("Max:"+large);
		
	}	
		

	}

