/**
 * Created by Hendry Kosasih on 12/27/2016.
 */
import java.util.Scanner;

public class TestOnly {
    public static void main(String[] args)
    {
        int age;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter you fcking name >>> ");
        String name = input.nextLine();
        System.out.println("Thanks, " + name);
        System.out.print("Okay. Next question. How old are you, " + name +"? >>> ");
        age = input.nextInt();
        System.out.println("You are so fucking old man, " + name + "." +age + "years old?!?!?!");

    }
}
