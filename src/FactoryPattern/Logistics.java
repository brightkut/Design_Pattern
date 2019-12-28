package FactoryPattern;

abstract class Logistics {

    public ITransport planDelivery(){

        return createTransport();
    }
    public abstract ITransport createTransport();


}
