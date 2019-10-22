/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saipoker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marty
 */
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
                    returnWinner(game);
                    break;
            }
            game.clear();
        }
    }

    static Card generateCard() {
        Random random = new Random();
        int rank = random.nextInt(12);
        int suit = random.nextInt(3);
        Card cardToReturn = new Card(Rank.values()[rank], Suit.values()[suit]);
        return cardToReturn;
    }

    static void returnWinner(ArrayList<PokerHand> thisGame) {
        //thisGame.add(null);
        System.out.println("Player " + 2 + " wins with " + "Thee of kiunbf" + " because");
        System.out.println("Player " + 2 + "only has " + "something");
        System.out.println("");
    }
}
