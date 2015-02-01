/**
 * @author DinaSu
 */

public class Person implements Comparable<Person>{
    private String _name; //the name of person
    private int _birthYear; //the birth year
    final int MAX_BIRTH_RANGE = 114; //The gap
    final int MIN_BIRTH_DATE = 1900; //The oldest person
    private String name = "Person "; //The name of the person
    private static int number = 1; //The counter 
    
    
    /**
    * The constructor. Generates the person object, with an unique name
    */
    public Person(int birthYear){
        _name = name + number; //name is created and set
        number++; //number of people is incremented
        setBirthYear(birthYear); //birth year is set
        }
    private void setBirthYear(Integer birthYear) { //sets birth year 
        if (birthYear < MIN_BIRTH_DATE){ 
            System.out.println("The person \"" + _name + "\" is too old. Resetting to " + MIN_BIRTH_DATE + ".");
            _birthYear = MIN_BIRTH_DATE;
            }
        else if (birthYear > MIN_BIRTH_DATE + MAX_BIRTH_RANGE){ 
            System.out.println("The year you have written doesn't exist yet. Resetting to " + (MIN_BIRTH_DATE + MAX_BIRTH_RANGE) + ".");
            _birthYear = MIN_BIRTH_DATE + MAX_BIRTH_RANGE; 
            }
        else _birthYear = birthYear; 
        }
    
    /**
    * Gets the birth year
    */
    public int getBirthYear(){ return _birthYear;  }
    
    
    /**
    * Compares people by birth dates
    */
    public int compareTo(Person person) {
        if (this.getBirthYear() < person.getBirthYear())
            return -1;
        else if (this.getBirthYear() > person.getBirthYear())
            return 1;
        else
            return 0;
        }
    
    /**
    * The toString method.
    * Return the name and birth year of a person
    */
    public String toString(){
        return "( " +_name + "; " + _birthYear + " )";
        }

}
