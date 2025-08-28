package MyPack;

public class SunnyRange {
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
		int start=0,end=100;
		for(int i=start;i<end;i++) {
			if(isSunny(i)) {
				System.out.println(i);
			}
		}

	}

}
