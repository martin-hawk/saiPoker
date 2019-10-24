package saipoker;

import java.util.ArrayList;
import java.util.HashMap;

public class PokerHand {

    private ArrayList<Card> pokerHand;

    public PokerHand() {
        this.pokerHand = new ArrayList<>();
    }

    public void addCard(Card card) {
        this.pokerHand.add(card);
    }

    public Card getCard(int index) {
        return this.pokerHand.get(index);
    }

    @Override
    public String toString() {
        String toReturn = "";
        for (Card card : pokerHand) {
            toReturn += card.toString();
        }
        return toReturn;
    }

    public boolean isRoyalFlush() {
        ArrayList<Card> ph = this.pokerHand;
        HashMap<Suit, Integer> suit = new HashMap<>();
        HashMap<Rank, Integer> counter = new HashMap<>();
        boolean ace = false;
        boolean king = false;
        boolean queen = false;
        boolean joker = false;
        boolean ten = false;

        for (Card card : ph) {
            suit.put(card.getSuit(), 0);
            counter.put(card.getRank(), 0);
        }

        for (int i = 0; i < ph.size(); i++) {
            if (counter.containsKey(ph.get(i).getRank())) {
                suit.put(ph.get(i).getSuit(), suit.get(ph.get(i).getSuit()) + 1);
                counter.put(ph.get(i).getRank(), counter.get(ph.get(i).getRank()) + 1);
            }
        }

        if (suit.containsValue(5)) {

            if (counter.containsKey(Rank.ACE) && counter.get(Rank.ACE) == 1) {
                ace = true;
            }
            if (counter.containsKey(Rank.KING) && counter.get(Rank.KING) == 1) {
                king = true;
            }
            if (counter.containsKey(Rank.QUEEN) && counter.get(Rank.QUEEN) == 1) {
                queen = true;
            }
            if (counter.containsKey(Rank.JOKER) && counter.get(Rank.JOKER) == 1) {
                joker = true;
            }
            if (counter.containsKey(Rank.TEN) && counter.get(Rank.TEN) == 1) {
                ten = true;
            }
        }
        return (ace && king && queen && joker && ten);
    }

    public boolean isStraightFlush() {
        ArrayList<Card> ph = this.pokerHand;
        HashMap<Suit, Integer> suit = new HashMap<>();
        HashMap<Rank, Integer> counter = new HashMap<>();
        boolean five = false;
        boolean four = false;
        boolean three = false;
        boolean two = false;
        boolean ace = false;

        for (Card card : ph) {
            suit.put(card.getSuit(), 0);
            counter.put(card.getRank(), 0);
        }

        for (int i = 0; i < ph.size(); i++) {
            if (counter.containsKey(ph.get(i).getRank())) {
                suit.put(ph.get(i).getSuit(), suit.get(ph.get(i).getSuit()) + 1);
                counter.put(ph.get(i).getRank(), counter.get(ph.get(i).getRank()) + 1);
            }
        }

        if (suit.containsValue(5)) {

            if (counter.containsKey(Rank.FIVE) && counter.get(Rank.FIVE) == 1) {
                five = true;
            }
            if (counter.containsKey(Rank.FOUR) && counter.get(Rank.FOUR) == 1) {
                four = true;
            }
            if (counter.containsKey(Rank.THREE) && counter.get(Rank.THREE) == 1) {
                three = true;
            }
            if (counter.containsKey(Rank.TWO) && counter.get(Rank.TWO) == 1) {
                two = true;
            }
            if (counter.containsKey(Rank.ACE) && counter.get(Rank.ACE) == 1) {
                ace = true;
            }
        }
        return (five && four && three && two && ace);
    }

    public boolean isFourKind() {
        ArrayList<Card> ph = this.pokerHand;
        HashMap<Rank, Integer> counter = new HashMap<>();

        for (Card card : ph) {
            counter.put(card.getRank(), 0);
        }

        for (int i = 0; i < ph.size(); i++) {
            if (counter.containsKey(ph.get(i).getRank())) {
                counter.put(ph.get(i).getRank(), counter.get(ph.get(i).getRank()) + 1);
            }
        }

        for (Rank key : counter.keySet()) {
            if (counter.get(key) == 4) {
                return true;
            }
        }
        return false;
    }

