
package tictactoe;

public class TicTacToeGame
{
    private Turn turn;
    private GameState gameState;
    private Marker[][] board;

    public TicTacToeGame()
    {
        this.turn = Turn.X;
        this.gameState = GameState.ONGOING;
        board = new Marker[3][3];
        for(int row = 0; row < board.length; row++)
        {
            for(int col=0; col < board[row].length; col++)
            {
                board[row][col] = Marker.EMPTY;
            }
        }
    }

    public Turn getTurn()
    {
        return turn;
    }

    public GameState getGameState()
    {
        return gameState;
    }
    
    public boolean isCellFree(int row, int col)
    {
        return board[row][col] == Marker.EMPTY;
    }
    public GameState placeMarker( int row, int col)
    {
        if( row < 0 || row >= board.length)
        {
            return GameState.ONGOING;
        }
        else if( col < 0 || col >= board[row].length)
        {
             return GameState.ONGOING;
        }
        else if ( ! isCellFree(row,col))
        {
             return GameState.ONGOING;
        }
        else
        {
            if( turn == Turn.X)
            {
                board[row][col] = Marker.X;
                gameState = checkForWinner();
                if( gameState == GameState.WINNER_O ||
                        gameState == GameState.WINNER_X ||
                                gameState == GameState.TIE)
                {
                    return gameState;
                }
                this.turn = Turn.O;
            }
            else if( turn == Turn.O)
            {
                board[row][col] = Marker.O;
                 gameState = checkForWinner();
                if( gameState == GameState.WINNER_O ||
                        gameState == GameState.WINNER_X ||
                                gameState == GameState.TIE)
                {
                    return gameState;
                }
                this.turn = Turn.X;
               
            }
        }
        return gameState;
    }
    
    public GameState checkForWinner()
    {
        Marker m;
        if( turn == Turn.X)
        {
            m = Marker.X;
        }
        else
        {
            m = Marker.O;
        }
        //check each row for winner
        for(int row = 0; row <  board.length; row++)
        {
            if( board[row][0] == m  &&  board[row][1] ==m && board[row][2] == m)
            {
                if( turn == Turn.X)
                {
                    gameState = GameState.WINNER_X;
                    return gameState;
                }
                else if( turn == Turn.O)
                {
                    gameState = GameState.WINNER_O;
                    return gameState;
                }
            }
        }
        //Check for vertical wins
        for(int col=0; col < board[0].length; col++)
        {
            if( board[0][col] == m && board[1][col] == m && board[2][col]==m )
            {
                 if( turn == Turn.X)
                {
                    gameState = GameState.WINNER_X;
                    return gameState;
                }
                else if( turn == Turn.O)
                {
                    gameState = GameState.WINNER_O;
                    return gameState;
                }
            }
        }
        //diagonal top left
        if( board[0][0] == m &&  board[1][1] == m &&  board[2][2] == m )
        {
            if( turn == Turn.X)
                {
                    gameState = GameState.WINNER_X;
                    return gameState;
                }
                else if( turn == Turn.O)
                {
                    gameState = GameState.WINNER_O;
                    return gameState;
                }
        }
        
        //right diagonal
         if( board[0][2] == m &&  board[1][1] == m &&  board[2][0] == m )
        {
            if( turn == Turn.X)
                {
                    gameState = GameState.WINNER_X;
                    return gameState;
                }
                else if( turn == Turn.O)
                {
                    gameState = GameState.WINNER_O;
                    return gameState;
                }
        }
         for(int row = 0; row < board.length; row++)
         {
             for(int col=0; col < board[row].length;col ++)
             {
                 if( board[row][col] == Marker.EMPTY)
                 {
                     return gameState;
                 }
             }
         }
         gameState = GameState.TIE;
         return gameState ;
    }

    @Override
    public String toString()
    {
        String s = "turn: " + turn + "\ngamestate: " + gameState +"\n";
        for(int row = 0; row < board.length; row++)
        {
            for(int col=0; col < board[row].length; col++)
            {
                if( board[row][col] == Marker.EMPTY)
                {
                    s += "_ ";
                }
                else if(board[row][col] == Marker.X)
                {
                    s += "X ";
                }
                else
                {
                    s += "O ";
                }
            }
            s += "\n";
        }
           return s;     
    }
    
    
    
    
}
