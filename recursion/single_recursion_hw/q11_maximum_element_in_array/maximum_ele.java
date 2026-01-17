package q11_maximum_element_in_array;

public class maximum_ele {

    public static void main(String[] args) {
        int[] arr = {1,5,3};
        System.out.println(maximum(arr, 0, Integer.MIN_VALUE));

        
    }
    public static int maximum(int[] arr, int i, int max){
        if(i==arr.length){
            return max;
        }
        if(arr[i]>max){
            max = arr[i];
        }
        return maximum(arr,i+1, max);
    }
    
}
