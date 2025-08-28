package MyPack;

public class Perfect {

	public static void perfect(int n) {
		int sum=0,c=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==c) {
			System.out.println("Perfect");
		  }
		  else {
			  System.out.println("not");
		  }
		

}
	public static void main(String[] args) {
		perfect(6);

	}
}