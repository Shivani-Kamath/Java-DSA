package MyPack;

public class AbundantRange {

	public static boolean isAbundant(int n) {
		int sum=0,c=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
			sum=sum+i;
			}	
		}
		
		if(sum>c) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		int start=2,end=100;
		for(int i=start;i<=end;i++) {
			if(isAbundant(i)) {
				System.out.println(i+" ");
			}
		}

	}

}
