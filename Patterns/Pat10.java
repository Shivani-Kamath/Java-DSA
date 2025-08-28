package PatternPack;

public class Pat10 {
	
	public static int pattern1(int n) {
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1 && i-j<=0) {
					System.out.print((char)(65+j+n/2));
					
				}
				else {
					System.out.print(" ");
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
