import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;
import java.awt.geom.Ellipse2D;
/**
 * Write a description of class Triangle_Component here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle_Component
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 100;
    public ArrayList<Integer> points;
    
    /**
     * Default constructor for objects of class Triangle_Component
     */
    public Triangle_Component()
    {
        // initialise instance variables
        points = new ArrayList<Integer>(6);

    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        points.add(x);
        points.add(y);
        if (points.size() == 2)
        {
            Ellipse2D dot = new Ellipse2D(1,1, points[0], points[1]);
            g2.draw(dot);
            repaint();
        }
        if (points.size() == 4)
        {
            g2.drawLine(points[0], points[1], points[2], points[3]);
        }
        if (points.size() == 6)
        {
            g2.drawLine(points[2], points[3], points[4], points[5]);
            g2.drawLine(points[0], points[1], points[4], points[5]);
        }
        if (points.size() >= 8)
        {
        }
    }
            
        
        points.add(x);
        points.add(y);

}

