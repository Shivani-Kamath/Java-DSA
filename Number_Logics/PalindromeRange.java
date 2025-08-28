package MyPack;

public class PalindromeRange {
	public static boolean isPalindrome(int m){
        int res=0,rem=0,initial =m;
        while(m>0){
            rem=m%10;
            m=m/10;
            res=res*10+rem;
        }
        if(initial==res) {
        return true;
    }
        return false;
	}


	public static void main(String[] args) {
		int start=1,end=100;
		for(int i=start;i<=end;i++) {
			if(isPalindrome(i)) {
				System.out.println(i);
			}
		}

	}

}
