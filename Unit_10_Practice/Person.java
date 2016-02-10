
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class Person here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person implements Comparable<Person>
{
    private String name;
    
    public Person(String n)
    {
        name = n;
    }
    
    public static void main(String[] args)
    {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add(new Person("j"));
        list.add(new Person("i"));
        list.add(new Person("h"));
        list.add(new Person("g"));
        list.add(new Person("f"));
        list.add(new Person("e"));
        list.add(new Person("d"));
        list.add(new Person("c"));
        list.add(new Person("b"));
        list.add(new Person("a"));
        
       Collections.sort(list);
         for( int i =0; i<list.size(); i++)
         {
             System.out.println(list.get(i).name);
            }
    }
   
   public int compareTo( Person otherPerson )
   {
      
       
       if( this.name.compareTo( otherPerson.name)< 0 )
       {
           return -1;
        }
        else if(this.name.compareTo( otherPerson.name)> 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}