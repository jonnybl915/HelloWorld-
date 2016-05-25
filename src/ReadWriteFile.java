import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by jonathandavidblack on 5/25/16.
 */
public class ReadWriteFile {

    public static void main(String[] args) throws IOException {
        File f = new File("names.txt");

        FileWriter fw = new FileWriter(f);
        fw.write("Alice\n"); //this will overwrite the file if it exists
        fw.append("Bob\n");
        fw.append("Charlie\n");
        fw.close(); //always remember to close the file

        //read line by line
        Scanner scanner = new Scanner(f);
        while(scanner.hasNext()) { //while there is still something left in the file
            System.out.println(scanner.nextLine());
        }

        //read entire file
        scanner = new Scanner(f);
        scanner.useDelimiter("\\z");
        System.out.println(scanner.next());


    }
}
