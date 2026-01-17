package q16_first_occurence_in_Array;

public class linearSearch {
    public static void main(String[] args){
        int[] arr = {1,2,3,2};
        int item = 2;
        System.out.println(Index(arr, item, 0));


    }
    public static int Index(int[] arr, int item, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == item){
            return i;
        }
    
    return Index(arr, item, i+1);
    }
    
}
