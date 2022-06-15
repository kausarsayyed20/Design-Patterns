package Observer_Pattern;

public class ObserverPatternMain {
    public static void main(String args[])
    {
        Publisher publisher = new Publisher();
        new BinarySubscriber(publisher);
        new OctalSubscriber(publisher);
        new HexaSubscriber(publisher);

        System.out.println("First state change: 15");
        publisher.setState(15);
        System.out.println("Second state change: 10");
        publisher.setState(10);
    }
}
