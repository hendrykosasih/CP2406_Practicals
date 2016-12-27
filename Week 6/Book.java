public abstract class Book {
    private String bookTitle;
    protected double bookPrice;

    Book(String bkTitle)
    {
        bookTitle = bkTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public abstract void setPrice();
}