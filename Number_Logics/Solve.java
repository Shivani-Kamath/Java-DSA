package MyPack;

public class Solve {

	public static int one_a(int n) {
		int sum=0;
		for(int i=0;i<=n;i++) {
			 sum=sum+i;
		}
		return sum;
	}
	public static int one_b(int n) {
		n=n*(n+1)/2;
		return n;
	}
	
	public static float two(float n) {
		float fact=1,res=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		return (1/fact);
	}
	public static int three(int n) {
		int fact=1,x=2;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		return x^n/fact;
	}
	public static int four(int m){
        int count=0;
        while(m>0){
            m=m/10;
            count++;
        }
        return count;
    }
	public static int five(int m){
        int res=0;
        while(m>0){
            m=m%10;
            res+=m;
            m--;
        }
        return res;
    }
	public static int six(int m){
        int res=0,rem=0;
        while(m>0){
            rem=m%10;
            m=m/10;
            res=res*10+rem;

        }
        return res;
    }
	public static int seven(int a,int b) {
		if(a==b) {
		   return a;
		}
		if(a>b) {
			return seven(a-b,b);
		}
		else return seven(a,b-a);
	}

	public static int nine(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;	
		}
		return fact;
	}
	public static void eleven(int m){
        int res=0,rem=0;
        int z=m;
        while(m>0){
            rem=m%10;
            m=m/10;
            res=res*10+rem;
        }
        if(z==res) {
        	System.out.println("True");
        }
        else {
        	System.out.println("false");
        }
        
    }
	
	
	public static void main(String[] args) {
		int n=5,m=121;
		System.out.println("Sum of N numbers:"+one_a(n));
		System.out.println("Sum of N numbers:"+one_b(n));
		System.out.println("1/fact:"+two(n));
		System.out.println(three(n));
		System.out.println("Count number of digits:"+four(m));
		System.out.println("Sum of a number:"+five(m));
		System.out.println("Reverse digits:"+six(m));
		System.out.println("GCD:"+seven(10,5));
		System.out.println("Factorial:"+nine(n));
		eleven(m);
	}

}
