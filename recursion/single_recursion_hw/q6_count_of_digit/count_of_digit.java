public class count_of_digit{
    public static void main(String[] args) {
        int n = 123456789;
        int count = 0;
        System.out.println(count(n, count));
    }
    public static int count(int n, int c){
        if(n==0){
            return c;
        }
        c++;
        return count(n/10, c);
    }
}