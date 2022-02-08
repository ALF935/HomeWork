package February_Eight;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] values = scanner.nextLine().split(" ");
        int size = Integer.parseInt(values[0]);
        int rotation = Integer.parseInt(values[1]);
        String[] values2 = scanner.nextLine().split(" ");
        int[] num = new int[size];
        for (int i = 0; i < size; i++){
            num[i] = Integer.valueOf(values2[i]);
        }
        for (int j = rotation; j < num.length; j++){
            System.out.print(num[j] + " ");
        }
        for (int p = 0; p < rotation; p++){
            System.out.print(num[p] + " ");
        }
    }
}