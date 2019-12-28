package PracticeProxy;

public class Server implements ProtocolService {

    @Override
    public void connect() {
        System.out.println("connect real server");
    }
}
