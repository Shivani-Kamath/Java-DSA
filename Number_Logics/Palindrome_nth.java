package MyPack;

public class Palindrome_nth {
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
	
	public static int nthPalindrome(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isPalindrome(num)) {
			count++;
		}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(nthPalindrome(50));

	}

}
