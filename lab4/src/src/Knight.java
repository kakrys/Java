package src;

public class Knight extends Figure{
    public Knight(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1, Figure[][] fields) {
        int rowDiff = Math.abs(row - row1);
        int colDiff = Math.abs(col - col1);
        return ((rowDiff == 1 && colDiff == 2) || (rowDiff == 2 && colDiff == 1));
    }
}