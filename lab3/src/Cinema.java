public class Cinema {

    private Hall[] halls;
    private int parkingplaces;
    private int price;

    public Cinema(Hall[] halls, int parkingplaces, int price) {
        this.halls = halls;
        this.parkingplaces = parkingplaces;
        this.price = price;
    }

    public Hall[] getHalls() {
        return halls;
    }

    public int Parking(int parkingplaces) {return parkingplaces;}

    public int getPrice() {
        return price;
    }

    public void showCinemaInfo() {
        System.out.println("Информация о данном кинотеатре:");
        System.out.println("Количество парковочных мест: " + parkingplaces);
        System.out.println("Стоимость билета: " + price);
        System.out.println("Количество залов: " + halls.length);

    }
}
