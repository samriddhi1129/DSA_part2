public class q1_subsequence{
    public static void main(String[] args) {
        String s = "abc";
        printSubsequence(s, "");
    }
    public static void printSubsequence(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans + " ");
            return;
        }
        char ch = s.charAt(0);
        printSubsequence(s.substring(1), ans);
        printSubsequence(s.substring(1), ans + ch);

    }
}