package MyPack;

public class NthPerfect {
	public static boolean perfect(int n) {
		int sum=0,c=n;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==c) {
			return true;
		  }
		  else {
			  return false;
		  }
		

}
	public static int nthperfect(int n) {
		int count=0,num=0;
		while(count<n){
		 num++;	
		
		if(perfect(num)) {
			count++;
		}
		}
		return num;
	}

	public static void main(String[] args) {
		System.out.println(nthperfect(2));


	}

}
