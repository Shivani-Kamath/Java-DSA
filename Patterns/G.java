package PatternPack;

public class G {
	public static int g(int n) {
   	 for(int i=0;i<n;i++) {
   		 for(int j=0;j<n;j++) {
   			if((j==0)||(i==0)||(i==n-1 && j!=n-2)||(j==n/4+n/2 && i>n/2)||(i==n/2+n/3&& j>n/2))
   			{
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
		g(7);

	}

}
