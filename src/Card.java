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
    //alternate constructor
    public Card(int rank, int suit)
    {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank()
    {
        return this.rank;
    }
    public int getSuit()
    {
        return this.suit;
    }

    //toString method
    @Override
    public String toString()
    {
        return String.format("%s of %s", this.ranks[this.rank], this.suits[this.suit]);
    }
}
//card comparator
class CardComparator implements Comparator<Card>
{
    @Override
    //receives 2 parameters that are cards and compares them based on rank and suit
    public int compare(Card compCard, Card userCard)
    {
        int RankCompare = Integer.compare(compCard.getRank(), userCard.getRank());
        int SuitCompare = Integer.compare(compCard.getSuit(), userCard.getSuit());
        //if rank is the same, compare suits and return the SuitCompare value
        if(RankCompare == 0)
        {
            return ((RankCompare == 0) ? SuitCompare : RankCompare);
        }
        //if rank is different return the RankCompare value
        else
        {
            return RankCompare;
        }
    }
}
