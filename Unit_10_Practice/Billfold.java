
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

    public void addCard(Card c)
    {
        if( card1 == null)
        {
            card1 = c;
        }
        else if( card2 == null)
        {
            card2 = c;
        }
    }

    public String formatCards()
    {
        if ( card2 != null)
        {
            String str = (card1 + "|" + card2 );
            return str;
        }
        else if ( card1 != null)
        {
            String str = (card1 + "|" );

            return str;
        }
        else
        {
            return "";
        }

    }

    public int getExpiredCardCount()
    {
        int count = 0;
        if ( this.card1 )
        {

        }
    }


}
