import java.util.Scanner;

public class LogicKnowledge {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        //I was confused that they both need to be in the same class,
        // so hopefully this satisfies that requirement....
        System.out.println("");
        System.out.println(">>>>>>>>>> Question 2 part 2 below:");
        System.out.println("");

        System.out.println("How many small bars do you have?");
        int small = inScanner.nextInt();
        System.out.println("How many large bars do you have?");
        int large = inScanner.nextInt();
        System.out.println("What is your goal?");
        int goal = inScanner.nextInt();

        System.out.println("Answer: " + makeChocolate(small, large, goal) + " small bar(s).");

    }

    // -5, no correct return
    public static void greenTicket(int a, int b, int c) {
        // None of the conditions are correct. They should be checking if two to three of the numbers are the same, not
        // not that they equal 1, 2, or 3. -15
        if (a == 1 && b == 1) {
            System.out.println("You get a 0.");
        }
        if (a == 2 || b == 2 || c == 2) {
            System.out.println("You get a 10.");
        }
        if (a == 3 || b == 3 || c == 3) {
            System.out.println("You get a 20.");
        }


    }

    public static int makeChocolate(int small, int large, int goal) {
        int totalLarge = large * 5;
        int total = small + totalLarge;
        int needed = total - goal;

        if (needed < 0) {
            return -1;
        }
        if (totalLarge > goal) {
            // That's really smart. I didn't think of that
            return needed % 5;
        }
        if (needed < small) {
            return goal - totalLarge;
        }
        if (needed > small) {
            //I was unclear in the instructions if I needed to make sure I had enough small bars even if the overall total of chocolate was greater than the goal number, so I put this in just in case.
            // You got that very correct. Good assertion
            return -1;
        }
        if (total > goal) {
            return needed;
        }
        return -1;
    }
}

