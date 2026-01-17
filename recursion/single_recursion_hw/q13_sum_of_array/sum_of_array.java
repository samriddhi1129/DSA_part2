package q13_sum_of_array;

public class sum_of_array {
    public static void main(String[] args) {
        int[] arr = {1,5,3};
        System.out.println(sum(arr, 0, 0));

        
    }
    public static int sum(int[] arr, int sum, int i){
        if(i==arr.length){
            return sum;
        }
        sum+=arr[i];
        return sum(arr,sum, i+1);
    }
        
    }
    

