/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saipoker;

/**
 *
 * @author marty
 */
public enum Suit {

    SPADE("♠"),
    CLUB("♣"),
    HEART("♥"),
    DIAMOND("♦");

    private final String suitSymbol;

    Suit(String symbol) {
        this.suitSymbol = symbol;
    }

    public String getSuitSymbol() {
        return this.suitSymbol;
    }
}
