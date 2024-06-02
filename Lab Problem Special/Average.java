import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter how many numbers:");
            int N = sc.nextInt();
            double sum = 0;
            for(int i = 1; i <= N; i++){
                System.out.printf("Enter %d number: ", i);
                double number = sc.nextDouble();
                sum += number;
            }
            System.out.println("Average is: " + averageCalculator(sum, N));
        }
    }

    public static double averageCalculator(double sum, int n){
        return (sum / n);
    }
}
