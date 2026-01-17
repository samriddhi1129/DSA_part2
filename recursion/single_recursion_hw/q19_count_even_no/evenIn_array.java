public class evenIn_array{
    static int c = 0;
    public static void main(String[] args) {
        int[] arr = {1, 2, 4,6,8,10,9,2,1};
        System.out.println(count(arr, 0));

    }
    public static int count(int[] arr, int i){
        if(i == arr.length) return c;
        if(arr[i] % 2 == 0)c++;
        return count(arr, i+1);



        
    }
}