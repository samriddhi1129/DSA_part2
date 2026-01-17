public class RemoveDuplicates{
    public static void main(String[] args) {
        String s = "aabba";
        boolean[] seen = new boolean[256];
        System.out.println(duplicates(s, seen));
    }
    public static String duplicates(String s, boolean[] seen){
        if(s.isEmpty()) return "";
        char ch = s.charAt(0);
        if(seen[ch]){
            return duplicates(s.substring(1), seen);

        }
        seen[ch] = true;
        return ch+duplicates(s.substring(1), seen);
    }
}