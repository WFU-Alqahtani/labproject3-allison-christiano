import java.util.Arrays;
import java.util.Comparator;

public class Card {
    // ranks are ordered Ace-low and Queen-high
    private final String ranks[] ={"Ace","2","3","4","5","6","7","8","9","10","Jack","King","Queen"};

    // suits are ordered alphabetically
    private final String suits[] = {"Clubs","Diamonds","Hearts","Spades"};
    private int rank;
    private int suit;

    //default constructor
    public Card()
    {
        for (int i = 0; i < ranks.length; i++)
        {
            this.ranks[i] = "NULL";
        }
        for (int i = 0; i < suits.length; i++)
        {
            this.suits[i] = "NULL";
        }
        this.rank = -1;
        this.suit = -1;
    }
    //alternate constructor
    public Card(String ranks[], String suits[], int rank, int suit)
    {
        for (int i = 0; i < ranks.length; i++)
        {
            this.ranks[i] = ranks[i];
        }
        for (int i = 0; i < suits.length; i++)
        {
            this.suits[i] = suits[i];
        }
        this.rank = rank;
        this.suit = suit;
    }

    public String[] getRanks()
    {
        return this.ranks;
    }
    public String[] getSuits()
    {
        return this.suits;
    }

    @Override
    public String toString()
    {
        return String.format("%s of %s", this.ranks[this.rank], this.suits[this.suit]);
    }
}
//public class CardComparator implements Comparator<Card>
//{
//    @Override
//    public int compare(Card compValue, Card userValue)
//    {
//        return Integer.compare();
//    }
//}
