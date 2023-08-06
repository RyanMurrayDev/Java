
package inf221_ch8_memory_test;


public class Card
{
    private int cardNumber;

    public Card(int cardNumber)
    {
        this.cardNumber = cardNumber;
    }
    
    public Card()
    {
        this(0);
    }

    public int getCardNumber()
    {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber)
    {
        this.cardNumber = cardNumber;
    }
    
    public Suit getSuit()
    {
        Suit [] suits = Suit.values();
        int n = cardNumber/13;
        return suits[n];
    }
    public CardColor getColor()
    {
        CardColor[] colors = CardColor.values();
        int n = cardNumber/26;
        return colors[n];
    }
    public CardFace getFaceValue()
    {
        int n = cardNumber % 13;
        CardFace[] faces = CardFace.values();
        return faces[n];
    }
    public int getValue()
    {
        int n = cardNumber % 13;
        if( n < 11)
        {
            return n + 1;
        }
        else
        {
            return 10;
        }
    }

    @Override
    public String toString()
    {
        return "Card{" + "cardNumber=" + cardNumber + "\nSuit: " +
                    getSuit() + "\nColor: " + getColor() + "\nFace Value: " +
                     getFaceValue() + "\nValue: " + getValue() + 
                     "Description: " + getFaceValue() + " of " + getSuit() + "}";
    }
    
 
    
}
