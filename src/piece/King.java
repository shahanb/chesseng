package piece;

import gui.GamePanel;

public class King extends Piece{

    public King(int color, int col, int row)
    {
        super(color, col, row);
        if(color == GamePanel.WHITE)
        {
            image = getImage("/piece/white-king");
        }
        else
        {
            image = getImage("/piece/black-king");
        }
    }
}

