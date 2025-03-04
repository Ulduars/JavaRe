import java.util.*;
public class invaders{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int start = sc.nextInt();
        String cmds = sc.next();
        for(int i = 0; i<n; i++){
            if(cmds.charAt(i)=='R'){
                start += 1;
            } else{
                start += -1;
            }
        }
        if(start != 0){
            System.out.println("Better luck next time!");
        } else{
            System.out.println("Challenge completed!");
        }
        }
    }