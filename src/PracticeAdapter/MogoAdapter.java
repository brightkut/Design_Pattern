package PracticeAdapter;

public class MogoAdapter implements DbAdapter{


    private  Mongo mongo = new Mongo();


    @Override
    public void readDatafromDatabase() {

        mongo.getData();

    }
}
