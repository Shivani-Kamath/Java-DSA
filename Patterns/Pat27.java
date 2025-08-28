

package PatternPack;

public class Pat27 {
	public static int pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>n-1) {
					System.out.print((char)(65+i+j-n)+" ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();	
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if((i-j<0)) {
					System.out.print(" "+(char)(65+j));	
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
		pattern1(7);
	}

}

