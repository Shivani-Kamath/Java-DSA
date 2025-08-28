package PatternPack;


public class Pat30 {
	public static int pattern1(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<2*n-1;j++) {
				if(j==n-1-i||j==n-1+i) {
					System.out.print(n-i);
					
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
