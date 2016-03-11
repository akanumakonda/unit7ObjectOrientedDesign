import java.awt.geom.Point2D.Double;
import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Rectangle newRectangle;
    private int width;
    private int height;
    private int x;
    private int y;
    
    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)   
    {
        // initialise instance variables
        super(center, radius, color);
        x = (int) (center.getX() - radius);
        y = (int) ( center.getY() - radius);
        width = ( int) radius;
        height = (int) radius;
    }

    public boolean isInside(Point2D.Double point)
    {
          if (newRectangle.contains(point.getX(), point.getY()))
        {
            return true;
        }
        return false;
    }
    
    public  void draw(Graphics2D g2, boolean filled)
    {
        newRectangle = new Rectangle(x, y , width , height);
        if (filled == true)
        {
            g2.setPaint(color);
            g2.fill(newRectangle);
        }
        else
        {
            g2.setPaint(Color.WHITE);
            g2.fill(newRectangle);
            g2.setPaint(color);
            g2.draw(newRectangle);
        }
    }
}
