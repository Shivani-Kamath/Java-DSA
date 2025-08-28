package MyPack;

public class Trimorphic {
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

	public static boolean isTrimorphic(int n) {
		int ans=0,c=0;
		ans=n*n*n;
		c=power(10,length(n));
		if(ans%c==n) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		if(isTrimorphic(24)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}
}
