package MyPack;

public class PerfectRange {

	public static boolean perfect(int n) {
		int sum=0,c=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==c) {
			return true;
		  }
		  else {
			  return false;
		  }
		

}
	public static void main(String[] args) {

		int start=2,end=200;
		for(int i=start;i<=end;i++) {
			if(perfect(i)) {
				System.out.println(i+" ");
			}
		}
	}

}
