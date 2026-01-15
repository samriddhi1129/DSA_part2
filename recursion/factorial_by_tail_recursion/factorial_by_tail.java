public class factorial_by_tail{
    public static void main(String[] args) {
       
     
        int n = 5;
        int mul = 1;
        System.out.println(fac(n, mul));
    }
    public static int fac(int n, int mul){
        // base case
        if(n == 0){
            return mul;
        }
        

       
        return fac(n-1, mul*n);
    }
}
  