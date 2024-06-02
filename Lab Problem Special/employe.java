import java.util.Scanner;

class Employe{
    double salary;
    double workHours;

    void getInfo(Scanner sc){
        System.out.println("Enter the salary amount: ");
        double salary = sc.nextDouble();
        this.salary = salary;
        System.out.println("Enter the work hours: ");
        double workHours = sc.nextDouble();
        this.workHours = workHours;
    }
    void addSalary(){
        if(this.salary < 500){
            this.salary += 10;
        }
    }
    void addWork(){
        if(this.workHours > 6){
            this.salary += 5;
        }

    }
    void printInformation(){
        System.out.println("Salary" + this.salary + "Work " + this.workHours);
    }
}

public class employe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employe em1 = new Employe();
        em1.getInfo(sc);
        em1.addSalary();
        em1.addWork();
        em1.printInformation();
    }
}
