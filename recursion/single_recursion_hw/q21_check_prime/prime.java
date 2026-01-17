public class prime {
    public static void main(String[] args) {
        int n = 7;
        
        int i = 2;
        System.out.println(prime(n, i));
        System.out.println(isPrime(n, 2));
    }
    public static boolean prime(int n, int i){
        if(n==1) return false;

        if(i == n-1) return true;
        if(n%i == 0) return false;
        return prime(n,i+1 );
    }
      public static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (i * i > n) return true;   // √n condition
        if (n % i == 0) return false;
        return isPrime(n, i + 1);
    }
}
