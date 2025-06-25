/**
 * Driver program that creates standard 52-card deck (as Card array)
 * and prints out each card in deck.
 * 
 * @author Ramysannta
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {
        /*** RUNNING TESTER ***/
        /*** CardTester.main(null);***/

        /*** DRIVER PROGRAM ***/
        System.out.println("\n==============================================");
        System.out.println("GENERATING FULL 52-CARD DECK:\n");

        // 1. Generate 52 card deck into Card array
        Card[] deck = new Card[52];
        int index = 0;
        char[] suits = { Card.HEART, Card.DIAMOND, Card.CLUB, Card.SPADE };

        for (char suit : suits) {
            for (int val = 1; val <= 13; val++) {
                deck[index++] = new Card(val, suit);
            }
        }

        // 2. Print deck (13 cards per line)
        for (int i = 0; i < deck.length; i++) {
            System.out.print(deck[i] + " ");
            if ((i + 1) % 13 == 0) System.out.println();
        }
    }
}
