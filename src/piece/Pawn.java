package piece;

import gui.GamePanel;

public class Pawn extends Piece{

    public Pawn(int color, int col, int row)
    {
        super(color, col, row);
        if(color == GamePanel.WHITE)
        {
            image = getImage("/piece/white-pawn");
        }
        else
        {
            image = getImage("/piece/black-pawn");
        }
    }
}

