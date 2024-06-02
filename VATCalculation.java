import java.util.Scanner;

public class VATCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.printf("1. Calculate \n2. Exit\n");
            int entry = sc.nextInt();
            if(entry == 1){
                System.out.println("Enter the amount of money: ");
                double moneyAmount = sc.nextDouble();

                System.out.println("\n1. Calculate Including VAT \n2. Calculate Excluding VAT");
                int slection = sc.nextInt();
                if(slection == 1){
                    System.out.println("Enter the VAT percentage: ");
                    double vatPercentage = sc.nextDouble();
                    System.out.printf("Including VAT new amount is: %f\n", includeVat(moneyAmount, vatPercentage));
                }
                else if(slection == 2){
                    System.out.println("Enter the VAT percentage: ");
                    double vatPercentage = sc.nextDouble();
                    System.out.printf("Excluding VAT new amount is: %f\n", excludeVat(moneyAmount, vatPercentage));
                }
            }
            else if(entry == 2){
                sc.close();
                break;
            }
        }

    }

    public static double includeVat(double totalAmount, double vatPercentage){
        return (totalAmount * (1 + (vatPercentage / 100)));
    }

    public static double excludeVat(double totalAmount, double vatPercentage){
        return (totalAmount / (1 + (vatPercentage / 100)));
    }
}
