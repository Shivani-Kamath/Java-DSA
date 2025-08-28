package MyPack;

public class PerfectSquareRange {
	
	public static boolean PerfectSquare(int n) {
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
		int start=2,end=100;
		for(int i=start;i<=end;i++) {
			if(PerfectSquare(i)) {
				System.out.println(i);

	}
		}


	}

}
