package Factory_Method_Pattern;

public class CommercialPlan extends Plan{
    @Override
    void getRate() {
        rate = 7.50;
    }
}
