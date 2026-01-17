package q10_power;

public class power {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        //op = 16
        System.out.println(pow(a,b));
    }
    public static int pow(int a, int b){
        if(b==1){
            return a;
        }
        return a*pow(a, b-1);

    }
    
}
