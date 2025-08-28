package PatternPack;

public class Seven {
	public static int d(int n) {
   	 for(int i=0;i<n;i++) {
   		 for(int j=0;j<n;j++) {
   			if(((i==0))||(j==n-1)||(j==n-1)){
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
		d(5);

	}

}
