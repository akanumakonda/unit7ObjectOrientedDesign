


/**
 * Write a description of class Card_Heirarchy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card
{
   private String name;

   public Card()
   {
      name = "";
   }

   public Card(String n)
   {
      name = n;
   }

   public String getName()
   {
      return name;
   }

   public boolean isExpired()
   {
      return false;
   }

   public String format()
   {
      return "Card holder: " + name;
   }
}

