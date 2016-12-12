/**
 * Created by jc347572 on 29/11/2016.
 */
public class TestBilling {
    public static void main (String[] args)
    {
        Billing billing = new Billing();
        billing.computeBill(200); System.out.println(billing.totaldue());
        billing.computeBill(200,2); System.out.println(billing.totaldue());
        billing.computeBill(200,2,10); System.out.println(billing.totaldue());
    }
}
