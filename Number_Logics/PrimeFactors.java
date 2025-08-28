package MyPack;

public class PrimeFactors {

	public static void PrimeFactor(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
		}
		}
		
	}
	public static void main(String[] args) {
		PrimeFactor(30);

	}

}
