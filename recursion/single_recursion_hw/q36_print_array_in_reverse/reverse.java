public class reverse {
    static int index = 0;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] ans = new int[arr.length];
        reverse(arr, ans, arr.length-1);
        for(int i : ans){
            System.out.println(i);
        }

    }
    public static void reverse(int[] arr, int[] ans, int i){
        
       
        if(i<0) return;
        ans[index++] = arr[i];
        reverse(arr, ans,i-1);
    }
    
}
