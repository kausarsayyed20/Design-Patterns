package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;


public class Publisher {
    private List<Subscriber> subscribersList = new ArrayList<Subscriber>();
    private int state;

    public int getState(){
        return state;
    }
    public void setState(int state)
    {
        this.state = state;
        notifyAllSubscribers();
    }
    public void attach(Subscriber subscriber)
    {
        subscribersList.add(subscriber);
    }

    public void notifyAllSubscribers(){
        for(Subscriber subscriber : subscribersList){
            subscriber.update();
        }
    }


}
