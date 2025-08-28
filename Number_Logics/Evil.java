package MyPack;

public class Evil {
	
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
	
	
	public static void main(String[] args) {
	if(isEvil(23)) {
		System.out.println("Yes");
	}
	else {
		System.out.println("No");
	}

}

}
