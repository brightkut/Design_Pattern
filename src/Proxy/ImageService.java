package Proxy;

public class ImageService implements ImageInterfaceService {


    private String fileName;

    public ImageService(String fileName) {
        loadImageFromDisk(fileName);
    }


    @Override
    public void ShowImage() {
        System.out.println(fileName);
    }

    private void loadImageFromDisk(String filePath){

        this.fileName = "Batman";

    }
}
