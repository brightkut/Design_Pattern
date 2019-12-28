package PracticeProxy;

public class Main {
    public static void main(String[] args) {

        ProtocolService p = new Server();
        p.connect();

        System.out.println("----------------------------");
        ProtocolService proxy = new ProxyServer();
        proxy.connect();


    }
}
