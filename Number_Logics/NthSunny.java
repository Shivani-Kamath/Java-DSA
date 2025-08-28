package MyPack;

public class NthSunny {
	public static boolean isSunny(int n) {
		int square=0,s=0;
		square=(n+1);
		for(int i=0;i<=square;i++) {
			if(i*i==square) {
				s=1;
				break;
			}
		}
		if(s==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int nthSunny(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isSunny(num)) {
			count++;
		}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(nthSunny(30));

	}

}
