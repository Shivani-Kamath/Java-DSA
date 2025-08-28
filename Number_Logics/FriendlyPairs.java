package MyPack;

public class FriendlyPairs {

	public static boolean isFriendlyPairs(int n,int m) {
		int sum_m=0,sum_n=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum_n+=i;
			}
			
		}
		for(int i=1;i<m;i++) {
			if(m%i==0) {
				sum_m+=i;
			}
			
		}
		if(sum_n * m == sum_m * n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public static void main(String[] args) {
		if(isFriendlyPairs(30,140)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
