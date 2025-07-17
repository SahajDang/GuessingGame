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

                int y_guess = 0;
                boolean valid = false;

                while (!valid) {
                    System.out.print("\nEnter your guess " + i + " (1 to 10): ");
                    if (sc.hasNextInt()) {
                        y_guess = sc.nextInt();
                        if (y_guess >= 1 && y_guess <= 10) {
                            valid = true;
                        } else {
                            System.out.println("❗ Please enter a number between 1 and 10.");
                        }
                    } else {
                        System.out.println("❗ Invalid input. Please enter a number.");
                        sc.next(); // consume the invalid token
                    }
                }

                System.out.println("Computer's guess was: " + guess);

                if (guess == y_guess) {
                    System.out.println("\n🎉 You got your guess correct! YIPPPEEEEEEE!");
                } else {
                    System.out.println("\n😢 Better luck next time!");
                }

                attempt += 1;

                if (i == n) {
                    System.out.println("\n\n🎯 Reached maximum number of guesses!\n");
                    break;
                } else {
                    continue;
                }
            }

            if (attempt == 6) {
                System.out.println("⚠️ Maximum attempts reached! Thank you for playing!");
            } else {
                System.out.println("🔄 Ready for the next attempt.\nHere we go.......\n");
            }

        } while (attempt != 6);

        sc.close();
    }
}
