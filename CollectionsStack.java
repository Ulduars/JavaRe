 /* 
11/10/2024
Luis Gomez de la Vega 
Uses a Stack to print out names
*/
import java.util.*;
import java.io.*;
public class CollectionsQ{
    public static void main(String[] args){
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