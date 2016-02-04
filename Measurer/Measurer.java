/**
   Describes any class whose objects can measure other objects. Used when can't manipulate other object classes
*/
public interface Measurer
{
   /**
      Computes the measure of an object.
      @param anObject the object to be measured
      @return the measure
   */
   double measure(Object anObject);
}
