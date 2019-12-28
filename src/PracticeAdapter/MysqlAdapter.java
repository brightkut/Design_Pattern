package PracticeAdapter;

public class MysqlAdapter implements DbAdapter {


    private  Mysql mysql = new Mysql();
    @Override
    public void readDatafromDatabase() {

        mysql.selectQuery();
    }
}
