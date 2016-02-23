import javax.swing.JFrame;
import java.awt.BorderLayout;
/**
 * Write a description of class DrawingEditor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private JFrame frame;
    private ControlPanel controls;
    private DrawingPanel canvas;
    private BorderLayout lay;
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        // initialise instance variables
        canvas = new DrawingPanel();
        controls = new ControlPanel( canvas);
        
        frame = new JFrame();
        frame.setTitle("Drawing Editor");
        frame.setSize (FRAME_WIDTH, FRAME_HEIGHT);
        frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        lay = new BorderLayout();
        lay.addLayoutComponent(canvas, BorderLayout.SOUTH);
        lay.addLayoutComponent(controls, BorderLayout.SOUTH);
        
    }


    public static void main( String[] args)
    {
        // put your code here
        DrawingEditor draw = new DrawingEditor();
    }

}
