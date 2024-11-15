 /* 
11/10/2024
Luis Gomez de la Vega 
Uses a Stack to print out names
*/
import java.io.FileNotFoundException;
import java.util.*;

public class CollectionsStack{
    // Stack traces Allow you to see the methods a computer took
    public static void main(String[] args) throws FileNotFoundException{

        LinkedList<String> names = new LinkedList<String>();  
        
            names.push("Luis");
            names.push("Neil");
            names.push("Abhi");
            names.push("Yuno");
                
            System.out.println(names.pop());
            System.out.println(names.pop());
            System.out.println(names.pop());
            System.out.println(names.pop());
                //Stacks use 'push' and 'pop'
    }
}
