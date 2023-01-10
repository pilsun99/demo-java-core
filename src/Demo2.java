import java.util.StringTokenizer;

public class Demo2 {
    public static void main(String[] args) {
        String hello = "Hello, I am your dad!";
        StringTokenizer tokenizer = new StringTokenizer(hello, ",", true);
        while (tokenizer.hasMoreTokens()) {}
        System.out.println(tokenizer.nextToken());
    }
}
