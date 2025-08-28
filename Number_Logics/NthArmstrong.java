package MyPack;

public class NthArmstrong {
	
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
	 

	 public static boolean Armstrong(int n) {
			int rem=0,pow=0,ans=0,org=n;
			int len=length(n);
			while(n>0) {
				 rem=n%10;
				 pow=power(rem,len);
				 ans=ans+pow;
				 n=n/10;
			}
			if(ans==org) {
				return true;
			}
			else {
				return false;
			}
		}
	
	public static int nthArmstrong(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(Armstrong(num)) {
			count++;
		}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(nthArmstrong(19));
	}

}
