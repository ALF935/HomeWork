package FourthLesson;
import java.util.Arrays;
import java.util.Scanner;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);
        int[] sorted = new int[N];
        String[] a = scanner.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            sorted[i] = Integer.parseInt(a[i]);
        }
        int[] values = new int[K];
        String[] b = scanner.nextLine().split(" ");
        for (int i = 0; i < b.length; i++) {
            values[i] = Integer.parseInt(b[i]);
        }
        for (int i = 0; i < values.length; i++) {
            int index = Arrays.binarySearch(sorted, values[i]);
            if (index >= 0)
                System.out.println(sorted[index] + " YES");
            else
                System.out.println(values[i] + " NO");
        }
    }
}
