import java.io.*;

public class FileIOPractice {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Java IO");
        try
        {
            //Create a file writer and open it.
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\BE218\\IdeaProjects\\x\\JavaFile\\Output.txt"));

            //Write to the file using the "writer"
            writer.write("Writing to a file.");
            writer.write("\nHere is another line");
            writer.write("\nThis is a string and on my third line");

            //close the file -- otherwise nothing wil be written to the file.
            writer.close();

            //Tell us that our program wrote to a file
            System.out.println("\n*Successfully wrote in a file*");

        } catch (IOException e) {
            throw new RuntimeException(e); // or e.printStackTrace()
        }

        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\BE218\\IdeaProjects\\x\\JavaFile\\Output.txt"));
            String line;
            while((line = reader.readLine()) != null){
               System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Open a csv file using the split() method on a string
        String path = "\"C:\\Users\\BE218\\IdeaProjects\\x\\JavaFile\\SacramentocrimeJanuary2006.csv.crdownload\"";
        String myFileLine = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));

            while ((myFileLine = reader.readLine()) != null){
                String[] myArray = myFileLine.split(",");
                System.out.println("First item: ");
                System.out.println("Second item: ");
                System.out.println("Third item: ");
                System.out.println("Fourth item: ");
                System.out.println("Fifth item: ");
                System.out.println("Sixth item: ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/*
Summary:
Arrays and ArrayList-data structure
loop-control structure
 */
