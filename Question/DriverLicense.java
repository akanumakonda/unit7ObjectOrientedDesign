
/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private int expiration;

    public DriverLicense(String n, int year)
    {
        super(n);
        expiration = year;
    }
    
    public String format()
    {
        String info = super.format();
        info += ("\nExpiration Year: " + expiration);
        return info;
    }

}
