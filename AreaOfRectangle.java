import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int runner = 1;
        while(runner == 1){
            System.out.printf("\nIf you want to STOP program enter 0 :");
            runner = input.nextInt();
            if(runner == 0){
                return;
            }
            else{
                System.out.println("Enter the width of the rectangle");
                double width = input.nextDouble();

                System.out.println("Enter the height of the rectangle");
                double height = input.nextDouble();

                RectangleArea rectangle = new RectangleArea(width, height);
                double area = rectangle.computeField();
                rectangle.fieldDisplay(area);
            }
        }
    }

    static class RectangleArea {
        double width, height;

        RectangleArea(double width, double height) {
            this.width = width;
            this.height = height;
        }

        double computeField() {
            return (width * height);
        }

        void fieldDisplay(double area) {
            System.out.println("Width = " + width);
            System.out.println("Height = " + height);
            System.out.println("The area of Rectangle is : " + area);
        }
    }
}
