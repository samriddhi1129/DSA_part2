public class lcm {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        System.out.println(lcm(a,b, 1,2));
        System.out.println(lcm_optimised(a,b));
        
    }
    public static int lcm(int a, int b, int ans, int i){
        if(a==1 && b ==1) return ans;
        
        if(a%i == 0 || b%i == 0){
            ans*=i;
          if(a%i == 0) a/=i;
          if(b%i == 0) b/=i;
           return lcm(a,b,ans,i);
            
        }      
        
            return lcm(a,b,ans,i+1);
    

    }
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static int lcm_optimised(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
}
