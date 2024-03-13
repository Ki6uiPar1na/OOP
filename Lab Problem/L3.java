import java.util.Scanner;

public class L3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int row1, col1, row2, col2;
        System.out.print("Enter the number of row of first matrix: ");
        row1 = sc.nextInt();
        System.out.print("Enter the number of column of first matrix: ");
        col1 = sc.nextInt();
        System.out.print("Enter the number of row of second matrix: ");
        row2 = sc.nextInt();
        System.out.print("Enter the number of column of second matrix: ");
        col2 = sc.nextInt();

        Matrix m1 = new Matrix(row1, col1);
        Matrix  m2 = new Matrix(row2, col2);

        m1.getInfo();
        m2.getInfo();

        if (row1 == row2 && col1 == col2) {
            Matrix sumMatrix = addMatrices(m1, m2);
            System.out.println("\nSum of the matrices:");
            sumMatrix.display();
        } 
        else {
            System.out.println("Matrices cannot be added. They have different dimensions.");
        }

        if(col1 != row2){
            System.out.println("Matrix Multiplication is not possiable");
        }
        else{
            Matrix Mul_matrix =  multiplication(m1, m2);
            System.out.println("Matrix Multiplication result is: ");
            Mul_matrix.display();
        }
    }
    static class Matrix {
        int row, col, A_matrix[][];

        Matrix(int row, int col){
            this.row = row;
            this.col = col;
            this.A_matrix = new int[this.row][this.col];
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

    static Matrix addMatrices(Matrix m1, Matrix m2) {
        Matrix result = new Matrix(m1.row, m1.col);
        for (int i = 0; i < m1.row; i++) {
            for (int j = 0; j < m1.col; j++) {
                result.A_matrix[i][j] = m1.A_matrix[i][j] + m2.A_matrix[i][j];
            }
        }
        return result;
    }

    static Matrix multiplication(Matrix m1, Matrix m2){
        Matrix result = new Matrix(m1.row, m2.col);
            for (int i = 0; i < m1.row; i++) {
                for (int j = 0; j < m2.col; j++) {
                    for (int k = 0; k < m1.col; k++) {
                        result.A_matrix[i][j] += m1.A_matrix[i][k] * m2.A_matrix[k][j];
                    }
                }
            }
            return result;
    }
}
