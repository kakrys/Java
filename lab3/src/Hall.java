public class Hall {

    private String FilmName;
    private int[][] session;
    private boolean[][] seats;

    public Hall(int[][] session, boolean[][] seats, String FilmName) {
        this.session = session;
        this.seats = seats;
        this.FilmName = FilmName;
    }

    public int getSeats() {
        return seats[0].length*seats.length;
    }

    public boolean[][] getPlaces() {
        return seats;
    }

    public void Info() {
        System.out.println("Данный зал имеет " + seats.length + " рядов по " + seats[0].length + " мест в каждом");
        System.out.println("В данном зале идет фильм:" + FilmName);
        System.out.println("Сеансы данного зала:");

        for (int i = 0; i < session.length; i++) {
            int sessionNumber = i + 1;
            int Hour = session[i][0];
            int Minutes = session[i][1];

            System.out.println("Номер сеанса: " + sessionNumber + ". Начало в " + Hour + ":" + Minutes);
        }
    }
}
