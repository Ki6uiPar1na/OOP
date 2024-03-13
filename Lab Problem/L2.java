import java.util.Scanner;

public class L2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the number of row: ");
        int row = sc.nextInt();

        System.out.println("Enter the number of column: ");
        int col = sc.nextInt();

        Matrix m1 = new Matrix(row, col);

        m1.getInfo();
        m1.display();

        
    }

    static class Matrix{
        int row, col;
        int A_matrix[][];

        Matrix(int row, int col){
            this.row = row;
            this.col = col;
            this.A_matrix = new int[row][col];
        }
        void getInfo(){
            System.out.println("\nEnter the element of matrix: ");
            for(int i = 0; i < this.row; i++){
                for(int j = 0; j < this.col; j++){
                    A_matrix[i][j] = sc.nextInt();
                }
            }
        }
        void display(){
            System.out.printf("\nElement of the matrix is: \n");
            for(int i = 0; i < this.row; i++){
                for(int j = 0; j < this.col; j++){
                    System.out.printf("%d ", A_matrix[i][j]);
                }
                System.out.println();
            }
        }
    }
}
