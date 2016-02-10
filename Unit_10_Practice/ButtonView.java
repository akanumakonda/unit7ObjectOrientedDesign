import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.event.ActionEvent;

public class ButtonView
{
    private static final int FRAME_WIDTH = 100;
    private static final int FRAME_HEIGHT = 1000;

    private JFrame frame;
    private JPanel panel;
    private JLabel label;
    private JButton button;
    private JButton button2;

    public ButtonView()
    {
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.label = new JLabel();
        this.panel.add(label);

        //JFrame can only hold onto one components
        this.button = new JButton( "A");
        this.panel.add(button);
        // panel is a container for the button components
        this.button2 = new JButton( "B");
        this.panel.add(button2);

        this.frame.add(panel);

        ClickListener listener = new ClickListener();
        this.button.addActionListener( listener );
        this.button2.addActionListener(listener);

        /* Inefficient method, don't need 2 listeners 
        ClickListener listener = new ClickListener("A");
        button.addActionListener( listener );
        //each button needs its own listener
        ClickListener listener2 = new ClickListener("B");
        button2.addActionListener(listener2);
         */

        this.frame.setSize ( FRAME_WIDTH, FRAME_HEIGHT );
        this.frame.setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public static void main( String[] args)
    { 
        ButtonView view = new ButtonView();
    }
    // inner class
    public class ClickListener implements ActionListener
    {
        private String name;
        //inefficient method    
        //     public ClickListener( String buttonName)
        //     {
        //         this.name = buttonName;
        //     }
        public void actionPerformed(ActionEvent event)
        {
            label.setText( "Button " + event.getActionCommand() + " was clicked!");
        }
    }
}
