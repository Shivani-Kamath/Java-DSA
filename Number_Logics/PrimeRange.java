package MyPack;

public class PrimeRange {

	public static boolean Prime(int n) {
		for(int i=2;i<=(n/2);i++) {
		 if(n%i==0) {
			return false;
		 }
		
		}
		return true;
	}
	public static void main(String[] args) {
		int start=2,end=100;
		for(int i=start;i<=end;i++) {
			if(Prime(i)) {
				System.out.println(i+" ");

	}
		}

}
	}
