package MyPack;

public class Automorphic {

	public static boolean Automorphic(int n) {
		int ans=0,c=n;
		ans=n*n;
		while(n>0) {
		if(ans%10!=n%10) {
			return false;
		}
		n=n/10;
		ans=ans/10;
		
		}
		return true;
	}

	public static void main(String[] args) {
		if(Automorphic(5776)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
