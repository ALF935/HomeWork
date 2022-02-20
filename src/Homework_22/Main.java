package Homework_22;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        System.out.print(numbers[0] + " is first, ");
        for (int i = 2; i < numbers.length; i++){
            System.out.print(numbers[i-1] + " is after " + numbers[i-2] + " and before " + numbers[i] + ", ");
        }
        System.out.print(numbers[numbers.length-1] + " is last");
    }
}