package saipoker;

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
