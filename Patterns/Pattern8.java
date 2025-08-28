package PatternPack;

public class Pattern8{
	
	public static int pattern1(int n) {
		int a=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if((i-j>=0)) {
					 System.out.print(a+" ");
					 a++;
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
