import java.awt.geom.Point2D.Double;
import java.awt.Color;
/**
 * Write a description of class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D.Double center;
    private Color color;
    private Double radius;
    /**
     * Default constructor for objects of class Shape
     */
    public Shape(Point2D.Double center, double radius, Color color)   
    {
        // initialise instance variables
        this.center =  center;
        this.radius = radius;
        this.color = color;
    }

    public Point2D.Double getCenter()
    {
        return center;
    }
    
    public double getRadius()
    {
        return radius;
    }
    
    public void move(double x, double y)
    {
        center.setLocation(x, y);
    }
    public void setRadius(double r)
    {
        radius = r;
    }
    public abstract boolean isInside(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
    
    
}
