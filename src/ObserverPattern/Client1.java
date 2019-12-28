package ObserverPattern;

public class Client1 implements UpdateRouting {

    private  String routingC1;

    public Client1(String routingC1) {
        this.routingC1 = routingC1;
    }

    @Override
    public String updateRouting(String newRouting) {
        String tmp = this.routingC1;
        this.routingC1 = newRouting;

        return "Client1:  Update from "+ tmp+ " to "+this.routingC1;
    }
}
