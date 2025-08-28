package MyPack;

public class Armstrong {
	public static int length(int m){
        int count=0;
        while(m>0){
            m=m/10;
            count++;
        }
        return count;
    }
	 public static int power(int base,int exp){
	        int res=1;
	        while(exp>0){
	            res=res*base;
	            exp--;
	        }
	        return res;
	    }

	public static void Armstrong(int n) {
		int rem=0,pow=0,ans=0,org=n;
		while(n>0) {
			 rem=n%10;
			 pow=power(rem,length(n));
			 ans=ans+pow;
			 n=n/10;
		}
		if(ans==org) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("not Armstrong");
		}
	}
	public static void main(String[] args) {
		Armstrong(135);
	}


}
