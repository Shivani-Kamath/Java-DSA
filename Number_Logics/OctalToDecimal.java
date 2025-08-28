package MyPack;

public class OctalToDecimal {
	 public static int power(int base,int exp){
	        int res=1;
	        while(exp>0){
	            res=res*base;
	            exp--;
	        }
	        return res;
	    }

	public static void main(String[] args) {
		int n=173;
		int rem=0,c=0,count=0;
		while(n>0) {
		rem=n%10;
		c+=rem*power(8,count);
		count++;
		n=n/10;
		}
		System.out.println(c);
		
	}

}
