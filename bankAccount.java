import java.util.*;

class Bank{
    int name;
    String phoneNumber;
    int money;

    Bank(int name, String phoneNumber, int money){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.money = money;
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
                System.out.println("1. Create Bank Account \n2. Add Money \n3. Withdraw Money \n4. Close Account");
                int bankData = sc.nextInt();
                if(bankData == 1){
                    System.out.println("Enter the account number: ");
                    int accountName = sc.nextInt();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = sc.next();
                    System.out.println("Enter money amount: ");
                    int initialMoney = sc.nextInt();

                    Bank accountID = new Bank(accountName, phoneNumber, initialMoney);
                    accounts.add(accountID);
                    System.out.println("Account Created Successfully");
      
                }
                System.out.println(accounts.accountID);
            }


            else{
                break;
            }
        }
    }
}
