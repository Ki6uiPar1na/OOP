import java.util.Scanner;

class calculate{

    void percentage(int totalMark, int obtainMark){
        int ans = (100 * obtainMark) / totalMark;
        if(ans <= 49){
            System.out.println("Grade F");
        }
        else if(ans > 49 && ans <= 59){
            System.out.println("Grade D");
        }
        else if(ans > 59 && ans <= 69){
            System.out.println("Grade C");
        }
        else if(ans > 69 && ans <= 79){
            System.out.println("Grade B");
        }
        else{
            System.out.println("Grade A");
        }
    }
}

public class calculatePercentage {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        while(true){
            System.out.println("1. Calculate \n2. Exit");
            int program = sc.nextInt();
            if(program == 1){
                int obtainMark = sc.nextInt();
                int totalMark = sc.nextInt();

                if(obtainMark > totalMark){
                    System.out.println("It's Not Possible \nEnter Correct Input'");
                    
                }
                else{
                    calculate ans = new calculate();
                    ans.percentage(totalMark, obtainMark);
                }
            }
            if(program == 2){
                break;
            }
        }
        
    }
}
