package Singleton;

public class Main {
    public static void main(String[] args) {

        System.out.println(DatabaseConnection.getConnection().getDBname());

    }
}
