package AdapterPattern;

public class Main
{
    public static void main(String[] args) {

        JSON json = new JSON("Bright");
        XML xml = new XML();
        XMLAdapter xmlAdapter = new XMLAdapter(xml);


        //part Json
        System.out.println("----- Part JSON -----");
        json.readJSON();
        json.writeJSON();


        //part XML
        System.out.println("----- Part XML -----");
        xml.readXML();
        xml.writeXML();


        //part XMLAdaper
        System.out.println("----- Part XML Adaper -----");
        xmlAdapter.readJSON();
        xmlAdapter.writeJSON();
        xmlAdapter.readXML();
        xmlAdapter.writeXML();




    }
}
