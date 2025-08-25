package piece;

import gui.GamePanel;

public class Rook extends Piece{

    public Rook(int color, int col, int row)
    {
        super(color, col, row);
        if(color == GamePanel.WHITE)
        {
            image = getImage("/piece/white-rook");
        }
        else
        {
            image = getImage("/piece/black-rook");
        }
    }
}

