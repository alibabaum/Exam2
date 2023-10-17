import java.util.Scanner;

public class StringKnowledge {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        System.out.println("Please enter String A:");
        String stringA = inScanner.next();
        System.out.println("Please enter String B:");
        String stringB = inScanner.next();
        endOf(stringA, stringB);

    }

    public static void endOf(String stringA, String stringB) {
        String lowerStringA = stringA.toLowerCase();
        String lowerStringB = stringB.toLowerCase();
        int lengthA = stringA.length();
        int lengthB = stringB.length();

        String lastThreeA = lowerStringA.substring(lengthA - 3);
        String lastThreeB = lowerStringB.substring(lengthB - 3);

        boolean boolA = lowerStringA.contains(lastThreeB);
        boolean boolB = lowerStringB.contains(lastThreeA);

        if (boolA) {
            System.out.println("String A contains the suffix of String B.");
        } else {
            System.out.println("String A does not contain the suffix of String B.");
        }

        if (boolB) {
            System.out.println("String B contains the suffix of String A.");
        } else {
            System.out.println("String B does not contain the suffix of String A.");
        }
    }
}
