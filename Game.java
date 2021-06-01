/*

A number-guessing game.

*/
import java.util.Scanner;


public class Game {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    // greet player
    System.out.println("Hi there! What is your name?");
    // get player name
    String playerName = input.nextLine();
    System.out.println(playerName + ", I'm thinking of a number between 1 and 100. Try to guess the number!");
    // choose random number between 1 and 100
  }

}
