class CopyArray {
    public static void main(String[] args) {

        // declaring a source array
        char[] copyFrom = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };

        // declaring a destination array
        char[] copyTo = new char[5];

        // copying array using System.arraycopy() method
        System.arraycopy(copyFrom, 1, copyTo, 0, 5);

        // printing the destination array
        System.out.println(String.valueOf(copyTo) + " ");
    }
}
