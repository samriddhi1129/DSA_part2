public class reverse_no{
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(reverse(n, 0));
        
    }
    public static int reverse(int n, int ans){
        if(n==0)
            return ans;
        ans=ans*10+n%10;
        return reverse(n/10, ans);
    }
}