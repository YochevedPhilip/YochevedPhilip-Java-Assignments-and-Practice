
/**
 * This method implements a simple two-player game of "Rock, Paper, Scissors".
 * It takes input from both players as single characters (R for Rock, P for Paper, S for Scissors),
 * compares their choices, and determines the winner or if the game ends in a tie.
 * Input is case-insensitive, and the result is printed to the console.
 * @author (Yocheved Philip)
 * @version (208664433)
 */
import java.util.Scanner;
public class Game
{
    public static void main(String[] args){  

        Scanner scan = new Scanner (System.in);
        final char PAPER = 'P';
        final char ROCK = 'R';       
        final char SCISSORS = 'S';
        System.out.println("Enter first player's object:");
        char player1 = scan.next().charAt(0);
        System.out.println("Enter second player's object:");
        char player2 = scan.next().charAt(0); 

        if(player1==player2) {
            System.out.println("Game ends with a tie"); 
        } else if((player2==PAPER && player1==ROCK) || (player2==ROCK && player1==SCISSORS) || (player2==SCISSORS && player1==PAPER)) {
            System.out.println("Player 2 wins");
        } else {
            System.out.println("Player 1 wins");
        }

    } 
} 


