package MyPack;

public class Pronic {

	public static boolean isPronic(int n) {
		for(int i=1;i<n;i++) {
			if(i*(i+1)==n) {
				return true;
			}	
		}
	
			return false;
		
	}
	
	
	public static void main(String[] args) {
		if(isPronic(12)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}
