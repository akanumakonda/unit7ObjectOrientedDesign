import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import java.awt.Dimension;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    public ArrayList<Shape> listShapes;
    public Shape activeShape;
    public boolean curPicked;
    public Color curColor;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        // initialise instance variables
        MouseListener listener = new MousePressListener();
        this.addMouseListener(listener);
        this.setBackground(Color.White);
        curColor = BLUE;
        listShapes= new ArrayList();

    }

    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
        }

        public void mouseReleased(MouseEvent event)
        {
        }

        public void mouseEntered(MouseEvent event)
        {
        }

        public void mouseExited(MouseEvent event)
        {
        }
    }
    class MouseMotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
        }

    }

    public Color getColor()
    {
        return curColor;
    }

    public Dimension getPreferredSize()
    {
        Dimension dim = new Dimension( 500, 500)
    }

    public void pickColor()
    {
        JColorChooser.showDialog(this, "Select a Color", WHITE)
    }

    public void addCircle()
    {
    }

    public void addSquare()
    {
    }

    public void paintComponent(Graphics g)
    {
    }
}