public class print_Decreasing{
    public static void main(String[] args) {
        int n = 5;
        print_decreasing(n);
    }
    public static void print_decreasing(int n){
        if(n==0) return;
        System.out.println(n);
        print_decreasing(n-1);
    }
    
}