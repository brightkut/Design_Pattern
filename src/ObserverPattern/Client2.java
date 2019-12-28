package ObserverPattern;

public class Client2 implements UpdateRouting {
    private String routingC2;


    public Client2(String routingC2) {
        this.routingC2 = routingC2;
    }

    @Override
    public String updateRouting(String newRouting) {
        String tmp = this.routingC2;
        this.routingC2 = newRouting;

        return "Client2: Update from "+ tmp+ " to "+this.routingC2;
    }
}
