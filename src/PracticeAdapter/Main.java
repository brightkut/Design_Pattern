package PracticeAdapter;

public class Main {

    public static void main(String[] args) {


        Login l = new Login();
        l.login(new MogoAdapter());
        l.login(new MysqlAdapter());
    }
}
