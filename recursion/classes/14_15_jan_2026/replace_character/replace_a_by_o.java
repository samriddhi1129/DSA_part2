package recursion.replace_character;

public class replace_a_by_o {
    public static void main(String[] args) {
        Replace("cat", "");
        
    }
    public static void Replace(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        if(ch == 'a'){
            Replace(ques.substring(1), ans + 'o');
        }
        else{
            Replace(ques.substring(1), ans+ch);
        }
    }

    public static String replace(String ques){
        if(ques.length()  == 0){
            return 
        }
    }

    
}
