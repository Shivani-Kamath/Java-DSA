package PatternPack;

public class Four {
     public static int a(int n) {
    	 for(int i=0;i<n;i++) {
    		 for(int j=0;j<n;j++) {
    			if((j==n/2)||(i+j==n/2)||(i==n/2)){
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
		a(7);

	}

}
