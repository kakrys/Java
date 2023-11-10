package src;

public class Pawn extends Figure {

    private boolean isFirstStep = true;

    public Pawn(String name, char color) {
        super(name, color);
    }

    @Override
    public boolean canMove(int row, int col, int row1, int col1, Figure[][] fields) {
        if (Math.abs(row - row1) == 2 || Math.abs(row - row1) == 1) {
            if (col == col1) {
                if (this.isFirstStep) {
                    this.isFirstStep = false;
                }
                return true;
            }
        } else if (Math.abs(row - row1) == 1) {
            return col == col1;
        }
        return false;
    }

    @Override
    public boolean canAttack(int row, int col, int row1, int col1, Figure nextField) {
        if (Math.abs(row - row1) == 1 && Math.abs(col - col1) == 1) {
            return nextField.getColor() != this.getColor();
        }
        return false;
    }
}