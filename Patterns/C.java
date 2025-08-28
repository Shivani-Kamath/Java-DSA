package PatternPack;

public class C {
	public static int c(int n) {
   	 for(int i=0;i<n;i++) {
   		 for(int j=0;j<n;j++) {
   			if((j==0)||(i==0)||(i==n-1)){
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
		c(5);

	}

}
