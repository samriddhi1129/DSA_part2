public class check_strictly_increasing {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3};
        System.out.println(strictly_inc(arr, 0));

    }
    public static boolean  strictly_inc(int[] arr, int i){
        if(i>= arr.length-1) return true;
        if(arr[i] > arr[i+1]) return false;
        return strictly_inc(arr, i+1);
    }

    
}
