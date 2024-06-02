class Member {
    String name;
    int age;
    String phoneNumber;

    // Constructor
    public Member(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    // Method to print salary (placeholder method)
    public void printSalary() {
        System.out.println("Salary information not available for general member");
    }
}

class Employee extends Member {
    String specialization;

    // Constructor
    public Employee(String name, int age, String phoneNumber, String specialization) {
        super(name, age, phoneNumber);
        this.specialization = specialization;
    }

    // Overriding the printSalary method
    @Override
    public void printSalary() {
        System.out.println(name + "'s salary as an employee is based on the job role and performance.");
    }
}

class Manager extends Member {
    String department;

    // Constructor
    public Manager(String name, int age, String phoneNumber, String department) {
        super(name, age, phoneNumber);
        this.department = department;
    }

    // Overriding the printSalary method
    @Override
    public void printSalary() {
        System.out.println(name + "'s salary as a manager depends on the department performance and responsibilities.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of Employee and Manager classes
        Employee employee = new Employee("John", 30, "1234567890", "Software Developer");
        Manager manager = new Manager("Alice", 40, "9876543210", "Human Resources");

        // Printing salary of Employee and Manager
        employee.printSalary();
        manager.printSalary();
    }
}
