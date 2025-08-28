package MyPack;

public class AutomorphicRange {

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
		int start=2,end=100;
		for(int i=start;i<=end;i++) {
			if(Automorphic(i)) {
				System.out.println(i);
			}
		}

	}

}
