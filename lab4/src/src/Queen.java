package src;

import static src.Bishop.coord;

public class Queen extends Figure{
    public Queen(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1, Figure[][] fields) {
        boolean result = false;
        if (row == row1 && col != col1 || row != row1 && col == col1 || Math.abs(row - row1) == Math.abs(col - col1)) {
            int rowDir = Integer.compare(row1, row);
            int colDir = Integer.compare(col1, col);
            result = coord(row, col, col1, col1, fields, rowDir, colDir);
        }
        return result;
    }
}