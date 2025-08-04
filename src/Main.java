
import javax.swing.JFrame;
public class Main
{


    public static void main(String[] args)
    {
        UserInterface ui = new UserInterface();
        JFrame frame = new JFrame("Chess Engine Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.add(ui);
        frame.setVisible(true);
    }
}