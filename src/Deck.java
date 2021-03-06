import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    private ArrayList<Card> cards = new ArrayList < Card >();
    private int arraySize;
    private int cardsLeft;
    //default constructor
    public Deck()
    {
        //adds cards to deck
        for (int i = 0; i < 13; i++)
        {
            for (int j = 0; j < 4; j++)
            {
                //uses alternate constructor in Card class
                Card card = new Card(i, j);
                this.cards.add(card);
            }
        }
        this.arraySize = 52;
        this.cardsLeft = 52;
    }
    //shuffles deck
    public void shuffle()
    {
        int swap1;
        int swap2;
        Random randGen = new Random();
        for (int i = 0; i < this.cardsLeft * this.cardsLeft; i++)
        {
            //randomly generate two numbers
            swap1 = randGen.nextInt(cardsLeft);
            swap2 = randGen.nextInt(cardsLeft);
            //swap cards at indices pf two number
            Collections.swap(this.cards, swap1, swap2);
        }
    }
    //removes card from deck
    public Card remove()
    {
        Card c = cards.get(this.cardsLeft - 1);
        cardsLeft--;
        return c;
    }
}
