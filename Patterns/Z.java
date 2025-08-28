package PatternPack;

public class Z {
     public static int a(int n) {
    	 for(int i=0;i<n;i++) {
    		 for(int j=0;j<n;j++) {
    			if((i+j==n-1)||(i==0)||(i==n-1)){
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
