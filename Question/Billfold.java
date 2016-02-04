

/**
 * Write a description of class Billfold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Billfold
{
    /** description of instance variable x (add comment for each instance variable) */
    private Card card1;
    private Card card2;

    /**
     * Default constructor for objects of class Billfold
     */
    public Billfold()
    {
        // initialise instance variables

    }
    
    public void addCard( Card c)
    {
        if (card1 == null)
        {
            card1 = c;
        }
        else
        {
            card2 = c;
        }
        
    }
    public String formatCards()
    {
        String str = "";
       if (card1 != null)
       {
           str += ("[" + super.format());
           
        }
       else if( card2 != null)
       {
           str +=  ("|" + super.format() + "]");
        }
       
    }
    

}
