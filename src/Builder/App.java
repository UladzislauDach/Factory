package Builder;

public class App {
    public static void main(String[] args) {
        Car car = Car.newBuilder().withType("Sedan").withEngine("petrol").build();
        System.out.println(car.toString());
        Car car2 = Car.newBuilder().withType("hatchback").withEngine("petrol").withSeats(4).withTransmission("auto").build();
        System.out.println(car2.toString());
    }
}
