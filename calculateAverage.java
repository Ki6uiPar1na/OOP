import java.util.Scanner;

class averageCalculator {
    int totalNumber;

    averageCalculator(int totalNumber) {
        this.totalNumber = totalNumber;
    }

    double calculate(Scanner sc) {
        double sum = 0;
        for (int i = 1; i <= totalNumber; i++) {
            System.out.printf("Enter the %d number: ", i);
            int value = sc.nextInt();
            sum += value;
        }
        return sum / totalNumber;
    }
}

public class calculateAverage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Calculate \n2.Exit");
            int entry = sc.nextInt();
            if (entry == 1) {
                System.out.println("Enter total number: ");
                int totalNumber = sc.nextInt();
                averageCalculator first = new averageCalculator(totalNumber);

                double sum = first.calculate(sc);

                System.out.printf("Average is: ");
                System.out.println(sum);
            }
            if (entry == 2) {
                break;
            }

        }

    }
}