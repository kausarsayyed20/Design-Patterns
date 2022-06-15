package Observer_Pattern;

public abstract class Subscriber {
    protected Publisher publisher;
    public abstract void update();
}

