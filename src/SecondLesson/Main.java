package SecondLesson;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int b;
        b = 1;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 1; i < (Integer.parseInt(str)+1); i++){
            b = b * i;
        }
        System.out.println(b);
    }
}
