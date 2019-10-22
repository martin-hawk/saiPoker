/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saipoker;

import java.util.ArrayList;

/**
 *
 * @author marty
 */
public class PokerHand {

    private ArrayList<Card> pokerHand;

    public PokerHand() {
        this.pokerHand = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.pokerHand.add(card);
    }

    @Override
    public String toString() {
        String toReturn = "";
        for (Card card : pokerHand) {
            toReturn += card.toString();
        }
        return toReturn;
    }
}
