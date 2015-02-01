/**
 * @author DinaSu
 */

import java.util.ArrayList;
import java.util.Random;
import java.util.LinkedList;

public class PriorityQueue<T extends Comparable<T>>{
    private LinkedList<T> queue; //one of the elements
    
    
    /**
    * The main constructor.
    * Builds an empty queue
    */
    public PriorityQueue(){
       queue = new LinkedList<T>();  
    }
            
            
    /**
    * Second constructor. 
    * @throws QueueIsEmpty
    */
    public PriorityQueue(ArrayList<T> numbers) {
        queue = new LinkedList<T>(); 
        SortQueue(numbers);
        for(int i=0;i<numbers.size()-1;i++)
         { queue.add(numbers.get(i)); }      
       }

    
    /** Bubble sort for an array list 
    * TODO : need to improve the complexity by using another sort later  
    */
    public void SortQueue(ArrayList<T> numbers) {  
        for(int i=0;i<numbers.size()-1;i++)
            for(int j=0;j<numbers.size()-1;j++)
             {  if(numbers.get(i).compareTo(numbers.get(j)) == 1)
                 { T temp = numbers.remove(i);
                   numbers.add(i, numbers.remove(j));
                   numbers.add(i, temp);
                 }  
             } 
    }
    
    /* adds an element */
    public void add(T element){ queue.add(element); }

    /* poll an element out of the queue */
    public T poll() throws QueueIsEmpty{ 
        if( ! queue.isEmpty())
            return queue.removeLast();
        else 
           throw new QueueIsEmpty();            
    }
    
    /* checks if the queue contains the element */
    public boolean contains(T element){ 
        if(queue.contains(element))
            return true;
        else 
           return false;            
    }
    
    
    /* removes the element */
    public boolean remove(T element){ 
        if(queue.contains(element))
            { queue.remove(element);
              return true;
            }   
        else 
           return false;            
    }
    
    /* reurns the size of the queue */
    public int size(){ return queue.size();  }
    
    /* returns an integer that points to th bigning of the queue */
    public int iterator()
        {   int index=0;
            return index;
        }
    
    /**
    * The toString of the class. Returns the pair as needed.
    */
    public String toString(){
        return "< " + queue + " >";
        }
}
