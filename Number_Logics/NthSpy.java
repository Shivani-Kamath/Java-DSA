package MyPack;

public class NthSpy {

	public static boolean isSpy(int n) {
		int sum=0,product=1,rem=0,c=n;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		rem=0;
		while(c>0) {
			rem=c%10;
			product=product*rem;
			c=c/10;
			
		}
		
		
		if(sum==product) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int nthSpy(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isSpy(num)) {
			count++;
		}
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println(nthSpy(10));


	}

}
