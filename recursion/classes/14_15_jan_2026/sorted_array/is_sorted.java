public class is_sorted{
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 8, 7};
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