public class NonFiction extends Book {

    public NonFiction(String bkTitle)
    {
        super(bkTitle);
        setPrice();
    }

    public void setPrice()
    {
        bookPrice = 37.99;
    }
}
