public class CountByThrees {
    public static void main(String[] args)
    {
        int numb;
        for(numb = 3; numb<=300; numb+=3)
        {
            if(numb%30 == 0)
            {
                System.out.println(numb);
            }
            else
            {
                System.out.print(numb + ", ");
            }
        }
    }
}