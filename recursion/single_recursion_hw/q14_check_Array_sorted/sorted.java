package q14_check_Array_sorted;

public class sorted {
    public static void main(String[] args) {
        
        // check only in ascending order

        int[] arr = {5,4,3,2};
        System.out.println(is_sorted(arr, 0));
        
    }

    public static boolean is_sorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] > arr[index+1]){
            return false;
        }

        return is_sorted(arr, index+1);
    }
}
