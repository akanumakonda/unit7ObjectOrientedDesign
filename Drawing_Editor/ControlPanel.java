import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.lang.Object;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */

    private DrawingPanel canvas;
    private JPanel colorstuff;

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel c)
    {
        // initialise instance variables
        canvas = c;
        JButton color = new JButton("Pick Color");
        JButton circle = new JButton("Add Circle");
        JButton square = new JButton("Add Square");
        colorstuff = new JPanel();
        this.add(color);
        this.add(colorstuff);
        this.add(circle);
        this.add(square);
        Color current = canvas.getColor();
        colorstuff.setBackground(Color.WHITE);
        ClickListener listener = new ClickListener();
        color.addActionListener(listener);
        circle.addActionListener(listener);
        square.addActionListener(listener);

    }
    public class ClickListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
            if (event.getActionCommand() == "Pick Color")
            {
                canvas.pickColor();
                colorstuff.setBackground(canvas.getColor());
            }
            else if (event.getActionCommand() == "Add Circle")
            {

                canvas.addCircle();
            }
            else if (event.getActionCommand() == "Add Square")
            {

                canvas.addSquare();
            }
        }
    }

}
