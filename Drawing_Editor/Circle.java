import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Ellipse2D.Double newCircle;
    private double width;
    private double height;
    private double x;
    private double y;
    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        // initialise instance variables
        super(center, radius, color);
        x = center.getX();
        y  = center.getY();
        width = 2*super.getRadius();
        height = width;
    }

    public boolean isInside(Point2D.Double point)
    {
        if (newCircle.contains(point.getX(), point.getY()))
        {
            return true;
        }
        return false;
    }

    public  void draw(Graphics2D g2, boolean filled)
    {
        newCircle = new Ellipse2D.Double(x, y , width , height);
        if (filled == true)
        {
            g2.setPaint(color);
            g2.fill(newCircle);
        }
        else
        {
            g2.setPaint(Color.WHITE);
            g2.fill(newCircle);
            g2.setPaint(color);
            g2.draw(newCircle);
        }

    }
}
