package February_15;

public class SequentialSearch {
    public static void main(String[] args) {
        System.out.println(sequentialSearch(new int[]{1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37},15));
    }

    public static int sequentialSearch(int[] arr, int n){
        int r = arr.length;
        for (int i = 0; i < r; i++){
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}
