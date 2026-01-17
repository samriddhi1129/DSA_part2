public class length_of_string {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(length(s));
        
    }
    public static int length(String s){
        if(s.equals("")) return 0;
        return 1+length(s.substring(1));

    }
    
}
