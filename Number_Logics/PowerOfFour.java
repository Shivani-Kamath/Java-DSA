package MyPack;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        return n>0 && (n&(n-1))==0&&(n-1)%3==0;
    }

    public static void main(String[] args) {
        int num = 64; 
        System.out.println(isPowerOfFour(num));
    }
}
