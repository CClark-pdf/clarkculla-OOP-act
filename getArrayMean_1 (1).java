import java.util.Scanner;

public class getArrayMean_1 {
    public static double getArrayMean_1(int[] array) {
        int s = 0;
        for (int num : array) {
            s += num;
        }
        return (double) s / array.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }
        double mean = getArrayMean_1(numbers);
        System.out.printf("Mean of array is: %.2f%n", mean);
    }
}
