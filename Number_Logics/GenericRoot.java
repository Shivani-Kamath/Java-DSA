package MyPack;

public class GenericRoot {
	
	public static int genericRoot(int n) {
		int sum=0,rem=0;

        do {
        	sum=0;
        	while(n>0) {
    			rem=n%10;
    			sum+=rem;
    			n=n/10;
    			
    		}
        	n=sum;
        }while(sum>9);
	     
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(genericRoot(456791));

	}

}
