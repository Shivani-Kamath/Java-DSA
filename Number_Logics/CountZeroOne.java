package MyPack;

public class CountZeroOne {

	public static void main(String[] args) {
		int n=101000000,count1=0,count2=0;
		while(n>0) {
		if(n%10==0) {
			count1++;
		}
		else {
			count2++;
		}
		n=n/10;
		}
		System.out.println("Zeroes:"+count1);
		System.out.println("ones:"+count2);


	}

}
