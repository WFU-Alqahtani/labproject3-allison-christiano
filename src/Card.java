import java.util.Arrays;

public class Card {
    // ranks are ordered Ace-low and Queen-high
    private final String ranks[] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};

// suits are ordered alphabetically
    private final String suits[] = {"Clubs","Diamonds","Hearts","Spades"};

    @Override
    public String toString() {
        return String.format("%s of %s", ranks[0], suits[0]);//NEED TO FIX SO DOESNT RETURN ranks[0] and suits[0] ALL THE TIME
    }
}
