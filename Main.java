/**
 * @author DinaSu
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {
    private static final int P_NUM = 4; //number of people requested in the ArrayList
    
    /**
    * Generating the people objects birth years
    */
    public static int rand_gen(){
        Random rand = new Random(); //generating a new Random
        final int MAX_BIRTH_RANGE = 100; 
        final int MIN_BIRTH_DATE = 1900; //THe oldest person
        return rand.nextInt(MAX_BIRTH_RANGE) + MIN_BIRTH_DATE;
    }
   
    
    
    public static void main(String[] args) throws QueueIsEmpty {
        NumericQueue  numberPairs = new NumericQueue (); //initializing a new object
        numberPairs.PrintArray(); //print it out.
        


        //initializing the people's ArrayList
        PriorityQueue<Person> peopleQueue = new PriorityQueue<Person>();
        for (int i = 0 ; i < P_NUM ; i++){
                Person p =new Person(rand_gen());
                peopleQueue.add(p);
                System.out.println(peopleQueue.toString());
            }
        }
}
        
