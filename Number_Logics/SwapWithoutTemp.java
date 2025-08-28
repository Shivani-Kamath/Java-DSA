package MyPack;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		int a=30,b=20;
		a^=b;
		b^=a;
		a^=b;
		System.out.println(a);
		System.out.println(b);

	}

}
