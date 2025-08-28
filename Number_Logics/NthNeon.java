package MyPack;

public class NthNeon {
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
	public static int nthNeon(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isNeon(num)) {
			count++;
		}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(nthNeon(2));


	}

}
