import java.util.Scanner;

public class GeometryCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Circle
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        double circleArea = calculateCircleArea(radius);
        double circlePerimeter = calculateCirclePerimeter(radius);
        System.out.println("Area of the circle: " + circleArea);
        System.out.println("Perimeter of the circle: " + circlePerimeter);
        
        // Rectangle
        System.out.println("Enter the length of the rectangle:");
        double length = scanner.nextDouble();
        System.out.println("Enter the width of the rectangle:");
        double width = scanner.nextDouble();
        double rectangleArea = calculateRectangleArea(length, width);
        double rectanglePerimeter = calculateRectanglePerimeter(length, width);
        System.out.println("Area of the rectangle: " + rectangleArea);
        System.out.println("Perimeter of the rectangle: " + rectanglePerimeter);
        
        // Square
        System.out.println("Enter the side length of the square:");
        double side = scanner.nextDouble();
        double squareArea = calculateSquareArea(side);
        double squarePerimeter = calculateSquarePerimeter(side);
        System.out.println("Area of the square: " + squareArea);
        System.out.println("Perimeter of the square: " + squarePerimeter);
        
        // Triangle
        System.out.println("Enter the base length of the triangle:");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();
        double triangleArea = calculateTriangleArea(base, height);
        System.out.println("Area of the triangle: " + triangleArea);
        
        // Parallelogram
        System.out.println("Enter the base length of the parallelogram:");
        double baseParallelogram = scanner.nextDouble();
        System.out.println("Enter the height of the parallelogram:");
        double heightParallelogram = scanner.nextDouble();
        double parallelogramArea = calculateParallelogramArea(baseParallelogram, heightParallelogram);
        System.out.println("Area of the parallelogram: " + parallelogramArea);
        
        // Trapezoid
        System.out.println("Enter the length of the first base of the trapezoid:");
        double base1 = scanner.nextDouble();
        System.out.println("Enter the length of the second base of the trapezoid:");
        double base2 = scanner.nextDouble();
        System.out.println("Enter the height of the trapezoid:");
        double heightTrapezoid = scanner.nextDouble();
        double trapezoidArea = calculateTrapezoidArea(base1, base2, heightTrapezoid);
        System.out.println("Area of the trapezoid: " + trapezoidArea);
        
        scanner.close();
    }
    
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    public static double calculateCirclePerimeter(double radius) {
        return 2 * Math.PI * radius;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double calculateRectanglePerimeter(double length, double width) {
        return 2 * (length + width);
    }
    
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }
    
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
    
    public static double calculateParallelogramArea(double base, double height) {
        return base * height;
    }
    
    public static double calculateTrapezoidArea(double base1, double base2, double height) {
        return 0.5 * (base1 + base2) * height;
    }
}
