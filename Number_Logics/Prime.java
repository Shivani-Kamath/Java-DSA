package MyPack;

public class Prime {

	public static void Prime(int n) {
		for(int i=2;i<=n/2;i++) {
		 if(n%i!=0) {
			System.out.println("prime");
			break;
		 }
		 else {
			 System.out.println("not prime");
			 break;
		 }
		}
	}

	public static void main(String[] args) {
		Prime(11);
	}

}
