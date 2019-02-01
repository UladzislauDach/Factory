package factory;

public class Truck implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Product were delivered by truck");
    }
}
