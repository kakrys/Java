public class Hall {

    private int[][] times;
    private boolean[][] seats;

    private String FilmName;

    public Hall(int[][] times, boolean[][] seats, String FilmName) {
        this.times = times;
        this.seats = seats;
        this.FilmName = FilmName;
    }

    public boolean[][] getPlaces() {
        return seats;
    }

    public void showHallInfo() {
        System.out.println("Данный зал имеет " + seats.length + " рядов по " + seats[0].length + " мест в каждом");
        System.out.println("В данном зале идет фильм:" + FilmName);
        System.out.println("Сеансы данного зала:");

        for (int i = 0; i < times.length; i++) {
            int sessionNumber = i + 1;
            int Hour = times[i][0];
            int Minutes = times[i][1];
            int duration = times[i][2];

            System.out.println("Номер сеанса: " + sessionNumber + ". Начало в " + Hour + ":" + Minutes);
        }
    }
}
