package PatternPack;

public class Pat1 {
	
	public static int pattern1(int n) {
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<n;j++) {
				if((i-j>=0&&i+j<=2*(n-1))) {
					 System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				}
			System.out.println();
	    }
		
		return 0;
	}

	public static void main(String[] args) {
		pattern1(5);

	}

}
