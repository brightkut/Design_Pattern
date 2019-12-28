package AdapterPattern;

public class JSON implements ProcessAPI {

    private String filename;

    public JSON(String filename) {
        this.filename = filename;
    }

    @Override
    public void readJSON() {
        System.out.println("read JSON success");

    }

    @Override
    public void writeJSON() {

        System.out.println("write JSON success");

    }
}
