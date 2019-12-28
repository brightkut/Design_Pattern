package FactoryPattern;

public class Truck implements ITransport {
    @Override
    public String deliver() {
        return "Truck deliver";
    }
}
