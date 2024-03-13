import java.util.*;
public class BMI_Calculate {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int runner = 1;
        while(runner != 0){
            System.out.print("\n If you STOP the program enter 0 :");
            runner = sc.nextInt();
            if (runner == 0) return;
            System.out.println("Enter the weight: ");
            double weight = sc.nextDouble();
            System.out.println("Enter the height: ");
            double height = sc.nextDouble();

            weight *= 0.45;
            height /= 100;

            double BMI = weight / Math.pow(height, 2);
            System.out.printf("BMI is %f", BMI);

        }
    }
}
