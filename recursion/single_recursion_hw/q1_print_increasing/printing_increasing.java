public class printing_increasing{
    public static void main(String[] args){
        int n = 5;
        print_increasing(n);
    }
    public  static void print_increasing(int n){
        if(n==0){
            return;
        }
        print_increasing(n-1);
        System.out.println(n);
    }
}