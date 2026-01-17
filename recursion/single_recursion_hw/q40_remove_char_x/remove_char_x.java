public class remove_char_x {
    public static void main(String[] args) {
        String s = "xoxo";
        System.out.println(remove(s,0));
    }
    public static String remove(String s, int i){
      if (i == s.length()) return "";

        if(s.charAt(i) == 'x')
            return ""+remove(s, i+1);
        return s.charAt(i)+"" + remove(s, i+1);
    }
    
}
