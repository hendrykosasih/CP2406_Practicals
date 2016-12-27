public class Fiction extends Book {

    public Fiction(String bkTitle)
    {
        super(bkTitle);
        setPrice();
    }

    public void setPrice()
    {
        bookPrice = 24.99;
    }
}