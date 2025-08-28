package MyPack;

public class NthPrime {

	public static boolean isPrime(int n) {
		for(int i=2;i<=n/2;i++) {
		 if(n%i==0) {
			return false;
		 }
		
		}
		return true;
	}
	public static int nthPrime(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isPrime(num)) {
			count++;
		}
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println(nthPrime(50));

	}

}
