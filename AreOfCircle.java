import java.util.Scanner;

public class AreOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runner = 1;
        while(runner == 1){
            System.out.printf("\nIf you want to STOP program enter 0 : ");
            runner = sc.nextInt();
            if(runner == 0){
                return;
            }
            else{
                System.out.println("Enter the radius of the circle");
                double r = sc.nextDouble();

                double area = Math.PI * r * r;
                double circumference = Math.PI * 2 * r;

                System.out.println("The Cicumference of the circile is : " + circumference);
                System.out.println("The area of the circle is : " + area);
            }
        }
    }
}
