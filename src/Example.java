import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        int b;
        b = 1;
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 1; i < Integer.parseInt(str); i++){
            b = b * i;
        }
        System.out.println(b);
    }
}


