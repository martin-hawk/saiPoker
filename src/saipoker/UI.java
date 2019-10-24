package saipoker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UI {

    private Scanner reader;
    private ArrayList<PokerHand> game;

    public UI() {
        this.reader = new Scanner(System.in);
        this.game = new ArrayList<>();
    }

    public void run() {
        boolean exit = false;
        while (!exit) {

            System.out.println("P - Play");
            System.out.println("X - Exit");
            System.out.println("[Enter letter and press Enter]");
            System.out.print(">> ");
            String choise = reader.nextLine().toUpperCase();

            switch (choise) {
                case "X":
                    exit = true;
                    break;
                case "P":
                    for (int i = 0; i < 2; i++) {
                        PokerHand ph = new PokerHand();
                        game.add(ph);
                        for (int j = 0; j < 5; j++) {
                            ph.addCard(generateCard());
                        }
                    }

                    System.out.println("Player 1 hand:");
                    System.out.println(game.get(0));
                    System.out.println("Player 2 hand:");
                    System.out.println(game.get(1));

                    System.out.println("");
                    determineWinner(game);
                    break;
            }
            game.clear();
        }
    }

    public void determineWinner(ArrayList<PokerHand> thisGame) {
        int winner = 0;
        int loser = 0;
        int[] scores = new int[2];
        String[] combinations = new String[2];

        for (int i = 0; i < thisGame.size(); i++) {
            if (thisGame.get(i).isRoyalFlush()) {
                scores[i] = 10;
                combinations[i] = "Royal Flush";
            } else if (thisGame.get(i).isStraightFlush()) {
                scores[i] = 9;
                combinations[i] = "Straight Flush";
            } else if (thisGame.get(i).isFourKind()) {
                scores[i] = 8;
                combinations[i] = "Four of a Kind";
            } else if (thisGame.get(i).isFullHouse()) {
                scores[i] = 7;
                combinations[i] = "Full House";
            } else if (thisGame.get(i).isFlush()) {
                scores[i] = 6;
                combinations[i] = "Flush";
            } else if (thisGame.get(i).isStraight()) {
                scores[i] = 5;
                combinations[i] = "Straight";
            } else if (thisGame.get(i).isThreeKind()) {
                scores[i] = 4;
                combinations[i] = "Three of a Kind";
            } else if (thisGame.get(i).isTwoPair()) {
                scores[i] = 3;
                combinations[i] = "Two Pair";
            } else if (thisGame.get(i).isPair()) {
                scores[i] = 2;
                combinations[i] = "Pair";
            } else if (thisGame.get(i).isHighCard()) {
                scores[i] = 1;
                combinations[i] = "High Card";
            } else {
                scores[i] = 0;
                combinations[i] = "no combination";
            }
        }

        winner = (scores[0] > scores[1]) ? 0 : 1;
        loser = (scores[0] < scores[1]) ? 0 : 1;

        System.out.println("Player " + (winner + 1) + " wins with " + combinations[winner] + " because");
        System.out.println("Player " + (loser + 1) + " only has " + combinations[loser] + ".");
        System.out.println("");
    }

    static Card generateCard() {
        Random random = new Random();
        int rank = random.nextInt(12);
        int suit = random.nextInt(3);
        Card cardToReturn = new Card(Rank.values()[rank], Suit.values()[suit]);
        return cardToReturn;
    }
}
