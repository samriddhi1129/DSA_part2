public class count_vowels {
    static int c = 0;
    public static void main(String[] args) {
        String s = "aeiouytr";
        System.out.println(vowels(s, 0));
    }
    public static int vowels(String s, int i){
        if(i == s.length()) return c;
        if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o' ||s.charAt(i) == 'u') c++;
        return vowels(s, i+1);
    }
    
}
