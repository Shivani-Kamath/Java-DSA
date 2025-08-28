package MyPack;

public class PronicRange {
	public static boolean isPronic(int n) {
		for(int i=1;i*(i+1)<=n;i++) {
			if(i*(i+1)==n) {
				return true;
			}	
		}
	
			return false;
		
	}

	public static void main(String[] args) {
		int start=0,end=100;
		for(int i=start;i<end;i++) {
			if(isPronic(i)) {
				System.out.println(i);
			}
		}

	}

}
