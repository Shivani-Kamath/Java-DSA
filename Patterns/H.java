package PatternPack;

public class H {
     public static int a(int n) {
    	 for(int i=0;i<n;i++) {
    		 for(int j=0;j<n;j++) {
    			if((j==0)||(j==n-1)||(i==n/2)){
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
