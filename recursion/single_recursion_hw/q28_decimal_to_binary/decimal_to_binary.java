public class decimal_to_binary {
   
    public static void main(String[] args) {
        int n = 5;
        
        // int ans = 0;
        System.out.println(conversion(n,1));
        
    }
    public static int conversion(int n, int place){
        if(n==0) return n%10;
        return n%2*place + conversion(n/2, place*10);
    }
    
}
