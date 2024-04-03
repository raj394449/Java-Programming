import java.util.StringTokenizer;

public class Question_08 {
    public static void main(String[] args) {
        String sentence = "Hello, this is a StringTokenizer example.";

        // Create a StringTokenizer object with space as the delimiter
        StringTokenizer tokenizer = new StringTokenizer(sentence);

        // Print each token
        System.out.println("Tokens separated by space:");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }

        // Create a StringTokenizer object with comma as the delimiter
        StringTokenizer tokenizer2 = new StringTokenizer(sentence, ",");

        // Print each token
        System.out.println("\nTokens separated by comma:");
        while (tokenizer2.hasMoreTokens()) {
            System.out.println(tokenizer2.nextToken());
        }
    }
}
