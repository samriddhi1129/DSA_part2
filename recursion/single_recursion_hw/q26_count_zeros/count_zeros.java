public class count_zeros {
    static int c = 0;
    public static void main(String[] args) {
        int n = 10020;
        System.out.println(count(n));
    }
    public static int count(int n){
        if(n==0) return c;
        if(n%10 == 0) c++;
        return count(n/10);
    }
    
}
