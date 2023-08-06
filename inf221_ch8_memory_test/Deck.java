
package inf221_ch8_memory_test;

import java.security.SecureRandom;
import java.util.ArrayList;


public class Deck
{
    private ArrayList<Card> deck;
    private SecureRandom random;
    
    public Deck()
    {
        random = new SecureRandom();
        deck = new ArrayList<>();
        for(int i=0; i < 52; i++)
        {
            deck.add( new Card(i));
        }
    }
    
    public void shuffle()
    {
        Card temp;
        for(int i=0; i < deck.size(); i++)
        {
            int r = Math.abs(random.nextInt() )% deck.size();
            swap(i, r) ;
        }
    }
    private void swap(int index1, int index2)
    {
        Card temp = deck.get(index1);
        deck.set(index1, deck.get(index2));
        deck.set(index2, temp);
    }
    public boolean isEmpty()
    {
        return this.deck.isEmpty();
    }
    public Card deal()
    {
        if(!isEmpty())
        {
            Card c = deck.remove(0);
            return c;
        }
        return null;
    }
    
    public int size()
    {
        return deck.size();
    }

    @Override
    public String toString()
    {
        return "Deck{" + "deck=" + deck + '}';
    }
    
}
