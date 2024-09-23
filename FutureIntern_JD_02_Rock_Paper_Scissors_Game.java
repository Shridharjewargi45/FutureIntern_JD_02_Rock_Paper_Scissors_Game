import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String[] choices = {"Rock", "Paper", "Scissors"};
        String userChoice;
        String computerChoice;
        boolean keepPlaying = true;
        
        System.out.println("Welcome to Rock, Paper, Scissors!");
        
        // Loop to continue playing until the user chooses to stop
        while (keepPlaying) {
            // Get the user's choice
            System.out.println("\nEnter your choice (Rock, Paper, Scissors). Type 'exit' to stop playing: ");
            userChoice = scanner.nextLine().toLowerCase();
            
            // Check if the user wants to exit the game
            if (userChoice.equals("exit")) {
                keepPlaying = false;
                System.out.println("Thank you for playing!");
                break;
            }

            // Validate the user's input
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input. Please enter Rock, Paper, or Scissors.");
                continue;
            }

            // Computer randomly selects Rock, Paper, or Scissors
            int computerRandomChoice = random.nextInt(3);  // Generates 0, 1, or 2
            computerChoice = choices[computerRandomChoice].toLowerCase();
            
            System.out.println("Computer chose: " + choices[computerRandomChoice]);
            
            // Determine the winner based on the rules
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                       userChoice.equals("paper") && computerChoice.equals("rock") ||
                       userChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
        
        scanner.close();
    }
}