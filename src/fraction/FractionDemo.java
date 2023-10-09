package fraction;
/* David Cerkovnik, Comp 142
 * August 30, 2023
 * Project 1: Nim
 * I pledge I have neither given nor received unauthorized help on this assignment.
 */


import java.util.Scanner;

public class FractionDemo {
    public static void main(String[] args) {


        int pileA = 5;
        int pileB = 4;
        int pileC = 3;
        int player = 1;
        int gameOver = 0;
        int remove;

        while (gameOver == 0) {		// Checks to see if the game is over

            String pile;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Player "+player+", choose a pile: ");		// Prompts the player to pick a pile
            pile = scanner.nextLine();

            // if else statements verify pile, prompt for number of sticks, and calculate leftovers

            if (pile.equals("a") || pile.equals("A")) {
                if (pileA > 0) {
                    System.out.println("How many sticks would you like to remove? ");
                    remove = scanner.nextInt();
                    while (remove < 1 || remove > pileA) {
                        System.out.println("Improper number, try again: ");
                        remove = scanner.nextInt();
                    }
                    pileA = pileA - remove;
                    System.out.println("Pile A: "+pileA+", Pile B: "+pileB+", Pile C: "+pileC);
                    if ((pileA == 0) && (pileB == 0) && (pileC == 0)){
                        gameOver = 1;
                    }
                }
            } else if (pile.equals("b") || pile.equals("B")) {
                if (pileB > 0) {
                    System.out.println("How many sticks would you like to remove? ");
                    remove = scanner.nextInt();
                    while (remove < 1 || remove > pileB) {
                        System.out.println("Improper number, try again: ");
                        remove = scanner.nextInt();
                    }
                    pileB = pileB - remove;
                    System.out.println("Pile A: "+pileA+", Pile B: "+pileB+", Pile C: "+pileC);
                    if (pileA == 0 && pileB == 0 && pileC == 0){
                        gameOver = 1;
                    }
                }
            } else if (pile.equals("c") || pile.equals("C")) {
                if (pileC > 0) {
                    System.out.println("How many sticks would you like to remove? ");
                    remove = scanner.nextInt();
                    while (remove < 1 || remove > pileC) {
                        System.out.println("Improper number, try again: ");
                        remove = scanner.nextInt();
                    }
                    pileC = pileC - remove;
                    System.out.println("Pile A: "+pileA+", Pile B: "+pileB+", Pile C: "+pileC);
                    if (pileA == 0 && pileB == 0 && pileC == 0){
                        gameOver = 1;
                    }
                }
            } else {
                System.out.println("Improper pile. Try again");		// Lets same player try again
                if (player == 1) {
                    player = 2;
                } else {
                    player = 1;
                }
            }
            if (player == 1) {  	// Switches players
                player = 2;
            } else {
                player = 1;
            }
        }
        System.out.println("Game over! Player "+player+" wins!");
    }
}





