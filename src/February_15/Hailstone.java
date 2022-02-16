package February_15;
import java.util.Scanner;
public class Hailstone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int N = Integer.parseInt(str);
        while (N!=1){
            if (N % 2 == 0) {
                N = N / 2;
                System.out.println(N);
            }
            else {
                N = N * 3 + 1;
                System.out.println(N);
            }
        }
    }
}
