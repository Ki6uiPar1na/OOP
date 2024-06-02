import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MinMaxFromArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        // Generate random array
        generateRandomArray(arr, size);

        // Print the original array
        System.out.println("Original array:");
        for(int i = 0; i < size; i++){
            System.out.printf("%d ", arr[i]);
        }

        // Sort the array
        Arrays.sort(arr);

        // Print the smallest and largest numbers
        System.out.println("\nSmallest number: " + arr[0]);
        System.out.println("Largest number: " + arr[size - 1]);
        
        // Print the sorted array
        System.out.println("Sorted array:");
        for(int i = 0; i < size; i++){
            System.out.printf("%d ", arr[i]);
        }
    }

    public static void generateRandomArray(int arr[], int size){
        Random random = new Random();
        for(int i = 0; i < size; i++){
            arr[i] = random.nextInt(100); // Generating random numbers between 0 and 99
        }
    }
}
