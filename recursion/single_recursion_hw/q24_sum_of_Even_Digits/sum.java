public class sum{
    static int s = 0;
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println(even(n));
    }
    public static int even(int n){
        if(n==0) return s;
        if(n%10%2 == 0) s+=n%10;
        return even(n/10);
    }
}