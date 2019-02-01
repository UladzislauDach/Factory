package factory;

public class Ship implements ITransport {

    @Override
    public void deliver() {
        System.out.println("Product were delivered by ship");
    }
}
