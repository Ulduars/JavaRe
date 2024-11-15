//* 11/10/2024 
//* Luis Gomez de la Vega Nucette
//* Reads Data from Text File and Stores it in a List
import java.util.*;
import java.io.*;
public class Files{

    public static void main(final String[] args) throws Exception{

        File names = new File("C:\\Users\\luisg\\OneDrive\\Desktop\\VS Workspace\\VSJ\\Clubies.txt");    // Input a File with names
        Scanner reader = new Scanner(names);
        List<String> students = new ArrayList<String>();

            while (reader.hasNextLine()) {
                students.add(reader.nextLine());
                }
            for(int i =0; i<students.size(); i++){
                    System.out.println("Name: " + students.get(i));
        }
        reader.close();
    } 
}
