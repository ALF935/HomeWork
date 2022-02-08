package February_Eight;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = scanner.nextLine().split(" ");
        int index = 0;
        int longName = names[index].length();
        for (int i=0; i<names.length; i++){
            if (names[i].length() > longName){
                index = i;
            }
        }
        System.out.println(names[index]);
    }
}
