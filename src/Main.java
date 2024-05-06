import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Create an array with all possible moves for computer
        String[] random = {"rock", "paper", "scissors"};

        //Random move must be one from the array of all possible moves
        String compMove = random[new Random().nextInt(random.length)];

        //Scanner for user input
        Scanner userInput = new Scanner(System.in);

        String input;

        //While loop to validate user moves
        while(true) {
            //Prompt user to enter a move
            System.out.println("Please enter a move (rock, paper or scissors): ");

            //Store user's move in string
            input =  userInput.nextLine();

            //If the user's input is valid break out of while loop
            if(input.equals("rock") || input.equals("paper") || input.equals("scissors")) {
                break;
            }
            System.out.println(input + "is not a valid move.");
        }

        //Print out what computer played
        System.out.println("Computer played: " + compMove);

        //If the player move is the same as the computer move
        if (input.equals(compMove)) {
            System.out.println("The game was a tie!");
        }

        else if()

    }
}
