import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by jonathandavidblack on 6/29/16.
 */
public class Exercise08 {

    public static void main(String[] args) throws FileNotFoundException {
        // parse people.csv into ArrayList<String> that contain first and last names by a space
        //prompt the user for search term
        //print out the names that contain the term
        File f = new File("people.csv");
        Scanner fileScanner = new Scanner(f);
        fileScanner.nextLine();
        ArrayList<String> peopleArrayList = new ArrayList<>();
        while (fileScanner.hasNext()) {
            String[] columns = fileScanner.nextLine().split(",");
            String name = (columns[1] + " " + columns[2]);
            peopleArrayList.add(name);
        }
        //solve via for loop
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Type Search Term");
        String searchTerm = consoleScanner.nextLine();

        for (String name: peopleArrayList) {
            if (name.toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(name);
            }
        }
        System.out.println();
        //solve via stream
        peopleArrayList.stream()
                .filter(name -> name.toLowerCase().contains(searchTerm.toLowerCase()))
                .forEach(System.out::println);

        peopleArrayList = peopleArrayList.stream()
                .filter(name -> name.toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toCollection(ArrayList<String>::new));
        }

}
