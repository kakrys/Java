package src;

public class Rook extends Figure{
    public Rook(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1, Figure[][] fields) {
        boolean result = false;
        boolean finished = false;
        if (row == row1 || col == col1) {
            int direction = 0;
            if (Math.abs(row - row1) != 0) {
                direction = row < row1 ? 1 : -1;
                if (!checkEmptyFields(row, row1, direction, col, fields)) {
                    finished = true;
                }
            }
            if (!finished) {
                if (Math.abs(col - col1) != 0) {
                    direction = col < col1 ? 1 : -1;
                    result = checkEmptyFields(col, col1, direction, row, fields);
                } else {
                    result = true;
                }
            }
        }
        return result;
    }

    private boolean checkEmptyFields(int start, int end, int step, int index, Figure[][] fields) {
        boolean result = true;
        for (int i = start + step; Math.abs(end - i) > 0; i = i + step) {
            if (fields[index][i] != null) {
                result = false;
                break;
            }
        }
        return result;
    }
}