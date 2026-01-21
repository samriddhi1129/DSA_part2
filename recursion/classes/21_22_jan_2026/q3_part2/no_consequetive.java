package q3_part2;

public class no_consequetive {
    public static void main(String[] args) {
         int n = 4;
        coin_toss(n, "");
    }
    public static void coin_toss(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H')
        coin_toss(n-1, ans+"H");
        coin_toss(n-1, ans+"T");
    }
    
}
