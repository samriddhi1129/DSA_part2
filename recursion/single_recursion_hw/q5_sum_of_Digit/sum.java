public class sum{
    public static void main(String[] args){
        int n = 123;
        int sum = 0;
        System.out.println(sum_of_digit(n, sum));
    }
    public static int sum_of_digit(int n, int s){
        if(n==0) return s;
        s+=n%10;
        return(sum_of_digit(n/10, s));
    }
}