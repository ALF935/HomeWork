import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        while (true){
            int randit1 = 2+(int)(Math.random()*(15-2+1));
            int randit2 = 2+(int)(Math.random()*(15-2+1));
            int sum = randit1 + randit2;
            System.out.println("Find " + randit1 + "+" + randit2);
            Scanner sum2 = new Scanner(System.in);
            String sum3 = sum2.next();
            int sum4 = Integer.valueOf(sum3);
            if (sum == sum4)
                break;
        }
        System.out.println("Congratulations!");
    }
}


