import java.util.Arrays;

public class ArrayClassMethod {
    public static void main(String args[]) {

        // 1D Arrays
        String cities[] = { "Ambala", "Pune", "Patna", "Chandigarh" };

        // 2D Arrays
        int arr[][] = { { 42, 43, 43, 23, 34 }, { 23, 54, 54, 54, 54 } };

        // Arrays method for single dimensonal
        
        // toString() method
        System.out.println("toString() method : " + Arrays.toString(cities));

        // asList() method
        System.out.println("asList() method : " + Arrays.asList(cities));

        // For Multidimensonal method
        // deepToString() method
        System.out.println("deepToString() method : " + Arrays.deepToString(arr));
    }
}