import java.util.*;

class Bank{
    int uniqueID;
    String name; 

    Bank(int uniqueID, String name){
        this.uniqueID = uniqueID;
        this.name = name;
    }

    public String toString(){
        return "Name: " + name + " Unique ID " + uniqueID;
    }
}

public class bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bank> accounts = new ArrayList<>();
        while (true) {
            System.out.println("Enter your name: ");
            String accountName = sc.next();
            System.out.println("Enter unique id: ");
            int uniqueID = sc.nextInt();
            Bank account = new Bank(uniqueID, accountName);
            accounts.add(account);
            
            if(findAccount(accounts, uniqueID) != null){
                Bank accountInformation = findAccount(accounts, uniqueID);
                System.out.println(accountInformation);
            }
            else{
                return;
            }
        }
    }
    public static Bank findAccount(ArrayList<Bank> accounts, int id){
        for (Bank account : accounts) {
            if(account.uniqueID == id){
                return account;
            }  
        }
        return null;
    }
}