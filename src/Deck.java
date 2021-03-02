import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards = new ArrayList < Card >();
    private int arraySize;
    private int cardsLeft;
    public Deck()
    {
        this.arraySize = -1;
        this.cardsLeft = -1;
    }
    public Deck(ArrayList<Card> cards, int arraySize, int cardsLeft)
    {
        for (int i = 0; i < 13; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                Card card = new Card();
                this.cards.add(card);
            }
        }
        this.arraySize = 52;
        this.cardsLeft = 52;
    }

    public void shuffleDeck(ArrayList<Card> cards)
    {
        int swap1;
        int swap2;
        Random randGen = new Random();
        for (int i = 0; i < this.cardsLeft * this.cardsLeft; i++)
        {
            swap1 = randGen.nextInt(cardsLeft);
            swap2 = randGen.nextInt(cardsLeft);
            Collections.swap(cards, swap1, swap2);
        }
    }
    public String removeCard(ArrayList<Card> cards, Card c)
    {
        for (int i = 0; i < cards.size(); i++)
        {
            if (cards.get(i).equals(c))
            {
                cards.remove(i);
                cardsLeft--;
            }
        }
        return c.toString();
    }
}
