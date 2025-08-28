package MyPack;

public class NthHappy {
	public static boolean isHappy(int n) {
		int rem=1,sum=0;
		do {
			sum=0;
			while(n>0) {
				rem=n%10;
				sum+=(rem*rem);
				n=n/10;
			}
			n=sum;
		}while(sum>6);
		if(sum==1) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static int nthHappy(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isHappy(num)) {
			count++;
		}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(nthHappy(10));
	}

}
