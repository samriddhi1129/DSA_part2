public class RemoveZero {
    static int ans = 0;
    public static void main(String[] args) {
        int n = 1020;
        int place = 1;
        System.out.println(removeZero(n, place));
    }
    public static int removeZero(int n, int place){
        if(n==0) return ans;
        if(n%10 != 0){
        ans+=n%10*place;
        place*=10;
        }
        return removeZero(n/10, place);



    }

    
}
