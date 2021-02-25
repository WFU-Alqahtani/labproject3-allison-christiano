import java.util.ArrayList;

public class Deck {

    private ArrayList<Card> cards=new ArrayList < Card >();
    private int arraySize;
    private int cardsLeft;
    public Deck()
    {
        this.arraySize = -1;
        this.cardsLeft = -1;
    }
    public Deck(ArrayList<Card> cards, int arraySize, int cardsLeft)
    {
        for (int i = 0; i < cards.size(); i++)
        {
            Card card = new Card();
            this.cards.add(card);
        }
        this.arraySize = 52;
        this.cardsLeft = 52;
    }
}
