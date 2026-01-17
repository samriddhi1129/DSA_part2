package q15_count_element_occurences;

public class count_ele {
    static int c =0;
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3};
        int ele = 2;
        System.out.println(count(arr, ele, 0));
    }
    public static int count(int[] arr, int ele, int i){
        if(i == arr.length) return c;
        if(arr[i] == ele) c++;
        return count(arr, ele, i+1);
        
    }
    
}
