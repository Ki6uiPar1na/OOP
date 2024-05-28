import java.util.*;

class Bank {
    int accountNumber;
    String phoneNumber;
    int balance;

    Bank(int accountNumber, String phoneNumber, int balance) {
        this.accountNumber = accountNumber;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
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
                System.out.println("1. Create Bank Account \n2. Add Money \n3. Withdraw Money \n4. Close Account \n5. View Account Information");
                int bankData = sc.nextInt();
                switch (bankData) {
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
                        closeAccount(sc, accounts);
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } else if (entry == 2) {
                break;
            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }
        sc.close();
    }

    private static void createAccount(Scanner sc, ArrayList<Bank> accounts) {
        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.println("Enter phone number: ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter initial money amount: ");
        int initialMoney = sc.nextInt();

        Bank newAccount = new Bank(accountNumber, phoneNumber, initialMoney);
        accounts.add(newAccount);
        System.out.println("Account Created Successfully");
    }

    private static void addMoney(Scanner sc, ArrayList<Bank> accounts) {
        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();
        Bank account = findAccount(accounts, accountNumber);
        if (account != null) {
            System.out.println("Enter the amount to add: ");
            int amount = sc.nextInt();
            account.balance += amount;
            System.out.println("Money added successfully. New balance: " + account.balance);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdrawMoney(Scanner sc, ArrayList<Bank> accounts) {
        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();
        Bank account = findAccount(accounts, accountNumber);
        if (account != null) {
            System.out.println("Enter the amount to withdraw: ");
            int amount = sc.nextInt();
            if (amount <= account.balance) {
                account.balance -= amount;
                System.out.println("Money withdrawn successfully. New balance: " + account.balance);
            } else {
                System.out.println("Insufficient balance.");
            }
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void closeAccount(Scanner sc, ArrayList<Bank> accounts) {
        System.out.println("Enter the account number: ");
        int accountNumber = sc.nextInt();
        Bank account = findAccount(accounts, accountNumber);
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account closed successfully.");
        } else {
            System.out.println("Account not found.");
        }
    }

    private static Bank findAccount(ArrayList<Bank> accounts, int accountNumber) {
        for (Bank account : accounts) {
            if (account.accountNumber == accountNumber) {
                return account;
            }
        }
        return null;
    }
}
