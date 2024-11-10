//* Basic Branching Allows 'else if' & 'if' are mandatory */
import java.util.*;
public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        /*
        if(s.equals("Luis")){
            System.out.println("Hi");
        } else if(s.equals("Hi")){
            System.out.println("Hello");
        } else {
            System.out.println("Bye!");
        }
                // Loops: while
        
        int i = 0;//Initialization
        while(i<10){//Condition
            System.out.println("i is: "+i);
            i++;//Update
        }
        
                //Loops; for
        
        for(int i = 0; i<10; i++){
            System.out.println("i is: "+ i);
        }
        //Same purpose
        */


                //Loops: "do while"
                int i = 0;
                do{
                    System.out.println("i is: "+i);
                    i++;
                }while(false);
        sc.close();
    }
}