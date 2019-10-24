package saipoker;

import java.util.ArrayList;

public class SaiPoker {

    public static void main(String[] args) {
        UI ui = new UI();
        ui.run();

        // Manual simulation (comment ui.run)
//        PokerHand player1 = new PokerHand();
//        player1.addCard(new Card(Rank.SEVEN, Suit.SPADE));
//        player1.addCard(new Card(Rank.ACE, Suit.SPADE));
//        player1.addCard(new Card(Rank.SIX, Suit.HEART));
//        player1.addCard(new Card(Rank.ACE, Suit.DIAMOND));
//        player1.addCard(new Card(Rank.KING, Suit.CLUB));
//
//        PokerHand player2 = new PokerHand();
//        player2.addCard(new Card(Rank.FIVE, Suit.SPADE));
//        player2.addCard(new Card(Rank.FIVE, Suit.HEART));
//        player2.addCard(new Card(Rank.JOKER, Suit.CLUB));
//        player2.addCard(new Card(Rank.FIVE, Suit.DIAMOND));
//        player2.addCard(new Card(Rank.TWO, Suit.DIAMOND));
//
//        System.out.println("Player 1 hand:");
//        System.out.println(player1);
//        System.out.println("Player 2 hand:");
//        System.out.println(player2);
//        System.out.println("");
//        ArrayList<PokerHand> game = new ArrayList<>();
//        game.add(player1);
//        game.add(player2);
//        ui.determineWinner(game);
    }
}
