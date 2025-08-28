package PatternPack;

public class Pattern6 {

	public static int pat(int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(!(i-j>(-n/2) && i+j>n/2 && i+j<3*(n/2) && i-j<n/2))
					System.out.print("* ");
					else
					System.out.print("  ");
					
			}
			System.out.println();
		}
		
		
		
		return 0;
	}
	
	
	
	public static void main(String []a) {
		pat(11);
	}
}
