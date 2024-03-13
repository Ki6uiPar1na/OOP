import java.util.*;
public class AreaOfTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int runner = 1;
        while(runner == 1){
            System.out.printf("\nIf you want to STOP program enter 0 : ");
            runner = input.nextInt();
            if(runner == 0){
                return;
            }
            else{
                System.out.println("Enter the length of the first side of the triangle");
                double a = input.nextDouble();

                System.out.println("Enter the length of the second side of the triangle");
                double b = input.nextDouble();

                System.out.println("Enter the length of the third side of the triangle");
                double c = input.nextDouble();

                double s = (a + b + c) / 2;

                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                
                System.out.println("The area of the triangle is " + area);
            }
        }
    }
}