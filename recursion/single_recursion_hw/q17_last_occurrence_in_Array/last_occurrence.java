public class last_occurrence{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int ele = 2;
        System.out.println(last_occ(arr, ele, arr.length-1));
    }
    public static int last_occ(int[] arr, int ele, int i){
        if(i<0) return -1;
        if(arr[i] == ele) return i;
        return last_occ(arr, ele, i-1);
    }
}