package Proxy;

public class Main {

    public static void main(String[] args) {

        ImageInterfaceService imageInterfaceService = new ImageProxy("ccc");
        imageInterfaceService.ShowImage();

    }
}
