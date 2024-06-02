import java.util.Scanner;

class Matrix{
    int row;
    int col;
    int matrix[][];
    int summation[][];
    int mul[][];

    Matrix(int row, int col){
        this.row = row;
        this.col = col;
        matrix = new int[row][col];
        summation = new int[row][col];
        mul = new int[row][col];
    }

    void getMatrix(Scanner sc){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
    }
    void printMatrix(){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("%d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

    void sumMatrix(Matrix other){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                summation[i][j] = this.matrix[i][j] + other.matrix[i][j];
            }
        }
    }

    void sumMatrixPrint(Matrix o){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("%d ", summation[i][j]);
            }
            System.out.println();
        }
    }

    void multMatrix(Matrix other){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                for(int k = 0; k < col; k++){
                    mul[i][j] += this.matrix[i][k] * other.matrix[k][j];
                }
            }
        }
    }
    void mulMatrixPrint(Matrix o){
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.printf("%d ", mul[i][j]);
            }
            System.out.println();
        }
    }

}


public class matrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matrix mat1 = new Matrix(2, 2);
        Matrix mat2 = new Matrix(2, 2);

        mat1.getMatrix(sc);
        mat1.printMatrix();

        mat2.getMatrix(sc);
        mat2.printMatrix();

        mat1.sumMatrix(mat2);
        mat1.sumMatrixPrint(mat2);

        mat1.multMatrix(mat2);
        mat1.mulMatrixPrint(mat2);
    }

}
