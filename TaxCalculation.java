import java.util.Scanner;

public class TaxCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the total money: ");
            double money = sc.nextDouble();
            if (money < 0) {
                System.out.println("Enter correct input");
            } else if (money > 0 && money <= 30000) {
                double percentage = 0.0; // Example tax rate, you need to adjust this according to your tax brackets
                System.out.println("Income Tax: " + taxCalculator(money, percentage));
            }
            sc.close();
        }
    }

    public static double taxCalculator(double money, double percentage) {
        return money * percentage;
    }
}
