package ObserverPattern;

import java.util.ArrayList;

public class Server {
    private ArrayList<UpdateRouting>updateRoutings;

    public Server(ArrayList<UpdateRouting> updateRoutings) {
        this.updateRoutings = updateRoutings;
    }
    public void updateAllServer(String newRoute){

        for (UpdateRouting u :updateRoutings){

            System.out.println(u.updateRouting(newRoute));

        }
    }
}
