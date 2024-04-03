public class TraversalArray {
    void displayArray() {
        int marks[] = {67, 45, 39, 69};
        for (int i = 0; i <marks.length; i++) {
            System.out.println(marks[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 10, 30, 25, 20, 29 };
        arr[0] = 28;
        System.out.println("Accessing array element at index [2] : " + arr[2]);
        System.out.println(arr[0]);

        TraversalArray obj = new TraversalArray();
        obj.displayArray();
    }
}
