package Singleton_Pattern;

public class SingletonMain {
    public static void main(String args[])
    {
        Database db;
        db = Database.getInstance();
        db.getConnection();
    }
}