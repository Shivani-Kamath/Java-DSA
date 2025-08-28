package MyPack;

public class NthDisarium {
	public class Disarium {
		public static int length(int n){
	        int count=0;
	        while(n>0){
	            n=n/10;
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
		public static boolean isDisarium(int n) {
			int ans=0,rem=1,z=n;
			int c=length(n);
			while(n>0) {
				rem=n%10;
				ans+=power(rem,c);
				c--;
				n=n/10;
			}
			if(z==ans) {
				return true;
			}
			else {
				return false;
			}
			
		}

		public static int nthDisarium(int n) {
			int count=0,num=0;
			while(count<n){
			 num++;	
			
			if(isDisarium(num)) {
				count++;
			}
			}
			return num;
		}

	public static void main(String[] args) {
		System.out.println(nthDisarium(50));
	}
	}
}
