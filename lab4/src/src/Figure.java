package src;

public abstract class Figure {
    public char getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(char color) {
        this.color = color;
    }

    private String name;

    public String getName() {
        return name;
    }

    private char color;

    public Figure(String name, char color) {
        this.name = name;
        this.color = color;
    }

    public boolean canMove(int row, int col, int row1, int col1, Figure[][] fields){
        boolean isValidRow = (row >=0 && row < 8 )&&(row1 >=0 && row1 < 8 );
        boolean isValidCol = (col >=0 && col < 8)&&(col1 >=0 && col1 < 8);
        boolean isDifferentRow = row!=row1;
        boolean isDifferentCol = col!=col1;

        return isValidRow && isValidCol && isDifferentRow && isDifferentCol;
    }

    public boolean canAttack(int row, int col, int row1, int col1, Figure nextField){
        return nextField.getColor() != this.getColor();
    }
}