public class maze_path {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        Path(0, 0, n-1, m-1, "");

    }
    // cr--> current row
    public static void Path(int cr, int cc,int er, int ec, String ans) {
        if(er == cr && cc == ec){
            System.out.println(ans);
            return;
        }
         if(cr>er || cc > ec){
            
            return;
        }
        Path(cr, cc+1, er, ec, ans+"H");

        Path(cr+1, cc, er, ec, ans+"V");



        
    }
    
}
