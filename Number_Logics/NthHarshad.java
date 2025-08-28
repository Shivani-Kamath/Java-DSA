package MyPack;

public class NthHarshad {
	public static boolean Harshad(int n) {
		int sum=0,c=n,rem=0;
		while(n>0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem;
		}
		return(c%sum==0); 
	}
	public static int nthHarshad(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(Harshad(num)) {
			count++;
		}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(nthHarshad(15));

	}

}
