package MyPack;

public class PerfectSquare {

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
	public static void main(String[] args) {
		
		
		if(isPerfectSquare(400)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}


	}

}
