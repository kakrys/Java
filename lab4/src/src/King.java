package src;

public class King extends Figure{
    public King(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1, Figure[][] fields) {
        boolean isRowAdjacent = Math.abs(row - row1) == 1 && col == col1;
        boolean isColAdjacent = row == row1 && Math.abs(col - col1) == 1;
        boolean isDiagonalAdjacent = Math.abs(row - row1) == 1 && Math.abs(col - col1) == 1;
        return isRowAdjacent || isColAdjacent || isDiagonalAdjacent;
    }
}