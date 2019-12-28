package FactoryPattern;

public class Ship implements ITransport {

    @Override
    public String deliver() {
        return "Ship deliver";
    }
}
