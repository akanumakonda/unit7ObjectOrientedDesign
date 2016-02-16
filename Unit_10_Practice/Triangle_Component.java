import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.JLabel;

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
    
    private JFrame frame;
    private JPanel panel;

    /**
     * Default constructor for objects of class Triangle_Component
     */
    public Triangle_Component()
    {
        // initialise instance variables
        x = 0;
    }


    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x+y;
    }

}
