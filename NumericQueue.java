/**
 * @author DinaSu
 */

    
import java.util.ANumericQueuerrayList;
import java.util.Random;

/**
* The number pairs class.
* Creates a random length array of numbers and fills with random values.
*/
public class NumericQueue extends PriorityQueue{
    private final int MAX_NUM = 100; //Max number
    private final int ARRAY_SIZE = 20; //Max array size
    private Random rand = new Random(); //Random
    private ArrayList<Integer> numbers ; 
    
    
    /**
    * The constructor.
    * Creates an ArrayList and fills it with numbers.
    */
    public NumericQueue() throws QueueIsEmpty{
        numbers  = new ArrayList<>(ARRAY_SIZE); 
        for (int i = 0; i < ARRAY_SIZE; i++)
            numbers.add(rand.nextInt(MAX_NUM));
    }
    
    
    /**
    * Doesn't return anything.
    * Iterates the array and prints it out.
    */
    public void PrintArray(){
        for (Integer temp : numbers ) 
            System.out.println(temp);   
        }
}
