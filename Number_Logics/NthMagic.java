package MyPack;

public class NthMagic {

	public static boolean isMagic(int n) {
		int sum=0,rem=0;
		while((n>0) || (sum>9)) {
			if (n == 0) { 
	              n = sum; 
	              sum = 0; 
	           }
			rem=n%10;
			sum+=rem;
			n=n/10;
		}
		if(sum==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int nthMagic(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isMagic(num)) {
			count++;
		}
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println(nthMagic(10));

	}

}
