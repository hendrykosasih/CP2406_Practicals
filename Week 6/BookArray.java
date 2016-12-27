import java.awt.print.*;

public class BookArray {
    public static void main(String[] args)
    {
        Book book10[] = new Book[10];
        book10[0] = new Fiction("Sparkle");
        book10[1] = new Fiction("Watch");
        book10[2] = new Fiction("Zoom");
        book10[3] = new Fiction("Law");
        book10[4] = new Fiction("Privacy");
        book10[5] = new NonFiction("Zen");
        book10[6] = new NonFiction("Zero Death");
        book10[7] = new NonFiction("Halo");
        book10[8] = new NonFiction("Rest");
        book10[9] = new NonFiction("Program");

        for(Book e: book10)
        {
            System.out.println(e.getBookTitle()+" Price = $" + e.getBookPrice());
        }
    }
}