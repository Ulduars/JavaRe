import java.util.*;
import java.io.*;
public class iterators{
    public static void main(String[] args){

        LinkedList<String> names = new LinkedList<String>();
        names.push("Luis");
        names.push("Abhi");
        names.push("Neil");
        names.push("Yuno");
        //FiLo <Yuno, Neil, Abhi, Luis>
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next()); //Returns the value you skipped 'Yuno'
        }
            //Collection methods 
            names.add(2,"String"); // The 2 is the index we put it in
        // For each 
        System.out.println("\nFor each");
        for(String s: names){
            System.out.println(s);
        }
        //Alternative way
        //List Iterators
        ListIterator<String> its = names.listIterator();
        its.next();
        its.next();
        its.add("Susan");

        System.out.println("\nAlternative way");
        for(String s: names){
            System.out.println(s);
        }

    }
}