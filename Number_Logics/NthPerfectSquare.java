package MyPack;

public class NthPerfectSquare {
	public static boolean isPerfectSquare(int n) {
		int i=1;
		while(i*i<=n) {
		if(i*i==n) {
			return true;
		}
		i++;
		}
		return false;
	}
  
	public static int nthPerfectSquare(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isPerfectSquare(num)) {
			count++;
		}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(nthPerfectSquare(5));


	}

}
