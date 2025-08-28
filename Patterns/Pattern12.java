package PatternPack;

public class Pattern12{
	
	public static int pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n*2;j++) {
				if((i+j>=n-1 && i-j>=-(n-1))) {
					 System.out.print((char)(65+j)+" ");
				
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
