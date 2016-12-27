public class UseBook {
    public static void main(String[] args)
    {
        Book book1 = new Fiction("Harry Potter");
        Book book2 = new NonFiction("Jumanji");
        System.out.println(book1.getBookPrice());
        System.out.println(book2.getBookTitle());
    }
}