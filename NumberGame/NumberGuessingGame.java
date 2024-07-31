package CodSoft;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Random random = new Random();
	        boolean playAgain = true;

	        while (playAgain) {
	            int randomNumber = random.nextInt(100) + 1; // Generate random number between 1 and 100
	            int attempts = 0;
	            int maxAttempts = 100;
	            boolean guessedCorrectly = false;

	            System.out.println("I have generated a random number between 1 and 100. Try to guess it!");

	            while (attempts < maxAttempts && !guessedCorrectly) {
	                System.out.print("Enter your guess: ");
	                int userGuess = scanner.nextInt();
	                attempts++;

	                if (userGuess == randomNumber) {
	                    guessedCorrectly = true;
	                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	                } else if (userGuess < randomNumber) {
	                    System.out.println("Your guess is too low. Try again.");
	                } else {
	                    System.out.println("Your guess is too high. Try again.");
	                }
	            }

	            if (!guessedCorrectly) {
	                System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNumber + ".");
	            }

	            System.out.print("Do you want to play again? (yes/no): ");
	            scanner.nextLine(); // Consume newline
	            String userResponse = scanner.nextLine().trim().toLowerCase();
	            playAgain = userResponse.equals("yes");
	        }

	        System.out.println("Thank you for playing! Goodbye.");
	        scanner.close();
	    }
	}



