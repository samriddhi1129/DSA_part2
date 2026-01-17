public class gcd{
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        System.out.println(hcf(a,b,1,2));
        System.out.println(hcf_optimised(a,b));
    }
    public static int hcf(int a, int b, int ans, int i){ 
        if(i>Math.min(a, b)) return ans;
        if(a%i == 0 && b%i == 0){
            ans = i;
        }
        return hcf(a,b,ans, i+1);

    }
    public static int hcf_optimised(int a, int b) {
        if (b == 0) return a;
        return hcf_optimised(b, a % b);
    }
}