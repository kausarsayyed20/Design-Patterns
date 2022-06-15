package Observer_Pattern;


public class BinarySubscriber extends Subscriber{
    public BinarySubscriber(Publisher publisher){
        this.publisher = publisher;
        this.publisher.attach(this);
    }
    @Override
    public void update() {
        System.out.println("Binary String " + Integer.toBinaryString(publisher.getState()));
    }
}
