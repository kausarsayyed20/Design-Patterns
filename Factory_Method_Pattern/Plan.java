package Factory_Method_Pattern;

public abstract class Plan {
    double rate;
    abstract void getRate();

    public void calculateBill(int units){
        System.out.println(units*rate);
    }
}
