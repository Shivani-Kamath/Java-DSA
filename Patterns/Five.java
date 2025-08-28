package PatternPack;

public class Five {
	public static int e(int n) {
   	 for(int i=0;i<n;i++) {
   		 for(int j=0;j<n;j++) {
   			if((j==0 && i<n/2)||(i==0)||(i==n-1)||(i==n/2)||(j==n-1 && i>n/2)){
   				System.out.print("* ");
   			}else {
   				System.out.print("  ");
   			}
   		 }
   		 System.out.println( );
   	 }
   	 return 0;
    }

	public static void main(String[] args) {
		e(5);

	}

}
