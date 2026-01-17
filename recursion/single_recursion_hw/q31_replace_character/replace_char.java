public class replace_char {
    public static void main(String[] args) {
        // repalce a by o
        String s = "cat";
        System.out.println(replace(s));
    }
    public static String replace(String s){
        if(s.equals(""))  return "";
        char ch = s.charAt(0);
        if(ch != 'a') 
            return ch + ""+replace(s.substring(1));
        if(ch == 'a')
            return "o" + replace(s.substring(1));
        return "";


    }
}
