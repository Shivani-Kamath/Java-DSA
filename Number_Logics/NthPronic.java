package MyPack;

public class NthPronic {
	public static boolean isPronic(int n) {
		for(int i=1;i<n;i++) {
			if(i*(i+1)==n) {
				return true;
			}	
		}
	
			return false;
		
	}
	public static int nthPronic(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(isPronic(num)) {
			count++;
		}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(nthPronic(50));
	}

	}


