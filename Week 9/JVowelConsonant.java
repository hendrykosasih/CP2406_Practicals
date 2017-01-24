import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JVowelConsonant extends JFrame implements ActionListener
{
    Container con = null;
    final int LETTERS_AT_A_TIME = 8;
    JButton[] b = new JButton[LETTERS_AT_A_TIME];
    final String[] LETTERS = {"A", "B", "C", "D","E","F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JLabel content = new JLabel("");


    int x;
    int random;
    int[] rans = {-1, -1, -1, -1, -1, -1, -1, -1};
    public JVowelConsonant()
    {
        super.setTitle("JVowelConsonant");
        for(x = 0; x < LETTERS_AT_A_TIME; ++x)
        {
            random = (int)(Math.random() * LETTERS.length);
            rans[x] = random;
        }
        setLayout(new GridLayout(1, 2));

        for(x = 0; x < LETTERS_AT_A_TIME; ++x)
            b[x] = new JButton(LETTERS[rans[x]]);
        for(x = 0; x < 4; ++x)
            panel1.add(b[x]);
        for(; x < LETTERS_AT_A_TIME; ++x)
            panel2.add(b[x]);

        add(panel1);
        add(panel2);
        content.setHorizontalAlignment(JLabel.CENTER);
        add(content);
        for(x = 0; x < LETTERS_AT_A_TIME; ++x)
            b[x].addActionListener(this);

        Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 12);
        Font newFont = myFont.deriveFont(20F);
        content.setFont(newFont);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        for(x = 0; x < LETTERS_AT_A_TIME; ++x)
            if (source == b[x])
            {
                if(b[x].getText() == "A" || b[x].getText() == "E" ||
                        b[x].getText() == "I" || b[x].getText() == "O" ||
                        b[x].getText() == "U")
                    content.setText(b[x].getText() + " is a vowel");
                else
                    content.setText(b[x].getText() + " is a consonant");
                random = (int)(Math.random() * LETTERS.length);
                b[x].setText(LETTERS[random]);
                x = LETTERS_AT_A_TIME;
            }
    }
    public static void main(String[] ags)
    {
        JVowelConsonant JFrame = new JVowelConsonant();
        JFrame.setSize(500, 110);
        JFrame.setVisible(true);
        JFrame.setResizable(false);
        JFrame.setLocationRelativeTo(null);
    }
}