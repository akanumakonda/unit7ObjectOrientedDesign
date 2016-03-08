

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
    /**
     * Default constructor for objects of class Circle
     */
    public Circle()
    {
        // initialise instance variables
        width = 2*super.getRadus();
        height = width;
    }

    public boolean isInside(Point2D.Double point)
    if (newCircle.contains(point) == true)
    {
        return true;
    }
    return false;
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        newCircle = new Ellipse2D.Double(x, y , width , height);
        if (filled == true)
        {
            g2.setPaint(shapeColor);
            g2.fill(newCircle)
        }
        else
        {
            g2.setPaint(Color.WHITE);
            g2.fill(newCircle);
            g2.setPaint(shapeColor);
            g2.draw(newCircle)
            
        }
        
        
    }

}
