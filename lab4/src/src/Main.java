package src;

import java.util.Scanner;

public class Main {
    static Board board = new Board();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        board.setColorGaming('w');
        board.init();
        start_game();
    }

    public static void start_game() throws Error {
        if (board.getTakeBlack().size() == 15 && board.getTakeWhite().size() == 15) {
            System.out.println("Ничья!");
            end_game();
        }

        print_game(board);

        String inputLine = in.nextLine();
        if (inputLine.equals("exit")){
            end_game();
        }

        String[] coords = inputLine.split(" ");
        int y1 = Integer.parseInt(coords[0]);
        int x1 = Integer.parseInt(coords[1]);
        int y2 = Integer.parseInt(coords[2]);
        int x2 = Integer.parseInt(coords[3]);

        try {
            board.move_figure(y1, x1, y2, x2);
            if (board.getColorGaming() != 'w') {
                if (board.getColorGaming() == 'b') {
                    board.setColorGaming('w');
                }
            } else {
                board.setColorGaming('b');
            }
        } finally {
            start_game();
        }
    }

    public static void print_game(Board board) {
        board.print_board();
        System.out.println();
        System.out.println("Команды: ");
        System.out.println("exit: Выход из игры");
        System.out.println("y1 x1 y2 x2: Ход фигуры из клетки x1, y1 в клекту x2, y2");


        System.out.println("Взятые Белые:"+board.getTakeWhite().toString());
        System.out.println("Взятые Черные:"+board.getTakeBlack().toString());

        if (board.getColorGaming() == 'w') {
            System.out.println("Ход Белых:");
        } else if (board.getColorGaming() == 'b') {
            System.out.println("Ход Черных:");
        }
    }

    public static void end_game() {
        System.out.println();
        System.out.println("Игра завeршена.");
        in.close();
        System.exit(1);
    }
}