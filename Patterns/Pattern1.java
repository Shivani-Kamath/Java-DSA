package PatternPack;

public class Pattern1 {
	
	public static int pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i*j==0)||(i==n-1)||(j==n-1)||(i-j==0)||(i+j==n-1)||i==(n/2)||j==(n/2)||(i==n/4)||(i==n/2+n/4)||(j==n/4)||(j==3*n/4)||(i+j==n/2)||(i+j==(3*n/2))||(i-j==n/2)||(i-j==(-n/2))) {
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
		pattern1(21);

	}

}
