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

    // -5, doesn't return anything
    public static void endOf(String stringA, String stringB) {
        String lowerStringA = stringA.toLowerCase();
        String lowerStringB = stringB.toLowerCase();
        int lengthA = stringA.length();
        int lengthB = stringB.length();

        // I understand why you did this with the last three,
        // but the question was if one string ended with the other no matter lenght.
        // So I would have expected endOf("Hamburger", "Burger") to return true, but
        // endOf("Craven", "Coven") to return false, but with how you've implemented it here, the latter
        // would print false. (-4)
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
