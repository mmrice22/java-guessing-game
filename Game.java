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
    // print the random number to see if it is working
    System.out.println(number);

    // ask for users guess
    System.out.println("Your guess?");
    // get user guess
    int guess = input.nextInt();
    // if guess is less then random number:
    if (guess < number) {
      System.out.println("Your guess is too low, try again!");
    } else if (guess > number ) {
      System.out.println("Your guess is too hight, try again!");
    }

    


  }

}
