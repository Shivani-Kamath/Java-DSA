package PatternPack;

public class T {
     public static int a(int n) {
    	 for(int i=0;i<n;i++) {
    		 for(int j=0;j<n;j++) {
    			if((j==n/2)||(i==0)){
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
		a(5);

	}

}
