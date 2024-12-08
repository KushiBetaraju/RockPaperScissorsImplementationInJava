package RockPaperScissors;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Winning rules of the game ROCK PAPER SCISSORS are:\n"
      + "Rock vs Paper -> Paper wins \n"
      + "Rock vs Scissors -> Rock wins \n"
      + "Paper vs Scissor -> Scissor wins \n");
        
        while (true) {
            // Display the choices available to the user
        	System.out.println("The choices which the program will accept are: ");
        	System.out.println("1 - Rock");
        	System.out.println("2 - Paper");
        	System.out.println("3 - Scissor");
        	// Get user input and convert it to an integer.
        	
        	// Take input from the user
            System.out.print("Enter your choice (1,2, or 3 : \n ");
            int user_input = input.nextInt();
            
            // Validate user input to ensure it's between 1 and 3
            while (user_input < 1 || user_input > 3) {
                System.out.println("You have entered an invalid input. Please try again.");
                System.out.print("Enter your choice (1, 2, or 3): ");}
            
            String user_init = "";

	         // Display the user's choice
	         if (user_input == 1) {
	             user_init = "Rock";
	         } else if (user_input == 2) {
	             user_init = "Paper";
	         } else if (user_input == 3) {
	             user_init = "Scissors";
	         } else {
	             System.out.println("Invalid choice! Please select 1, 2, or 3.");
	         }

    		
            // Generate a random choice for the computer/
            int comp_input = rand.nextInt(1,3);
            String comp_init = "";
            // Display the computer's choice
            if (comp_input == 1) {
            	 comp_init = "Rock";
            } else if (comp_input == 2) {
            	 comp_init = "Paper";
            } else {
            	 comp_init = "Scissors";
            }
            
            // Show both user and computer choice
            System.out.println("You chose: " + user_init);
            System.out.println("Computer chose: " + comp_init);
            
            
            // Determine the winner based on the game rules
            String result = "";
            if (user_input == 1 && comp_input == 2 || comp_input == 1 && user_input == 2) {
            	result = "Paper";
            } else if (user_input == 2 && comp_input == 3 || comp_input == 2 && user_input == 3) {
            	result = "Scissor";
            } else if (user_input == 3 && comp_input == 1 || comp_input == 3 && user_input == 1) {
            	result = "Rock";
            } else if (user_input == comp_input){
            	result = "Draw Match";
            }
            else {
            	System.out.println("Invalid user input");
            }
            
            // Announce the result of the game 
            if (result == "Paper") {
            	System.out.println("***** Paper wins *****\n");
            } else if (result == "Rock") {
            	System.out.println("***** Rock Wins *****\n");
            } else if (result == "Scissor") {
            	System.out.println("***** Scissors Wins *****\n");
            } else if (result == "Draw Match") {
            	System.out.println("***** It's a tie *****\n");
            }
            
            if (user_input == comp_input) {
            	System.out.println("It's a tie! ");
            } else if (user_input == 1 && comp_input == 3 || user_input == 2 && comp_input == 1 || user_input == 3 && comp_input == 2) {
            	System.out.println("You win! ");
            } else {
            	System.out.println("Computer wins! ");
            }
            
            
            
            System.out.println("Do you want to play again? [Y or N]");
            Scanner sc = new Scanner(System.in);
            String ans = sc.nextLine(); // Read input //ERROR
            if (ans.equalsIgnoreCase("n")) { // Compare ignoring case
                System.out.println("Thanks for playing!");
                break; // Exit the loop
            }
            
        }
        
        input.close();
	}

}
