import java.util.Scanner;

class calculate{
    private double g = 9.8;

    double distanceCalculator(double time){
        return (0.5 * g * time * time);
    }
}


public class Distance {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        calculate mesure = new calculate();
        double time = sc.nextDouble();
        System.out.println(mesure.distanceCalculator(time));
    }
}