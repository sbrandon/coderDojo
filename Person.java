
/**
 * The person class holds all the information about a person.
 * 
 * @author (sbrandon) 
 * @version (March 2014)
 */
public class Person
{
    //Class Variables
    private String name;
    private String phoneNumber;
    private int age;
    
    //Constructor
    public Person(String name, String phoneNumber, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }
    
    /*
     * The following methods are called 'get' methods. They are used to return
     * variables in the class. Notice that our return type has changed from 'void' to 'String' in this case
     * so we are returning a String value. Test it and see what happens!
     */
    
    //Get the persons name
    public String getName(){
        return name;
    }
    
    //Get the persons phoneNumber
    public String phoneNumber(){
        return phoneNumber;
    }
    
    //Get the persons age
    public int getAge(){
        return age;
    }

    
}
