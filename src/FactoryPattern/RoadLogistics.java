package FactoryPattern;

//subclass that use to create object
public class RoadLogistics extends Logistics {

    @Override
    public ITransport createTransport() {
        return new Truck();
    }
}
