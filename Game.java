import java.util.Scanner;
import java.util.Random;


public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    // greet player
    System.out.println("Hi there! What is your name?");
    // get player name
    String playerName = input.nextLine();
    System.out.println(playerName + ", I'm thinking of a number between 0 and 100. Try to guess the number!");
    // choose random number between 0 and 100
    // Create instance of the Random Class
    Random rand = new Random();
    // call method nextInt and pass in the upper range bound
    int number = rand.nextInt(100);
    // print the random number to see what the number is for testing purposes
    System.out.println(number);

    // counter for number of guesses
    int counter = 0;
    
    while(true) {
    // ask for users guess
    System.out.println("Your guess?");
    // get user guess input
    int guess = input.nextInt();
    // originally had counter = 0 here --- this is wrong because it resets the counter
    // to 0 everytime it goes through the loop. Counter has to be OUTSIDE the loop
    // so it doesn't start over every iteration

    // if guess is OUTSIDE the range 0 to 100
    if (guess < 0 | guess > 100) {
      System.out.println("Ummmm..." + guess + " is not within the range we agreed upon " + playerName + "! Come on now...");
      counter = counter + 1;
      continue;
    }

    if (guess < number) {
      System.out.println("Your guess is too low, try again!");
      counter = counter + 1;
      continue;
    } else if (guess > number ) {
      System.out.println("Your guess is too high, try again!");
      counter = counter + 1;
      continue;
    } else {
      // still a guess when they guess correctly so still increment the counter
      counter = counter + 1;
      System.out.println("Well done, " + playerName + "! You found my number in " + counter + " tries!");
      break;
    }
    }
  }
}
