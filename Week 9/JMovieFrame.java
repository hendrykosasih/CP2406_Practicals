import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

public class JMovieFrame extends JFrame implements ActionListener
{
    JButton northButton = new JButton("Norm of the North");
    JButton eastButton = new JButton("The East");
    JButton westButton = new JButton("West Coast");
    JButton southButton = new JButton("South Pacific");
    JLabel northLabel = new JLabel("");
    JLabel eastLabel = new JLabel("");
    JLabel westLabel = new JLabel();
    JLabel southLabel = new JLabel();
    JLabel centerLabel = new JLabel("");

    public JMovieFrame()
    {
        super.setTitle("JMovie Frame");
        setLayout(new BorderLayout());
        centerLabel.setHorizontalAlignment(JLabel.CENTER);
        add(northButton, "North");
        add(eastButton, "East");
        add(westButton, "West");
        add(southButton, "South");
        add(centerLabel, "Center");
        northButton.addActionListener(this);
        eastButton.addActionListener(this);
        westButton.addActionListener(this);
        southButton.addActionListener(this);

        Font myFont = new Font("Serif", Font.ITALIC | Font.BOLD, 12);
        Font newFont = myFont.deriveFont(20F);
        centerLabel.setFont(newFont);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object userChoice = e.getSource();
        if (userChoice == northButton)
        {
            centerLabel.setText("2016, Trevor Wall");
        }
        else
            if(userChoice == eastButton)
            {
                centerLabel.setText("2013, Brit Marling");
            }
            else
                if(userChoice == westButton)
                {
                    centerLabel.setText("2016, Simon Astier");
                }
                else
                    if(userChoice == southButton)
                    {

                        centerLabel.setText("1958, Joshua Logan");
                    }
        invalidate();
        validate();
    }

    public static void main(String[] args)
    {
        JMovieFrame movieFrame = new JMovieFrame();
        movieFrame.setSize(400, 200);
        movieFrame.setVisible(true);
        movieFrame.setLocationRelativeTo(null);
        movieFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
