//* Basic Branching Allows 'else if' & 'if' are mandatory */
import java.util.*;
public class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if(s.equals("Luis")){
            System.out.println("Hi");
        } else if(s.equals("Hi")){
            System.out.println("Hello");
        } else {
            System.out.println("Bye!");
        }
                // Loops: while
        
        int j = 0;//Initialization
        while(j<10){//Condition
            System.out.println("j is: "+j);
            j++;//Update
        }
        
                //Loops; for
        
        for(int k = 0; k<10; k++){
            System.out.println("k is: "+ k);
        }
        //Same purpose
        


                //Loops: "do while"
                int b = 0;
                do{
                    System.out.println("b is: "+b);
                    b++;
                }while(b<10);//condition();
        sc.close();
    }
}