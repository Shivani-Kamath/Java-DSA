package MyPack;

public class Harshad {

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
		int n=123;
		if(Harshad(n)) 
			{
				System.out.println("Harshad");
			}
			else {
				System.out.println("not");
			}
		}

	}


