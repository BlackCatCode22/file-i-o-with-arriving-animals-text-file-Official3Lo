import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;

//part 1 - to read | part 2 - to write
public class FileIOWithCSV {
    public static void main(String[] args) throws IOException {
        System.out.println("\n\nWelcome to File I/O!\n\n");

        String pathName = "C:\\Users\\BE218\\IdeaProjects\\x\\JavaFile\\arrivingAnimals.txt";
        String pathOutput = "C:\\Users\\BE218\\IdeaProjects\\x\\JavaFile\\myNewFile.txt";
        BufferedReader reader = null;
        BufferedWriter writer = null;
        String line = "";

        try{
            writer = new BufferedWriter(new FileWriter(pathOutput));
            reader = new BufferedReader(new FileReader(pathName));
            while((line = reader.readLine()) != null){
                String[] row = line.split(",");

                for(String i : row){
                    System.out.println("\n" + i);
                    writer.write("\n" + i);
                }
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        finally{
            reader.close();
            writer.close(); //always close
        }
    }
}
/*
Summary:
CSV - comma seperated values
Arrays and ArrayList-data structure
loop-control structure
 */