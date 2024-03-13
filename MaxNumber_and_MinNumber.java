import java.util.Scanner;

public class MaxNumber_and_MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runner = 1;
        while(runner == 1){
            System.out.println("\nIf You want to STOP the program enter 0 :");
            runner = sc.nextInt();
            if(runner == 0){
                return;
            }
            else{
                System.out.println("Enter the size of the array : ");
                int size = sc.nextInt();

                int A[] = new int[size];

                for(int i = 0; i < size; i++){
                    System.out.printf("Enter the %d element of the array : ",  size);
                    A[i] = sc.nextInt();
                }
                int max_number = A[0], min_number = A[0];
                for(int i = 0; i < size; i++){
                    if(A[i] > max_number){
                        max_number = A[i];
                    }
                    if(A[i] < min_number){
                        min_number = A[i];
                    }
                }
                
                System.out.println("The maximum number is : " + max_number);
                System.out.println("The minimum number is : " + min_number);
            }
        }
    }
}
