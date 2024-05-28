import java.util.Scanner;

class CheckNumberPalindrome {
    boolean numberCheck(int n) {
        int temp = 0, newNumber = 0;
        int ans = n;
        while (n != 0) {
            temp = n % 10;
            newNumber = (newNumber * 10) + temp;
            n /= 10;
        }
        return ans == newNumber;
    }
}

class CheckPalindrome {
    boolean check(String s) {
        String newString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newString += s.charAt(i);
        }
        return s.equals(newString);
    }
}

public class palindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Check Palindrome \n2. Exit\n");
            int entry = sc.nextInt();
            if (entry == 1) {
                CheckNumberPalindrome checkNumberPalindrome = new CheckNumberPalindrome();
                System.out.println("1. Number Palindrome Check \n2. String Palindrome Check");
                int flag = sc.nextInt();
                sc.nextLine(); // Consume the newline character left by nextInt()
                if (flag == 1) {
                    System.out.printf("Enter the number to check palindrome: ");
                    int N = sc.nextInt();
                    if (checkNumberPalindrome.numberCheck(N)) {
                        System.out.println("Your entered number is a palindrome.");
                    } else {
                        System.out.println("Your entered number is not a palindrome.");
                    }
                } else if (flag == 2) {
                    CheckPalindrome str = new CheckPalindrome();
                    System.out.printf("Enter the string to check palindrome: ");
                    String nx = sc.nextLine();
                    if (str.check(nx)) {
                        System.out.println("YES");
                    } else {
                        System.out.println("NO");
                    }
                }
            } else if (entry == 2) {
                break;
            }
        }
        sc.close();
    }
}
