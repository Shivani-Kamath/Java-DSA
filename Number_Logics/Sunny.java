package MyPack;

public class Sunny {

	public static boolean isSunny(int n) {
		int square=0,s=0;
		square=(n+1);
		for(int i=0;i<=square;i++) {
			if(i*i==square) {
				s=1;
				break;
			}
		}
		if(s==1) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		if(isSunny(9)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
