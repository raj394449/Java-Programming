import java.util.*;

public class MatrixAddition {
    public static void main(String args[]) {

        int first_matrix[][] = new int[3][3];
        int second_matrix[][] = new int[3][3];
        int result_matrix[][] = new int[3][3];

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Matrix data : ");
        for (int i = 0; i < first_matrix.length; i++) {
            for (int j = 0; j < first_matrix.length; j++) {
                first_matrix[i][j] = sc.nextInt();
            }
            System.out.println("");
        }

        System.out.println("Enter Second Matrix data : ");
        for (int i = 0; i < second_matrix.length; i++) {
            for (int j = 0; j < second_matrix.length; j++) {
                second_matrix[i][j] = sc.nextInt();
            }
            System.out.println("");
        }

        System.out.println("Resultant Matrix data : ");
        for (int i = 0; i < result_matrix.length; i++) {
            for (int j = 0; j < result_matrix.length; j++) {
                result_matrix[i][j] = first_matrix[i][j] + second_matrix[i][j];
                System.out.print(result_matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
