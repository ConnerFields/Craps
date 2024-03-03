//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;  // must import Random
import java.util.Scanner; //importing scanner
public class Craps {
    public static void main(String[] args) {
        Random rnd = new Random(); // create a Random object called rnd.
        Scanner scanner = new Scanner(System.in); //prepares scanner

        boolean playAgain = true; //used to keep loop going




        while (playAgain)
        {

            int rollOne = rnd.nextInt(6) + 1; //Rolls first die
            int rollTwo = rnd.nextInt(6) + 1; //Rolls second die
            int total = rollOne + rollTwo; //adds both die together



            System.out.println("Welcome to the table!"); //greets user


            System.out.println("Press Enter to roll the dice!");
            scanner.nextLine(); // Wait for user to press Enter

            System.out.println("You rolled " + rollOne + " and " + rollTwo + " for a total of " + total + "!"); //lets them know how they rolled
            if (total == 7 || total == 11)
            {
                System.out.println("CRAPS! Congratulations! You win!");
            }
            else if (total == 2 || total == 3 || total == 12)
            {
                System.out.println("Better luck next time! You lost.");
            }
            else
            {
                int points = total; //adds totals to keep track of points
                System.out.println("Point established. Let's keep rolling.");

                boolean keepRolling = true; // used when user keeps rolling


                while (keepRolling) {

                    System.out.println("Press Enter to roll for points!");
                    scanner.nextLine(); // Wait for user to press Enter

                    rollOne = rnd.nextInt(6) + 1; //reroll dice one
                    rollTwo = rnd.nextInt(6) + 1; //reroll dice two
                    total = rollOne + rollTwo;

                    System.out.println("You rolled " + rollOne + " and " + rollTwo + " for a total of " + total + "!"); //lets them know how they rolled


                    if (total == points) {
                        System.out.println("Congratulations! You rolled the point. You win!");
                        keepRolling = false;
                    } else if (total == 7) {
                        System.out.println("Sorry, you rolled a 7. You lose.");
                        keepRolling = false;
                    }
                }
            }
            System.out.print("Do you want to play again? (y/n): ");
            String again = scanner.next();
            playAgain = again.equalsIgnoreCase("y");
            scanner.nextLine(); // clears the value
        }
        System.out.println("Thanks for playing!");
    }
}