package Proxy;

public class ImageProxy implements ImageInterfaceService {

    private  ImageInterfaceService imageInterfaceService;
    private String filePath;

    public ImageProxy(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void ShowImage() {

        log("Read file");

        if (imageInterfaceService == null){
            imageInterfaceService = new ImageService(filePath);

        }
        imageInterfaceService.ShowImage();

        System.out.println("Add number to database");

    }



    private void log(String msg){
        System.out.println(msg);

    }


}
