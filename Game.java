import java.util.Scanner;
import java.util.Random;


public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    // greet player
    System.out.println("Hi there! What is your name?");
    // get player name
    String playerName = input.nextLine();
    System.out.println(playerName + ", I'm thinking of a number between 1 and 100. Try to guess the number!");
    // choose random number between 1 and 100
    // Create instance of the Random Class
    Random rand = new Random();
    // call method nextInt and pass in the upper range bound
    int number = rand.nextInt(100);
    // print the random number to see what the number is for testing purposes
    System.out.println(number);

    
    while(true) {
    // ask for users guess
    System.out.println("Your guess?");
    // get user guess input
    int guess = input.nextInt();
    // counter for number of guesses
    int counter = 0;

    if (guess < number) {
      System.out.println("Your guess is too low, try again!");
      counter += 1;
      continue;
    } else if (guess > number ) {
      System.out.println("Your guess is too high, try again!");
      counter += 1;
      continue;
    } else {
      System.out.println("Well done, " + playerName + "! You found my number in " + counter + " tries!");
      break;
    }

    }


  }

}
