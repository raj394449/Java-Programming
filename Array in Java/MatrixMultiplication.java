import java.util.*;

public class MatrixMultiplication {

    void matrixMultiplication() {

        int first_matrix[][] = new int[3][3];
        int second_matrix[][] = new int[3][3];
        int resul_matrix[][] = new int[3][3];
        int temp_matrix[][] = new int[3][3];

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first matrix data : ");
        for (int i = 0; i < first_matrix.length; i++) {
            for (int j = 0; j < first_matrix.length; j++) {
                first_matrix[i][j] = sc.nextInt();
            }
            System.out.println("");
        }

        System.out.println("Enter second matrix data : ");
        for (int i = 0; i < second_matrix.length; i++) {
            for (int j = 0; j < second_matrix.length; j++) {
                second_matrix[i][j] = sc.nextInt();
            }
            System.out.println("");
        }

        // Main logic for matrix multiplication
        for (int i = 0; i < resul_matrix.length; i++) {
            for (int j = 0; j < resul_matrix.length; j++) {
                temp_matrix[i][j] = 0;
                for (int k = 0; k < temp_matrix.length; k++) {
                    resul_matrix[i][j] = temp_matrix[i][j] + first_matrix[i][k] * second_matrix[k][j];
                }
            }
        }

        System.out.println("Resultant Matrix : ");
        for (int i = 0; i < resul_matrix.length; i++) {
            for (int j = 0; j < resul_matrix.length; j++) {
                System.out.print(resul_matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        MatrixMultiplication obj = new MatrixMultiplication();
        obj.matrixMultiplication();
    }
}