    public boolean isFullHouse() {
        ArrayList<Card> ph = this.pokerHand;
        HashMap<Rank, Integer> counter = new HashMap<>();
        boolean three = false;
        boolean two = false;

        for (Card card : ph) {
            counter.put(card.getRank(), 0);
        }

        for (int i = 0; i < ph.size(); i++) {
            if (counter.containsKey(ph.get(i).getRank())) {
                counter.put(ph.get(i).getRank(), counter.get(ph.get(i).getRank()) + 1);
            }
        }

        for (Rank key : counter.keySet()) {
            if (counter.get(key) == 3) {
                three = true;
            }
        }

        for (Rank key : counter.keySet()) {
            if (counter.get(key) == 2) {
                two = true;
            }
        }
        return (three && two);
    }

    public boolean isFlush() {
        ArrayList<Card> ph = this.pokerHand;
        HashMap<Suit, Integer> counter = new HashMap<>();

        for (Card card : ph) {
            counter.put(card.getSuit(), 0);
        }

        for (int i = 0; i < ph.size(); i++) {
            if (counter.containsKey(ph.get(i).getSuit())) {
                counter.put(ph.get(i).getSuit(), counter.get(ph.get(i).getSuit()) + 1);
            }
        }

        for (Suit key : counter.keySet()) {
            if (counter.get(key) == 5) {
                return true;
            }
        }
        return false;
    }

    public boolean isStraight() {
        ArrayList<Card> ph = this.pokerHand;
        HashMap<Rank, Integer> counter = new HashMap<>();
        boolean five = false;
        boolean four = false;
        boolean three = false;
        boolean two = false;
        boolean ace = false;

        for (Card card : ph) {
            counter.put(card.getRank(), 0);
        }

        for (int i = 0; i < ph.size(); i++) {
            if (counter.containsKey(ph.get(i).getRank())) {
                counter.put(ph.get(i).getRank(), counter.get(ph.get(i).getRank()) + 1);
            }
        }

        if (counter.containsKey(Rank.FIVE) && counter.get(Rank.FIVE) == 1) {
            five = true;
        }
        if (counter.containsKey(Rank.FOUR) && counter.get(Rank.FOUR) == 1) {
            four = true;
        }
        if (counter.containsKey(Rank.THREE) && counter.get(Rank.THREE) == 1) {
            three = true;
        }
        if (counter.containsKey(Rank.TWO) && counter.get(Rank.TWO) == 1) {
            two = true;
        }
        if (counter.containsKey(Rank.ACE) && counter.get(Rank.ACE) == 1) {
            ace = true;
        }

        return (five && four && three && two && ace);
    }

    public boolean isThreeKind() {
        ArrayList<Card> ph = this.pokerHand;
        HashMap<Rank, Integer> counter = new HashMap<>();

        for (Card card : ph) {
            counter.put(card.getRank(), 0);
        }

        for (int i = 0; i < ph.size(); i++) {
            if (counter.containsKey(ph.get(i).getRank())) {
                counter.put(ph.get(i).getRank(), counter.get(ph.get(i).getRank()) + 1);
            }
        }

        for (Rank key : counter.keySet()) {
            if (counter.get(key) == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean isTwoPair() {
        ArrayList<Card> ph = this.pokerHand;
        HashMap<Rank, Integer> counter = new HashMap<>();
        int pairs = 0;

        for (Card card : ph) {
            counter.put(card.getRank(), 0);
        }

        for (int i = 0; i < ph.size(); i++) {
            if (counter.containsKey(ph.get(i).getRank())) {
                counter.put(ph.get(i).getRank(), counter.get(ph.get(i).getRank()) + 1);
            }
        }

        for (Rank key : counter.keySet()) {
            if (counter.get(key) == 2) {
                pairs += 1;
            }
        }
        return (pairs == 2);
    }

    public boolean isPair() {
        ArrayList<Card> ph = this.pokerHand;
        HashMap<Rank, Integer> counter = new HashMap<>();

        for (Card card : ph) {
            counter.put(card.getRank(), 0);
        }

        for (int i = 0; i < ph.size(); i++) {
            if (counter.containsKey(ph.get(i).getRank())) {
                counter.put(ph.get(i).getRank(), counter.get(ph.get(i).getRank()) + 1);
            }
        }

        for (Rank key : counter.keySet()) {
            if (counter.get(key) == 2) {
                return true;
            }
        }
        return false;
    }

    public boolean isHighCard() {
        ArrayList<Card> ph = this.pokerHand;

        for (Card card : ph) {
            if (card.getRank().equals(Rank.ACE)) {
                return true;
            }
        }
        return false;
    }
}
