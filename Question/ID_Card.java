
/**
 * Write a description of class ID_Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ID_Card extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String idNumber;

    public ID_Card(String n, String id)
    {  
        super(n);
        idNumber = id;
    }

    public String format()
    {
        String info = super.format();
        info += ("\nID Number: " + idNumber);
        return info;
    }

    public boolean equals(Object other)
    {
        //return getName().equals(other.getName()) && idNumber.equals(other.idNumber)) ;
        //The more complicated way to do it
        // check if this object and the other object are both instances of the same class
        if ( this.getClass() == other.getClass())
        {
            // since both objects are instances of IDCard, it is okay to cast other to an IDCard reference
            ID_Card otherIDCard = (ID_Card) other;
            boolean isEqual = super.equals( otherIDCard );
            return isEqual && idNumber.equals( other.idNumber);
        }
        return false;
    }

}
