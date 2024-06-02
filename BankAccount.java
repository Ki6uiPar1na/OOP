import java.util.*;

class Bank {
    int accountID;
    String name;
    String phoneNumber;
    double totalAmount;

    Bank(int accountID, String name, String phoneNumber, double totalAmount) {
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

public class BankAccount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bank> accounts = new ArrayList<>();

        while (true) {
            System.out.println("1. Enter Bank \n2. Exit Bank");
            int entry = sc.nextInt();
            if (entry == 1) {
                System.out.println("1. Create a new Bank Account \n2. Add money \n3. Withdraw Money \n4. View Account Information");
                int data = sc.nextInt();
                switch (data) {
                    case 1:
                        createAccount(sc, accounts);
                        break;
                    case 2:
                        addMoney(sc, accounts);
                        break;
                    case 3:
                        withdrawMoney(sc, accounts);
                        break;
                    case 4:
                        viewInformation(sc, accounts);
                        break;
                    default:
                        System.out.println("Enter correct input, Thank You");
                }
            } else {
                break;
            }
        }
        sc.close();
    }

    public static void createAccount(Scanner sc, ArrayList<Bank> accounts) {
        System.out.println("Enter account ID: ");
        int accountID = sc.nextInt();
        sc.nextLine();  // Consume the newline character left by nextInt
        System.out.println("Enter account Name: ");
        String accountName = sc.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter initial amount: ");
        double initialMoney = sc.nextDouble();

        Bank newAccount = new Bank(accountID, accountName, phoneNumber, initialMoney);
        accounts.add(newAccount);

        System.out.println("Account Created Successfully\n");
    }

    public static void addMoney(Scanner sc, ArrayList<Bank> accounts) {
        System.out.println("Enter account ID: ");
        int accountID = sc.nextInt();
        Bank account = findAccount(accounts, accountID);
        if (account != null) {
            System.out.println("Enter amount to add: ");
            double amount = sc.nextDouble();
            account.totalAmount += amount;
            System.out.println("Money added successfully. New balance: $" + account.totalAmount);
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void withdrawMoney(Scanner sc, ArrayList<Bank> accounts) {
        System.out.println("Enter account ID: ");
        int accountID = sc.nextInt();
        Bank account = findAccount(accounts, accountID);
        if (account != null) {
            System.out.println("Enter amount to withdraw: ");
            double amount = sc.nextDouble();
            if (amount <= account.totalAmount) {
                account.totalAmount -= amount;
                System.out.println("Money withdrawn successfully. New balance: $" + account.totalAmount);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    public static void viewInformation(Scanner sc, ArrayList<Bank> accounts) {
        System.out.println("Enter account ID: ");
        int accountID = sc.nextInt();
        Bank account = findAccount(accounts, accountID);
        if (account != null) {
            System.out.println("Account Information: ");
            System.out.println(account);
        } else {
            System.out.println("Account not found.");
        }
    }

    public static Bank findAccount(ArrayList<Bank> accounts, int accountID) {
        for (Bank account : accounts) {
            if (account.accountID == accountID) {
                return account;
            }
        }
        return null;
    }
}
