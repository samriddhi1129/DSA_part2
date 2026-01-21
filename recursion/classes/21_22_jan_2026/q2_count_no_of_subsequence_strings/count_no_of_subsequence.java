public class count_no_of_subsequence {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(printsubsequence(s, ""));
    }
    public static int printsubsequence(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return 1;
        }
        char ch = s.charAt(0);
        int a1 = printsubsequence(s.substring(1),ans);
        int a2 = printsubsequence(s.substring(1), ans+ch);
        return a1+a2;
    }
    
}
