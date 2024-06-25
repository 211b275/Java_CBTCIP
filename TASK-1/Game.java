import javax.swing.*;  
import java.awt.*;    
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Game extends JFrame 
{
    public JTextField guessField;
    public JButton guessButton;
    public JLabel messageLabel;
    public int n;
    public int t;
    public Game() 
    {
        setTitle("Guess the Number Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        Random x = new Random();
        n = x.nextInt(100) + 1;
        t = 0;
        guessField = new JTextField(10);
        guessButton = new JButton("Guess");
        messageLabel = new JLabel("Guess the number between 1-100:");
        guessButton.addActionListener(new GuessButtonListener());
        setLayout(new GridLayout(4, 1));
        add(messageLabel);
        add(guessField);
        add(guessButton);
    }
    public class GuessButtonListener implements ActionListener 
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            try 
            {
                int guess = Integer.parseInt(guessField.getText());
                t++;
                if (guess < 1 || guess > 100) 
                {
                    messageLabel.setText(" Not Possible! ");
                } 
                else if (guess < n) 
                {
                    messageLabel.setText(" Please try again ");
                } 
                else if (guess >= n) 
                {
                    messageLabel.setText("That's it more please");
                } 
                else 
                {
                    messageLabel.setText("Yippee! You did well: " + n + "tries");
                    guessButton.setEnabled(false); 
                }
            } 
            catch (NumberFormatException ex) 
            {
                messageLabel.setText("Please enter a valid number.");
            }
        }
    }
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> new Game().setVisible(true));
    }
}
