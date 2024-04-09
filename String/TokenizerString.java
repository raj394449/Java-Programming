package String;

import java.util.StringTokenizer;

public class TokenizerString {
    public static void main(String args[]){
        StringTokenizer ref = new StringTokenizer("Hello World", " ");
        while(ref.hasMoreTokens()){
            System.out.println(ref.nextToken());
        }
    }
}
