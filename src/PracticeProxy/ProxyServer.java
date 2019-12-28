package PracticeProxy;

public class ProxyServer implements ProtocolService {

    private  Server server;


    @Override
    public void connect() {

        System.out.println("wait connecting");
        if (server == null){
            server = new Server();
        }

        server.connect();

        System.out.println("connect success");
    }
}
