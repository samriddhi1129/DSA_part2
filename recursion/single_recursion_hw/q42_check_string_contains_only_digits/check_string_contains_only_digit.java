public class check_string_contains_only_digit {
    public static void main(String[] args) {
        String s = "0";
        System.out.println(check(s,0));
        
    }
    public static boolean check(String s, int i){
        if(i == s.length()) return true;
        if( (s.charAt(i)>=48 && s.charAt(i)<=57 ) ) {
            return check(s, i+1);
        }
        return false;

    }
}
