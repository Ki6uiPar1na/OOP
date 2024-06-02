
class Member{
    String name;
    double age;
    String phoneNumber;
    String address;
    double salary;

    Member(String name, double age, String phoneNumber, String address, double salary){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary(){
        System.out.println("Salary is : " + this.salary);
    }
}

class Employe extends Member{
    String specialization;

    Employe(String name, double age, String phoneNumber, String address, double salary, String specialization){
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    @Override
    void printSalary() {
        System.out.println("Salary of employe is " + super.salary);
    }

} 

class Maneger extends Member{
    String department;

    Maneger(String name, double age, String phoneNumber,String address, double salary, String department){
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    @Override
    void printSalary() {
        System.out.println("Salary maneger is " + super.salary);
    }

}

public class Inheritance {
    public static void main(String[] args) {

        Maneger maneger = new Maneger("khairul", 60, "wer8w4", "we84wsj", 5965, "SWE");
        Employe employe = new Employe("Islam", 60, "wer8w4", "we84wsj", 598, "SWE");
        
        maneger.printSalary();
        employe.printSalary();

        
    }
}