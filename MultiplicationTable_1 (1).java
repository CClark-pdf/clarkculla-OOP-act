
import java.util.Scanner;

public class MultiplicationTable_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int s = scanner.nextInt();

        int[][] table = new int[s][s];

        for (int i = 1; i <= s; i++) {
            for (int j = 1; j <= s; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }
        System.out.println("Multiplication Table:");
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}

