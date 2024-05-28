import java.util.Scanner;

class Matrix {
    int row, col;
    int newMatrix[][], sumMatrix[][], multiplicationMatrix[][];

    Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        newMatrix = new int[row][col];
        sumMatrix = new int[row][col];
        multiplicationMatrix = new int[row][col];
        
    }

    void takeInput(Scanner sc) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter %d%d element: ", i + 1, j + 1);
                newMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }

    void matrixSum(Matrix other){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sumMatrix[i][j] = this.newMatrix[i][j] + other.newMatrix[i][j];
            }
        }
    }

    void matrixMul(Matrix other){
        System.out.println("\nMatrix multiplication result is: ");
        for(int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++){
                for(int k = 0; k < other.row; k++ ){
                    multiplicationMatrix[i][j] += this.newMatrix[i][k] * other.newMatrix[k][j];
                }
            }
        }
    }

    void printMatrix() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", newMatrix[i][j]);
            }
            System.out.println();
        }
    }
    
    void printSumMatrix(){
        System.out.println("\nSum of your matrices is :");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("%d ", sumMatrix[i][j]);
            }
            System.out.println();
        }
    }
    void printMulMatrix(){
        for(int i = 0; i < this.row; i++){
            for(int j = 0; j < this.col; j++){
                System.out.printf("%d ", multiplicationMatrix[i][j]);
            }
            System.out.println();
        }
    }



}

public class matrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n1. Calculation \n2. Exit");
            int entry = sc.nextInt();
            if (entry == 1) {
                System.out.println("1. Sum Matrix \n2. Multiplication Matrix");
                int decide = sc.nextInt();
                if(decide == 1){
                    System.out.printf("Enter the number of row and col of first matrix: ");
                    int row1 = sc.nextInt();
                    int col1 = sc.nextInt();

                    System.out.printf("Enter the number of row and col of second matrix: ");
                    int row2 = sc.nextInt();
                    int col2 = sc.nextInt();

                    if ((row1 != row2) || (col1 != col2)) {
                        System.out.println("Matrix can't be added");
                    } else {
                        Matrix first = new Matrix(row1, col1);
                        Matrix second = new Matrix(row2, col2);

                        System.out.println("Enter the element of first matrix: ");
                        first.takeInput(sc);
                        
                        System.out.println("Enter the element of second matrix: ");
                        second.takeInput(sc);

                        System.out.println("\nYour entered first matrix is: ");
                        first.printMatrix();
                        System.out.println();

                        System.out.println("\nYour entered second matrix is: ");
                        second.printMatrix();
                        System.out.println();

                        first.matrixSum(second);
                        first.printSumMatrix();  
                        System.out.println();
                        
                    }
                }
                else if(decide == 2){
                    System.out.printf("Enter the number of row and col of first matrix: ");
                    int row1 = sc.nextInt();
                    int col1 = sc.nextInt();

                    System.out.printf("Enter the number of row and col of second matrix: ");
                    int row2 = sc.nextInt();
                    int col2 = sc.nextInt();
                    if(col1 == row2){
                        Matrix first = new Matrix(row1, col1);
                        Matrix second = new Matrix(row2, col2);

                        System.out.println("Enter the element of first matrix: ");
                        first.takeInput(sc);
                        
                        System.out.println("Enter the element of second matrix: ");
                        second.takeInput(sc);

                        System.out.println("Your entered first matrix is: ");
                        first.printMatrix();

                        System.out.println("Your entered second matrix is: ");
                        second.printMatrix();

                        first.matrixMul(second);
                        first.printMulMatrix();
                        System.out.println();

                    }
                    else{
                        System.out.println("Matrix multiplication is not possible");
                    }
                }

            }
            if(entry == 2){
                break;
            }
        }
    }
}
