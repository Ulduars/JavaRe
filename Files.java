//* 11/10/2024 
//* Luis Gomez de la Vega Nucette
//* Reads Data from Text File and Stores it in a List
import java.util.*;
import java.io.*;
public class Files{

    public static void main(final String[] args) throws Exception{

        File file = new File("C:\\Users\\luisg\\OneDrive\\Desktop\\VS Workspace\\VSJ\\Clubies.txt");

        Scanner sc = new Scanner(file);

        List<String> stds = new ArrayList<String>();

        while (sc.hasNextLine()) {
            stds.add(sc.nextLine());
        }
        for(int i =0; i<stds.size(); i++){
            System.out.println("Name: " + stds.get(i));
        }
        sc.close();
    } 
}