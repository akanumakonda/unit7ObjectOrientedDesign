
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


}
