

/**
 * Write a description of class TesterCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TesterCard
{
    public static void main(String[] args)
    {
        Billfold cards = new Billfold();
        CallingCard c = new CallingCard("calling" , "1234567", "1234");
        cards.addCard(c);
        ID_Card id = new ID_Card ("ID", "1357" );
        cards.addCard(id);
        System.out.println(cards.formatCards());
    }

}
