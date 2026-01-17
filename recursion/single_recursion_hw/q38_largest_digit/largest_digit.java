public class largest_digit {
   static int max = Integer.MIN_VALUE;
    public static void main(String[] args) {
        int n = 492;
        System.out.println(largest(n));
    }
    public static int largest(int n){
        if(n==0) return max;
        int digit = n%10;
        if(digit>max){
            max=digit;
        }
        return largest(n/10);


         
    }
    
    
}
