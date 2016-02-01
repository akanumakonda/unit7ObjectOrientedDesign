

/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String card_Number;
    private String pin;
    /**
     * Default constructor for objects of class CallingCard
     */
    public CallingCard(String n, String num, String p)
    {
        // initialise instance variables
        super(n);
        card_Number = num;
        pin = p;
    }
    
    public String format()
    {
        String info = super.format();
        info += ("\nCard Number:" + card_Number + "\nPIN: " + pin);
        return info;
        
    }



}
