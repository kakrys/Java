import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] Session1 = new int[]{12, 0, 180};
        int[] Session2 = new int[]{15, 15, 120};
        Hall[] halls;
        halls = new Hall[]{new Hall(new int[][]{Session1}, new boolean[10][15], "Терминатор"),
                new Hall(new int[][]{Session2}, new boolean[20][40], "Мстители")};

        Cinema cinema1 = new Cinema(new Hall[]{halls[0]}, 43, 765);
        Cinema cinema2 = new Cinema(new Hall[]{halls[1]}, 21, 345);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите номер кинотеатра (1/2):");
            int cinemaNumber = scanner.nextInt();
            if (cinemaNumber == 1) cinema1.showCinemaInfo();
            if (cinemaNumber == 2) cinema2.showCinemaInfo();

            if (cinemaNumber == 0) {
                break;
            }

            Cinema cinema = cinemaNumber == 1 ? cinema1 : cinema2;

            System.out.println("Введите номер зала (от 1 до " + cinema.getHalls().length + "):");
            int hallNumber = scanner.nextInt();
            halls[hallNumber].showHallInfo();

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

            while (ticketAmount > 0) {
                System.out.println("Выберете ряд и место: ");
                int column = scanner.nextInt();
                int row = scanner.nextInt();
                if (!hall.getPlaces()[column][row]) {
                    hall.getPlaces()[column][row] = true;
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
