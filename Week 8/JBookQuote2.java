import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JBookQuote2{
    public static void main(String[] args)
    {
        JFrame bookquote2 = new JFrame("Bookquote");
        JPanel listOfQuote = new JPanel(new GridLayout(2,1));
        bookquote2.setSize(300,250);
        bookquote2.setContentPane(listOfQuote);
        bookquote2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        bookquote2.setLocationRelativeTo(null);
        JLabel book1quote = new JLabel("Key to success");
        JButton book1button = new JButton("Check Title");
        book1button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(book1button, "The tile is \"Steve Jobs\"");
            }
        });
        book1quote.setHorizontalAlignment(JLabel.CENTER);
        JLabel book2quote = new JLabel("No matter what");
        JButton book2button = new JButton("Check Title");
        book2button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(book2button, "The tile is \"African kids\"");
            }
        });
        book2quote.setHorizontalAlignment(JLabel.CENTER);
        listOfQuote.add(book1quote);
        listOfQuote.add(book1button);
        listOfQuote.add(book2quote);
        listOfQuote.add(book2button);
        bookquote2.setVisible(true);
    }

}