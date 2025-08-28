package MyPack;

public class HarshadRange {

	public static boolean Harshad(int n) {
		int sum=0,c=n,rem=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		return(c%sum==0); 
	}
	public static void main(String[] args) {
		int start=2,end=100;
		for(int i=start;i<=end;i++) {
			if(Harshad(i)) {
				System.out.println(i+" ");
			}
		}

	}

}
