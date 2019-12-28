package ObserverPattern;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Client1 client1 = new Client1("RouteC1");
        Client2 client2 = new Client2("RouteC2");

        ArrayList<UpdateRouting> updateRoutings = new ArrayList<>();
        updateRoutings.add(client1);
        updateRoutings.add(client2);

        Server server = new Server(updateRoutings);
        server.updateAllServer("Bright Route");

    }




}
