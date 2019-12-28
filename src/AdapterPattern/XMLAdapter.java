package AdapterPattern;

public class XMLAdapter implements ProcessAPI{

    private XML xml;

    public XMLAdapter(XML xml) {
        this.xml = xml;
    }

    @Override
    public void readJSON() {


        System.out.println("read xml with json method");
    }

    @Override
    public void writeJSON() {


        System.out.println("write XML with json method");
    }

    public void writeXML(){
        xml.writeXML();
    }

    public void readXML(){
        xml.readXML();
    }

}
