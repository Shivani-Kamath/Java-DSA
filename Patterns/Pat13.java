package PatternPack;

public class Pat13 {
	
	public static int pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print(i+1+" ");
					
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
		pattern1(9);

	}

}
