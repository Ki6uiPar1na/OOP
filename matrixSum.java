import java.util.Scanner;

class Matrix {
    int row, col;
    int newMatrix[][], sumMatrix[][];

    Matrix(int row, int col) {
        this.row = row;
        this.col = col;
        newMatrix = new int[row][col];
        sumMatrix = new int[row][col];
    }

    void takeInput(Scanner sc) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Enter %d%d element: ", i + 1, j + 1);
                newMatrix[i][j] = sc.nextInt();
            }
        }
    }

    void printMatrix() {
        System.out.println("Your Entered Matrix is: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d ", newMatrix[i][j]);
            }
            System.out.println();
        }
    }    

}

public class matrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Summation \n2. Exit");
            int entry = sc.nextInt();
            if (entry == 1) {
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

                    System.out.println("Your entered first matrix is: ");
                    first.printMatrix();

                    System.out.println("Your entered first matrix is: ");
                    second.printMatrix();
                    
                }

            }
            if(entry == 2){
                break;
            }
        }

    }
}
