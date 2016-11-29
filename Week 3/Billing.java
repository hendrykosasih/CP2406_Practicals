public class Billing {
    double tax;
    double totaldue;
    double total;
    double totalcoupon;

    public void computeBill(double price)
    {
        tax = price * 0.08;
        totaldue = price + tax;
    }

    public void computeBill(double price, double quantity)
    {
        total = price * quantity;
        tax = price * 0.08;
        totaldue = total + tax;
    }

    public void computeBill(double price, double quantity, double couponvalue)
    {
        total = price * quantity;
        totalcoupon = total - couponvalue;
        tax = price * 0.08;
        totaldue = tax + totalcoupon;
    }

    public double totaldue()
    {
        return totaldue;
    }
}
