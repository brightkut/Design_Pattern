package Singleton;

public class DatabaseConnection {

    private static DatabaseConnection databaseConnection;

    private String DBname;

    private  DatabaseConnection(){

    }
    private DatabaseConnection(String d){
        this.DBname = d;
    }

    public static DatabaseConnection getConnection(){
        if(databaseConnection==null){
            databaseConnection = new DatabaseConnection("Bob");
        }
        System.out.println(databaseConnection.getDBname());
        return  databaseConnection;
    }
    public String getDBname(){
        return this.DBname;
    }

}
