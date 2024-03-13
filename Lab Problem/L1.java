import java.util.Scanner;

public class L1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        
        Employee E1 = new Employee();
        E1.getInfo();
        E1.addSal();
        E1.addWork();
        E1.display();
    }

    static class Employee {
        double salary;
        double number_of_hours;
        double total_salary;

        void getInfo() {
            System.out.printf("Enter the salary : ");
            this.salary = sc.nextDouble();
            System.out.printf("Enter the number of hours : ");
            this.number_of_hours = sc.nextDouble();
        }

        double addSal() {
            if (this.salary < 500) {
                this.salary += 10;
            }
            return this.salary;
        }

        double addWork() {
            if (this.number_of_hours > 6) {
                this.salary += ((this.number_of_hours - 6) * 5);
            }
            return this.salary;
        }

        void display() {
            System.out.printf("Total work in a day is : %.2f%n", this.number_of_hours);
            System.out.printf("Total Salary %.2f%n", this.salary);
        }
    }
}
