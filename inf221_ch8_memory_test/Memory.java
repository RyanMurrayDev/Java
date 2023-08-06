
package inf221_ch8_memory_test;


public class Memory
{
    private Deck deck;
    private Card[][] board;
    private Card first, second;
    private int firstRow, firstColumn, secondRow, secondColumn;
    private int pairs;
    
    public Memory()
    {
        pairs=0;
        first=null;
        second=null;
        deck = new Deck();
        //deck.shuffle();
        board = new Card[4][13];
        for(int row = 0; row  < board.length; row++)
        {
            for(int col=0; col  <  board[row].length; col++)
            {
                board[row][col] = deck.deal();
            }
        }
    }
    
    public Card get(int row, int column)
    {
        return board[row][column];
    }
    
    public boolean isMatch()
    {
        if(first==null || second == null)
        {
            return false;
        }
        if(first.getFaceValue() == second.getFaceValue())
        {
            board[firstRow][firstColumn]=null;
            board[secondRow][secondColumn]=null;
            pairs++;
            first=null;
            second=null;
            return true;
        }
        first=null;
        second=null;
        return false;
    }
   
    public boolean isGameOver()
    {
        return pairs==26;
    }
    
    public boolean pickCard(int row, int col)
    {
        if(row>=board.length || col>=board[row].length)
        {
         return false;           
        }
        else if(board[row][col]==null)
        {
            return false;
        }
        if(first==null)
        {
            first= board[row][col];
            firstRow=row;
            firstColumn=col;
            return true;
        }
        else if(second == null)
        {
            second = board[row][col];
            secondRow=row;
            secondColumn=col;
            return true;
        }
        return false;
    }

    public Card getFirst()
    {
        return first;
    }

    public Card getSecond()
    {
        return second;
    }

    public int getFirstRow()
    {
        return firstRow;
    }

    public int getFirstColumn()
    {
        return firstColumn;
    }

    public int getSecondRow()
    {
        return secondRow;
    }

    public int getSecondColumn()
    {
        return secondColumn;
    }
    
    
    
    @Override
    public String toString()
    {
        String s = "";
         for(int row = 0; row  < board.length; row++)
        {
            for(int col=0; col  <  board[row].length; col++)
            {
                Card c = board[row][col];
                s += c.getFaceValue() + " of " + c.getSuit() + ", ";
            }
            s += "\n";
        }
         return s;
    }
}
