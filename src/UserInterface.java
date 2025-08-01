import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class UserInterface extends JPanel implements MouseListener, MouseMotionListener
{
    public int x, y = 0;

    public UserInterface()
    {
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        ImageLoader imageLoader = new ImageLoader();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        this.setBackground(Color.yellow);
        g.setColor(Color.BLUE);
        g.fillRect(x- 20, y - 20, 80, 200);
        g.setColor(new Color(190, 81, 215));
        g.fillRect(10, 10, 20, 20);
        g.drawString("Test test test", x, y);
    }

    @Override
    public void mouseClicked(MouseEvent e) { x = e.getX(); y = e.getY(); repaint(); }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}
}
