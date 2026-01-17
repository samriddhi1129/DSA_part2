package q12_minimum_element;

public class minimum_ele {
      public static void main(String[] args) {
        int[] arr = {1,5,3};
        System.out.println(minimum(arr, 0, Integer.MAX_VALUE));

        
    }
    public static int minimum(int[] arr, int i, int min){
        if(i==arr.length){
            return min;
        }
        if(arr[i]<min){
            min = arr[i];
        }
        return minimum(arr,i+1, min);
    }
    
}
