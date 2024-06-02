import java.util.ArrayList;
import java.util.Scanner;

class Employe{
    int uniqueID;
    String employeName;
    double initialSalary;

    Employe(int uniqueID, String employeName, Double initialSalary){
        this.uniqueID = uniqueID;
        this.employeName = employeName;
        this.initialSalary = initialSalary;
    }
    @Override
    public String toString(){
        return "\nUnique ID: " + uniqueID + "\nName: " + employeName + "\nSalary: " + initialSalary;

    }

}


public class employeSalaryAdjustment{

    public static void main(String[] args) {
        ArrayList<Employe> employes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Enter Program \n2. Close Program ");
            int entry = sc.nextInt();
            if(entry == 1){
                System.out.println("1. New Employe Entry \n2. Add Salary \n3. Adjust Salary \n4. Print Employe Information");
                int selector = sc.nextInt();
                if(selector == 1){
                    System.out.println("Enter Unique ID no: ");
                    int uniqueID = sc.nextInt();
                    System.out.println("Enter employe name: ");
                    String employeName = sc.next();
                    System.out.println("Enter initial salary: ");
                    double initialSalary = sc.nextDouble();
                    Employe newEmploye = new Employe(uniqueID, employeName, initialSalary);
                    employes.add(newEmploye);
                    System.out.println("Employe Entry succesfully done!");
                }
                else if(selector == 2){
                    System.out.println("Enter employe unique ID number");
                    int uniqueID = sc.nextInt();
                    Employe employe = findEmploye(employes, uniqueID);
                    if(employe != null){
                        System.out.println("Enter how much you want to add: ");
                        double addMoney = sc.nextDouble();
                        employe.initialSalary += addMoney;
                    }
                    else{
                        System.out.println("Enter correct unique ID number");
                    }
                }
                else if(selector == 3){
                    System.out.println("Enter unique ID number: ");
                    int uniqueID = sc.nextInt();
                    Employe employe = findEmploye(employes, uniqueID);
                    if(employe != null){
                        System.out.println("Enter percentage: ");
                        double percentage = sc.nextDouble();
                        employe.initialSalary += employe.initialSalary * (percentage / 100);
                        System.out.println("Successfully adjusted");
                    }
                    else{
                        System.out.println("Enter correct unique ID number");
                    }
                }
                else if(selector == 4){
                    System.out.println("Enter unique ID number: ");
                    int uniqueID = sc.nextInt();
                    Employe employe = findEmploye(employes, uniqueID);
                    if(employe != null){
                        System.out.println(employe);
                    }
                }
                else{
                    System.out.println("Enter correct input");
                }

            }
            else if(entry == 2){
                System.out.println("EXIT.....");
                sc.close();
                break;
            }
            else{
                System.out.println("Enter correct input");
            } 
        }
    }

    public static Employe findEmploye(ArrayList<Employe> employes ,int uniqueID){
        for (Employe employe : employes) {
            if(employe.uniqueID == uniqueID){
                return employe;
            }
        }
        return null;
    }

}
