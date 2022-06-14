package Factory_Method_Pattern;

import java.util.Scanner;

public class GenerateBill {
    public static void main(String args[])
    {
        GetPlanfactory planfactory = new GetPlanfactory();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the plan");
        String planName = sc.next();
        System.out.println("Enter the units");
        int units = sc.nextInt();
        Plan p = planfactory.getPlan(planName);
        System.out.println("Bill amount for "+ planName + " of "+ units);
        p.getRate();
        p.calculateBill(units);
    }
}
