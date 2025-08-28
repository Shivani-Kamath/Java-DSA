package MyPack;

public class LucasNumber {

	public static void main(String[] args) {
		int a=2,b=1;
		int c=0;
		for(int i=0;i<5;i++) {
			System.out.println(a);
			System.out.println(b);
			c=a+b;
			System.out.println(c);
			a=c+b;
			b=a+c;
			
		}
		

	}

}
