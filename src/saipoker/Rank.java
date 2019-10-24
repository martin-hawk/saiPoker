package saipoker;

public enum Rank {

    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JOKER(11),
    QUEEN(12),
    KING(13),
    ACE(14);

    private final int rankValue;

    Rank(int value) {
        this.rankValue = value;
    }

    public int getRankValue() {
        return this.rankValue;
    }

    public String getRank() {
        String rankToReturn = "";

        switch (rankValue) {

            case 2:
                rankToReturn = "2";
                break;
            case 3:
                rankToReturn = "3";
                break;
            case 4:
                rankToReturn = "4";
                break;
            case 5:
                rankToReturn = "5";
                break;
            case 6:
                rankToReturn = "6";
                break;
            case 7:
                rankToReturn = "7";
                break;
            case 8:
                rankToReturn = "8";
                break;
            case 9:
                rankToReturn = "9";
                break;
            case 10:
                rankToReturn = "10";
                break;
            case 11:
                rankToReturn = "J";
                break;
            case 12:
                rankToReturn = "Q";
                break;
            case 13:
                rankToReturn = "K";
                break;
            case 14:
                rankToReturn = "A";
                break;
        }

        return rankToReturn;
    }
}
