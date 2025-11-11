// Demonstrates the Collatz conjecture.
public class Collatz {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int i = 1; i <= n; i++) {
            int New = i;
            int count = 1;

            
            if (i == 1) {
                if (mode.equals("v")) {
                    System.out.println("1 4 2 1 (4)");
                }
                continue;
            }

            if (mode.equals("v")) {
                System.out.print(i + " ");
            }

            while (New != 1) {
                count++;
                if (New % 2 == 0) {
                    New = New / 2;
                } else {
                    New = 3 * New + 1;
                }

                if (mode.equals("v")) {
                    System.out.print(New + " ");
                }
            }

            if (mode.equals("v")) {
                System.out.println("(" + count + ")");
            }
        }

        System.out.println("Every one of the first " + n + " hailstone sequences reached 1.");
    }
}
