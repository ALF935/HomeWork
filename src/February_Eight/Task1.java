package February_Eight;
import java.util.Scanner;
import java.util.ArrayList;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] userNumbers = scanner.nextLine().split(" ");
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        int sum1 = 0;
        int sum2 = 0;
        int mult1 = 1;
        int mult2 = 1;
        for (int i = 0; i < userNumbers.length; i++) {
            if (i < (userNumbers.length / 2)) {
                numbers1.add(Integer.parseInt(userNumbers[i]));
            } else {
                numbers2.add(Integer.parseInt(userNumbers[i]));
            }
        }
        for (int i = 0; i < numbers1.size(); i++){
            sum1 = sum1 + numbers1.get(i);
            mult1 = mult1 * numbers1.get(i);
        }
        for (int i = 0; i < numbers2.size(); i++){
            sum2 = sum2 + numbers2.get(i);
            mult2 = mult2 * numbers2.get(i);
        }
        System.out.println("Sum of the first subarray: " + sum1 + "\n"  + "Product of the first subarray: " + mult1);
        System.out.println("Sum of the second subarray: " + sum2 + "\n"  + "Product of the second subarray: " + mult2);
    }
}
