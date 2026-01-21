public class sum{
    public static void main(String[] args) {
        int n = 1234; // 1-2+3-4
        int c = count(n,0);
        System.out.println(alternate(n,0,c));
    }
    public static int alternate(int n,int i, int c){
        if(n == 0) return 0;
        if(c%2 == 0){
        
        if(i%2 == 0) return alternate(n/10, i+1,c);
        return n%10+alternate(n/10, i+1,c);
        }
        else{
             if(i%2 != 0) return alternate(n/10, i+1,c);
        }
        return n%10+alternate(n/10, i+1,c);
    }
 public static int count(int n, int c){
        if(n==0){
            return c;
        }
        c++;
        return count(n/10, c);
    }
        

    


    
}
