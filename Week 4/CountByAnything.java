import java.util.Scanner;

public class CountByAnything {
    public static void main(String[] args)
    {
        int numb;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number");
        int userEntry = input.nextInt();
        for(numb = userEntry; numb<=userEntry*100; numb+=userEntry)
        {
            if(numb%(userEntry*10) == 0)
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