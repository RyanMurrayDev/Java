
package inf221_ch8_memory_test;

import javax.swing.Icon;
import javax.swing.JLabel;


public class CardLabel extends JLabel
{
    private int row,col;

    public CardLabel(int row, int col, Icon icon)
    {
        super(icon);
        this.row = row;
        this.col = col;
    }

    public CardLabel(int row, int col)
    {
        this.row = row;
        this.col = col;
    }

    public int getRow()
    {
        return row;
    }

    public void setRow(int row)
    {
        this.row = row;
    }

    public int getCol()
    {
        return col;
    }

    public void setCol(int col)
    {
        this.col = col;
    }

    
    
    
}
