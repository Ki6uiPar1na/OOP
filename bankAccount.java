import java.util.*;


class Bank {
    int accountID;
    String name;
    String phoneNumber;
    double totalAmount;

    Bank(int accountID, String name, String phoneNumber, double totalAmount){
        this.accountID = accountID;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.totalAmount = totalAmount;
    }
    @Override
    public String toString() {
        return "Account ID: " + accountID + "\nName: " + name + "\nPhone Number: " + phoneNumber + "\nTotal Amount: $" + totalAmount;
    }
    
}

public class bankAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bank> accounts = new ArrayList<>();

        while(true){
            System.out.println("1. Enter Bank \n2. Exit Bank");
            int entry = sc.nextInt();
            if(entry == 1){
                System.out.println("1. Create a new Bank Account \n2. Add money \n3. Withdraw Money \n4. View Account Information");
                int data = sc.nextInt();
                if(data == 1){
                    createAccount(sc, accounts);
                }
                else if(data == 2){
                    addMoney(sc, accounts);
                }
                else if(data == 3){
                    withdrawMoney(sc, accounts);
                }
                else if(data == 4){
                    viewInformation(sc, accounts);
                }
                else{
                    System.out.println("Enter correct input, Thank You");
                }
            }
            else{
                break;
            }
        }
        
    }

    public static void createAccount(Scanner sc, ArrayList<Bank> accounts){
        System.out.println("Enter account ID: ");
        int accountID = sc.nextInt();
        System.out.println("Enter account Name: ");
        String accountName = sc.next();
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.next();
        System.out.println("Enter initial amount: ");
        double initialMoney = sc.nextDouble();

        Bank newAccount = new Bank(accountID, accountName, phoneNumber, initialMoney);
        accounts.add(newAccount);

        System.out.println("Account Created Successfully\n");
    }

    public static void viewInformation(Scanner sc, ArrayList<Bank> accounts){
        System.out.println("Enter unique account ID");
        int accountID = sc.nextInt();

        Bank account = findAccount(accounts, accountID);
        if(account != null){
            System.out.println("Your account Information is: ");
            System.out.println(account);
        }
        else{
            System.out.println("Account not Found");
        }
    }

    public static void addMoney(Scanner sc, ArrayList<Bank> accounts){
        System.out.println("Enter unique account ID: ");
        int accountID = sc.nextInt();

        Bank account = findAccount(accounts, accountID);
        if(account != null){
            System.out.printf("Enter amount of money: ");
            double newMoney = sc.nextDouble();
            account.totalAmount += newMoney;
            System.out.println("Your taka added Successfully, New amount is: " + account.totalAmount);
        }
        else{
            System.out.println("Account not found !");
        }
    }

    public static void withdrawMoney(Scanner sc, ArrayList<Bank> accounts){
        System.out.println("Enter unique account ID: ");
        int accountID = sc.nextInt();

        Bank account = findAccount(accounts, accountID);
        if(account != null){
            System.out.printf("Enter amount of money: ");
            double newMoney = sc.nextDouble();
            if(account.totalAmount <= 0 || (account.totalAmount - newMoney) < 0){
                System.out.println("You don't have balance, Enter correct amount !");
            }
            else{
                account.totalAmount -= newMoney;
                System.out.println("Your taka withdraw Successfully, New amount is: " + account.totalAmount);
            }
        }
        else{
            System.out.println("Account not found !");
        }
    }

    public static Bank findAccount(ArrayList<Bank> accounts, int accountID){
        for (Bank account : accounts) {
            if(account.accountID == accountID){
                return account;
            }  
        }
        return null;

    }

}