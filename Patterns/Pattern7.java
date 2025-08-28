package PatternPack;

public class Pattern7 {
	
	public static int pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i-j>=0)) {
					 System.out.print(j+1);
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
