package MyPack;

public class Abundant {

	public static boolean isAbundant(int n) {
		int sum=0,c=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
			sum=sum+i;
			}	
		}
		
		if(sum>c) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {

		if (isAbundant(12)) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
	}

}
