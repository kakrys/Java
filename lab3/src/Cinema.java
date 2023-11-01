public class Cinema {

    private String Name;
    private Hall[] halls;
    private int parkingplaces;
    private int price;

    public Cinema(String Name,Hall[] halls, int parkingplaces, int price) {
        this.Name = Name;
        this.halls = halls;
        this.parkingplaces = parkingplaces;
        this.price = price;
    }

    public Hall[] getHalls() {
        return halls;
    }

    public void Info() {
        System.out.println("Информация о Кинотеатре: " + '"' + Name + '"');
        System.out.println("Количество парковочных мест: " + parkingplaces);
        System.out.println("Стоимость билета: " + price);
        System.out.println("Количество залов: " + halls.length);

    }
}
