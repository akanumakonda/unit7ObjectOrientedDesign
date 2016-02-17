import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseEvent;

//call drawOval(int x, int y, int width, int height)
/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Triangle_Frame extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
      public int x;
      public int y;
      public int count;
      private static final int FRAME_WIDTH = 300;
      private static final int FRAME_HEIGHT = 400;
      
      private TriangleComponent scene;
     class MousePressListener implements MouseListener
     {

         public void mousePressed(MouseEvent event)
         {
             int x = event.getX();
             int y = event.getY(); 
             
            }
    }
    public Triangle_Frame()
    {
        scene = new Triangle_Component();
        add(scene);
        
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        
        MousePressListener listener = new MouseListener();
       scene.addMouseListener(listener);
       
    }
}
