import java.util.ArrayList;

/**
 * Created by jonathandavidblack on 6/9/16.
 */
public class Exercise05 {
    public static void main(String[] args) {
        String[] names = {"Charlie", "David", "Alice", "Bob", "Albert"};
        //ArrayList<String> sortedNames
        //need an algorithm that loops over names and adds them to a list

        ArrayList<String> sortedNames = new ArrayList<>();
        for(String name : names) {
            int alphaIndex = 0;
            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName) > 0) {
                    alphaIndex++;
                } else {
                    break;
                }

                }
                sortedNames.add(alphaIndex, name);
            }
            System.out.println(sortedNames);
    }
}


//        int alphaIndex = 1;
//
//        String name1 = names[0];
//        String name2 = names[1];
//        String name3 = names[2];
//        String name4 = names[3];
//        String name5 = names[4];
//        alphaIndex = name1.compareTo(name2);
//
//        sortedNames.add(alphaIndex, name1);
//
//
//        System.out.println(sortedNames);




