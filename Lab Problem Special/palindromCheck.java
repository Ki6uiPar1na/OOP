import java.util.Scanner;

public class palindromCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for entry other for exit: ");
            int entry = sc.nextInt();
            if(entry == 1){
                System.out.println("1. Number palindrome \n2. String palindrome");
                int select = sc.nextInt();
                if(select == 1){
                    System.out.println("Enter the number: ");
                    int N = sc.nextInt();
                    if(numberPalindrome(N)){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
                else{
                    System.out.println("Enter the string: ");
                    String s = sc.next();
                    if(stringPalindrome(s)){
                        System.out.println("YES");
                    }
                    else{
                        System.out.println("NO");
                    }
                }
            }
            else{
                break;
            }
            
        }
    }    
    public static boolean numberPalindrome(int n){
        int temp = 0;
        int tempN = n;
        while(n != 0){
            temp = (temp * 10) + n % 10;
            n /= 10;
        }
        return (temp == tempN);
    }

    public static boolean stringPalindrome(String s){
        String temp = "";
        for(int i = s.length() - 1; i >= 0; i--){
            temp += s.charAt(i);
        }
        return (s.equals(temp));
    }
}
