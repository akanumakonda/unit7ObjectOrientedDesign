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
    private ControlPanel controls;
    private DrawingPanel canvas;
    
    private static final int FRAME_WIDTH = 500;
    private static final int FRAME_HEIGHT = 500;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        canvas = new DrawingPanel();
        controls = new ControlPanel( canvas);
        
        this.setTitle("Drawing Editor");
        this.setSize (FRAME_WIDTH, FRAME_HEIGHT);
        this.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(controls);
        this.add( controls, BorderLayout.SOUTH);
        this.add( canvas, BorderLayout.CENTER );
        
    }


    public static void main( String[] args)
    {
        // put your code here
        DrawingEditor draw = new DrawingEditor();
    }

}
