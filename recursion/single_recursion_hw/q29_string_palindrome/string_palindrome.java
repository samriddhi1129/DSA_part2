public class string_palindrome {
    public static void main(String[] args) {
        String s = "madama";
        System.out.println(check(s, 0, s.length()-1));
    }
    public static boolean check(String s, int i, int j){
        if(i>=j) return true;
        if(s.charAt(i) != s.charAt(j)) return false;
        return check(s, i+1, j-1);
    }
    
}
