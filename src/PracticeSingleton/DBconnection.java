package PracticeSingleton;

public class DBconnection {

    private static DBconnection dBconnection;


    private DBconnection(){

    }

    public static DBconnection getConnection(){

        if (dBconnection == null){

             dBconnection = new DBconnection();

        }

        return dBconnection;
    }


    @Override
    public String toString() {
        return "DBconnection{}";
    }
}
