public class product_of_digit{
    public static void main(String[] args){
        int n = 234;
        System.out.println(prod(n, 1));
    }
    public static int prod(int n, int p){
        if(n==0)
        return p;
    p*=n%10;
    return prod(n/10, p);

    }
}