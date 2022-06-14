package Singleton_Pattern;

public class Database {
    private static Database obj;
    private Database(){

    }
    public static Database getInstance(){
        if(obj == null)
        {
            obj = new Database();
        }
        return obj;
    }
    public void getConnection(){
        System.out.println("You are now connected to the database");
    }
}