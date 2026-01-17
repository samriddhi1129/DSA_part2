public class print_all_index{
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 2, 2, 2};
        int key = 2;
        print(arr, key, 0);
       

    }
    public static void print(int[] arr, int key, int i){
        if(i == arr.length) return;
        if(arr[i] == key){
            System.out.println(i);
        }

        print(arr, key, i+1);

    }

}