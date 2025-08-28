package MyPack;

public class Ugly {
	
	public static boolean ugly(int n) {
		for(int i=0;i<n;i++)
		{
			if(i%2==0 || i%3==0 || i%5==0) {
				System.out.println(i);
				return true;
			}
		}
		
		return false;
		
	}

	public static void main(String[] args) {
		if(ugly(10)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}

	}

}
