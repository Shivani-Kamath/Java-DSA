package MyPack;

public class LCM {

	
		public static int HCF(int a,int b) {
			if(a==b) {
			   return a;
			}
			if(a>b) {
			return HCF(a-b,b);
			}
			else {
				return HCF(a,b-a);
			}	
		
	}
		
		public static int LCM(int a,int b) {
			int lcm=1;
			lcm=(a*b)/HCF(a,b);
			return lcm;
		
	}
		

	public static void main(String[] args) {
		int n=5,m=121;
		
		System.out.println("HCF:"+HCF(10,5));
		System.out.println("LCM:"+LCM(10,2));

	}

}
