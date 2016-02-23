import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
//     private JButton color;
//     private JButton circle;
//     private JButton square;
    private DrawingPanel canvas;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel c)
    {
        // initialise instance variables
        canvas = c;
        
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
    public static void main(String[] args)
    {
        // put your code here
        JButton color = new JButton("Pick Color");
        JButton circle = new JButton("Add Circle");
        JButton square = new JButton("Add Square");
        JPanel panel = new JPanel();
        Color current = canvas.getColor();
        
        ClickListener listener = new ClickListener();
        color.addActionListener(listener);
    }
    public class ClickListener implements ActionListener
    {
        private String name;
    }

}
