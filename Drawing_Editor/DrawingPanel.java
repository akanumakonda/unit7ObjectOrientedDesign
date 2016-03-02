import javax.swing.JPanel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JColorChooser;
import java.awt.Dimension;
import java.awt.geom.Point2D.Double;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    public ArrayList<Shape> listShapes;
    public Shape activeShape;
    public boolean curPicked;
    private Color curColor;
    private Point2D.Double;
    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        // initialise instance variables
        MouseListener listener = new MousePressListener();
        this.addMouseListener(listener);
        this.setBackground(Color.White);
        curColor = BLUE;
        listShapes= new ArrayList();
        Point2D.Double = new Point2D.Double(500/2, 500/2);
    }

    class MousePressListener implements MouseListener
    {
        public void mousePressed(MouseEvent event)
        {
            for(Shape s: listShapes)
            {
                Point2D.Double curPoint= new Point2D.Double(event.getX(), event.getY() );
                if (s.isInside(curPoint))
                {
                    activeShape = s;
                }
            }
        }

        public void mouseReleased(MouseEvent event)
        {
        }

        public void mouseEntered(MouseEvent event)
        {
        }

        public void mouseExited(MouseEvent event)
        {
        }
    }
    class MouseMotionListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            activeShape.move(event.getX(), event.getY());
        }

    }

    public Color getColor()
    {
        return curColor;
    }

    public Dimension getPreferredSize()
    {
        Dimension dim = new Dimension( 500, 500)
    }

    public void pickColor()
    {
        JColorChooser.showDialog(this, "Select a Color", WHITE)
    }

    public void addCircle()
    {
        Circle circle = Circle( Point, 15.5, curColor);
        listShapes.add(circle);
        activeShape = circle;
        repaint();
    }

    public void addSquare()
    {
        Square square = Square( Point, 15.5, curColor);
        listShapes.add(square);
        activeShape = square;
        repaint();
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Shape s: listShapes)
        {
            if (listShapes[i] != activeShape)
            {
                listShapes[i].draw(g2, true);
            }
            
        }
        activeShape.draw(g2, false);
    }
}