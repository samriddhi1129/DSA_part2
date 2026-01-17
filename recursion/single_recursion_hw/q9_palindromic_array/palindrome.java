package q9_palindromic_array;

public class palindrome {
    public static void main(String[] args) {
       
        // let suppose n is in array
        int[] arr = {1,2,1,3};
        System.out.println(check(arr, 0, arr.length-1));
    }
    public static boolean check(int[] arr, int i, int j){
        if( i >= j) return true;
        if(arr[i] != arr[j]) return false;
        return check(arr, i+1, j-1);
    }

   


    
}
