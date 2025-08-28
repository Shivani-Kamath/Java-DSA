package MyPack;

public class NthEvil {

	public static int binary(int n){
		int binarynum=0;
		int rem=0,i=1;
		while(n>0) {
			rem=n%2;
			binarynum=binarynum+(rem*i);
			i=i*10;
			n=n/2;
		}
		
		return binarynum;
	}

	public static boolean isEvil(int n) {
		int res=0,count=0,d=0;
		int c=binary(n);
		while(c>0) {
			d=c%10;
			if(d==1) {
				count++;
			}
			c=c/10;
		}
		if(count%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int nthEvil(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isEvil(num)) {
			count++;
		}
		}
		return num;
	}
	public static void main(String[] args) {
		System.out.println(nthEvil(5));
	}

}
