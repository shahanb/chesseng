package piece;

import gui.GamePanel;

public class Queen extends Piece{

    public Queen(int color, int col, int row)
    {
        super(color, col, row);
        if(color == GamePanel.WHITE)
        {
            image = getImage("/piece/white-queen");
        }
        else
        {
            image = getImage("/piece/black-queen");
        }
    }
}

