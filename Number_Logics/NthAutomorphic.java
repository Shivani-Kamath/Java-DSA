package MyPack;

public class NthAutomorphic {

	public static boolean isAutomorphic(int n) {
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

	public static int nthAutomorphic(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isAutomorphic(num)) {
			count++;
		}
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println(nthAutomorphic(2));

	}

}
