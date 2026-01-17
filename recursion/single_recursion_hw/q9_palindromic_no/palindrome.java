package q9_palindromic_no;

public class palindrome {
    static int rev = 0;
    public static void main(String[] args) {
        int n = 121;
        reverse(n);
        System.out.println(rev == n);


    }
    public static void reverse(int n){
        if(n==0) return;
        rev=rev*10+n%10;
         reverse(n/10);


    }
    
}
