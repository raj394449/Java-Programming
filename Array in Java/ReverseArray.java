import java.util.*;

public class ReverseArray {
    public static void main(String args[]) {
        int arr[] = new int[5];

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Array Element are : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nArray Element are in Reverse Order : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
