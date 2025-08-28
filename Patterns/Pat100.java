

package PatternPack;

public class Pat100 {
	
	public static int pattern1(int n) {
		int m=0;
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<8*n;j++) {
				m=j;
				if(i+j==n-1||i-j==-(n)||i+j==2*n+3||i-j==-(2*n+4)||i+j==4*n+3||i-j==-(4*n+4)||i+j==6*n+3||i-j==-(6*n+4)) {
					System.out.print((char)(90-m%26));	
					m=0;
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
		pattern1(4);

	}

}

