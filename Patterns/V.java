package PatternPack;

public class V {
	public static int c(int n) {
   	 for(int i=0;i<n;i++) {
   		 for(int j=0;j<n;j++) {
   			if((i-j==0)){
   				System.out.print("* ");
   			}else {
   				System.out.print("  ");
   			}
   		 }
   		
      		 for(int j=0;j<n;j++) {
      			if((j+i==n-1)){
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
