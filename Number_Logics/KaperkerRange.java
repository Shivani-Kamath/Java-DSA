package MyPack;

public class KaperkerRange {
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
	public static boolean isKaperkar(int n) {
	   int sum=0,rem=0;
	   int m=n;
	   n=n*n;
	   int c=length(n)/2;
	   int z=power(10,c);
		   rem=n%z;
		   n=n/z;
		   sum=rem+n;
	   if(m==sum) {
		   return true;
	   }
	   return false;
	   
	}

	public static void main(String[] args) {
		int start=1,end=1000;
		for(int i=start;i<end;i++) {
			if(isKaperkar(i)) {
				System.out.println(i);
			}
		}

	}

}
