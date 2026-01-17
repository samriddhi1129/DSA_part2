public class count_consonants {
    public static void main(String[] args) {
        String s = "code";
        System.out.println(cons(s,0));
    }
    public static int cons(String s, int i){
        if(i == s.length()) return 0;
        if(s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u' ){
            return 1+cons(s, i+1);
        }
        return cons(s, i+1);

    }
    
}
