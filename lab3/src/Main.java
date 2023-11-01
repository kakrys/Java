import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] Session1 = new int[]{9, 0, 245};
        int[] Session2 = new int[]{23, 30, 120};
        Hall[] halls;
        boolean[][] Seats1 = new boolean[10][10];
        boolean[][] Seats2 = new boolean[5][5];
        halls = new Hall[]{new Hall(new int[][]{Session1}, Seats1, "Терминатор"),
                new Hall(new int[][]{Session2}, Seats2, "Мстители")};

        Cinema cinema1 = new Cinema("Люмен",new Hall[]{halls[0]}, 43, 765);
        Cinema cinema2 = new Cinema("Киноленд",new Hall[]{halls[1]}, 21, 345);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер кинотеатра (1/2):");
            int cinemaNumber = scanner.nextInt();
            if (cinemaNumber == 1) cinema1.Info();
            if (cinemaNumber == 2) cinema2.Info();

            Cinema cinema = cinemaNumber == 1 ? cinema1 : cinema2;

            System.out.println("Введите номер зала (от 1 до " + cinema.getHalls().length + "):");
            int hallNumber = scanner.nextInt();
            halls[hallNumber].Info();

            while (hallNumber < 1 || hallNumber > cinema.getHalls().length) {
                System.out.println("Такого зала не существует");
                hallNumber = scanner.nextInt();
            }

            Hall hall = cinema.getHalls()[hallNumber - 1];

            System.out.println("Введите количество билетов,которые хотите купить:");
            int ticketAmount = scanner.nextInt();
            if (ticketAmount < 1) {
                System.out.println("Минимальное количество билетов - 1");
                continue;
            }
             //int occupiedSeats = hall.getSeats();

            while (ticketAmount > 0) {
                System.out.println("Выберете ряд и место: ");
                int column = scanner.nextInt();
                int row = scanner.nextInt();
                if (!hall.getPlaces()[column][row]) {
                    hall.getPlaces()[column][row] = true;
                    //occupiedSeats++;
                    ticketAmount--;
                    System.out.println("Вы купили билет на " + column + " ряд и " + row + " место");
                } else {
                    System.out.println("К сожалению,место занято..");
                }
            }

            System.out.println("Покупка билетов завершена!");
            scanner.next();
        }
    }
}
