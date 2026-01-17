public class smallest_digit_in_n {
    static int min = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int n = 492;
        System.out.println(smallest(n));
    }
    public static int smallest(int n){
        if(n==0) return min;
        int digit = n%10;
        if(digit<min){
            min=digit;
        }
        return smallest(n/10);


         
    }
    
}
