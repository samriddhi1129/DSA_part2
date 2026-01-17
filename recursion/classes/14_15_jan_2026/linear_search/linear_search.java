public class linear_search{
    public static void main(int[] args){
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