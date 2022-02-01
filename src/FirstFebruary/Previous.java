package FirstFebruary;
import java.util.Scanner;
public class Previous {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int[] sequence = new int[N];
        String[] a = scanner.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            sequence[i] = Integer.parseInt(a[i]);
        }
        int counter = 0;
        for (int i=1; i < sequence.length; i++){
            if (sequence[i-1] < sequence[i])
                counter++;
        }
        System.out.println("The number of elements of the sequence greater that the previous one " + counter);
    }
}
