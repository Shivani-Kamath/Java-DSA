package MyPack;

public class MinimumNum {
	public static int minimum(int m,int n) {
		int min=0;
		if(m<n) {
		min=m;
		}
		else {
			min=n;
		}
		return min;
	}

	public static void main(String[] args) {
		int n=201;
		int min=9,rem=0,small=0;
		while(n>0) {
			rem=n%10;
			small=minimum(rem,min);
			min=small;
			n=n/10;
		}
		System.out.println("Min:"+small);
		
	}	
		

	

}
