package PatternPack;

public class Pat3 {
     public static int a(int n) {
    	 for(int i=n;i>=0;i--) {
    		for(int j=n;j>=i;j--) {
    			 System.out.print(j);	
    	 }
    	System.out.println();
        }
    	 for(int i=1;i<=n;i++) {
      		for(int j=n;j>=i;j--) {
      			 System.out.print(j);	
      	 }
      	System.out.println();
          }
    	 
    	 return 0;
     }
	public static void main(String[] args) {
		a(3);

	}

}