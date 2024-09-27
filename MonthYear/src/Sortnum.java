import java.util.Arrays;
import java.util.Scanner;

public class Sortnum {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = input.nextInt();
        double[] array = new double[size];

        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextDouble();
        }
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));

        double sum = 0;
        for (double num : array) {
            sum += num;
        }

        double average = sum / size;

        System.out.println("Sum: " + sum);
        System.out.println("Average of array: " + average);
        
        input.close();
    }
}
