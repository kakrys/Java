package src;

public class Bishop extends Figure{
    public Bishop(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1, Figure[][] fields) {
        if (Math.abs(row - row1) == Math.abs(col-col1)){
            int row_dir = row < row1 ? 1 : -1;
            int col_dir = col < col1 ? 1 : -1;
            return coord(row, col, row1, col1, fields, row_dir, col_dir);
        }
        return false;
    }

    public static boolean coord(int row, int col, int row1, int col1, Figure[][] fields, int row_dir, int col_dir) {
        int i = row + row_dir;
        int j = col + col_dir;

        while (Math.abs(row1 - i) > 0 || Math.abs(col1 - j) > 0) {
            if (fields[i][j] != null) return false;
            i += row_dir;
            j += col_dir;
        }
        return true;
    }
}