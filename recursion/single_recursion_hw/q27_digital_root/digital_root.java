public class digital_root {
        public static void main(String[] args) {
        // repeated digital sum
        int n = 1234;
        int sum = digital_root(n);
           
        System.out.println(sum);
    }
    public static int digital_root(int n){
         if(n<=9) return n;
              
        int sum =  n%10 + digital_root(n/10);
        if(sum>9){
            return digital_root(sum);
        }
        return sum;
    
  
  
    }
    
}
