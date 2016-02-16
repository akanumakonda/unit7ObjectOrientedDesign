import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList<E>;
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
      private static final int FRAME_WIDTH = 300;
      private static final int FRAME_HEIGHT = 400;
      
      private TriangleComponent scene;
      public ArrayList<Integers> points;
     class MousePressListener implements MouseListener
     {
        public static void main(String args[])
         {
             Mouselistener listener = new Mouselistener()
         }
         public void mousePressed(MouseEvent event)
         {
             int x = event.getX();
             int y = event.getY();
             scene.drawDot(x,y);
             points.add(x);
             points.add(y);
            }
            public void mouseReleased(MouseEvent event) {}
    }
}
