import java.util.*;

class GuessingGame {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to the Guessing game!");
        Scanner sc = new Scanner(System.in);

        int max = 10;
        int min = 1;
        int range = max - min + 1;
        System.out.print("Enter the number of guesses you want to perform: ");
        int n = sc.nextInt();

        int attempt = 5;
        do {

            for (int i = 1; i <= n; i++) {

                int guess = (int) (Math.random() * range) + min;
                System.out.print("\nEnter your guess " + i + ": ");
                int y_guess = sc.nextInt();
                System.out.println("Computers guess was: " + guess);

                if (guess == y_guess) {
                    System.out.println("\nYou got your guess correct! YIPPPEEEEEEE!");

                } else {
                    System.out.println("\nBetter luck next time!");

                }

                attempt += 1;

                if (i == n) {
                    System.out.println("\n\nReached guesses!\n");
                    break;
                } else {
                    continue;
                }

            }
            if (attempt == 6) {
                System.out.println("Maximum attempts reached! Thank You!");
            } else {
                System.out.println("                  Ready for the next attempt.\n                  Here we go.......           \n");
            }

        } while (attempt != 6);
        sc.close();
    }
}