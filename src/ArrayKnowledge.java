import java.util.Scanner;

public class ArrayKnowledge {
    public static void main(String[] args) {

        Scanner inScanner = new Scanner(System.in);
        System.out.println("Please enter your string:");
        String str = inScanner.nextLine();
        stringToArray(str);
        System.out.println("");
        System.out.println(">>>>>>>> Question 2 below:");
        System.out.println("");

        System.out.println("What is your starting number?");
        int start = inScanner.nextInt();
        System.out.println("What is your ending number?");
        int end = inScanner.nextInt();
        System.out.println("What is your counting interval?");
        int step = inScanner.nextInt();

        generateArrayWithBounds(start, end, step);

    }

    // -5 for no correct return
    public static void stringToArray(String str) {
        char[] chars = str.toCharArray();

        int i = 0;
        System.out.print("Your array is: [");
        while (i < str.length() - 1) {
            System.out.print("'" + chars[i] + "', ");
            i++;
            if (i == str.length() - 1) {
                System.out.print("'" + chars[i] + "'");
            }
        }
        System.out.println("]");
    }

    // -5 for no correct return
    public static void generateArrayWithBounds(int start, int end, int step) {
        int[] numbers = new int[100];
        int i = 0;
        System.out.print("[");

        for (i = 0; start < end; i++) {
            numbers[i] = start;
            System.out.print(numbers[i] + " ");
            start = start + step;
        }
        System.out.print("]");
    }
}
