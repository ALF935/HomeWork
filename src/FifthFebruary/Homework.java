package FifthFebruary;
import java.util.Scanner;
import java.util.ArrayList;
public class Homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String[] a = scanner.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            numbers.add(Integer.parseInt(a[i]));
        }
        //System.out.println(numbers);
        //System.out.println(numbers.size());
        for (int i=0; i < numbers.size(); i++){
            if ((i+2) < numbers.size()){
                int NumberOne = numbers.get(i);
                int NumberTwo = numbers.get(i+2);
                numbers.set(i, NumberTwo);
                numbers.set(i+2, NumberOne);
            }
            System.out.println(numbers);
        }
    }
}
