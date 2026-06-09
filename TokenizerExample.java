import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        String str1 = "Hello Welcome to Java";
        String str2 = "Java,Python,C++";

        StringTokenizer st1 = new StringTokenizer(str1);
        StringTokenizer st2 = new StringTokenizer(str2, ",");

        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }

        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }
}