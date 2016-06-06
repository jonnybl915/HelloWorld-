import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by jonathandavidblack on 6/6/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String [] names = {"alice", "bob", "charlie", "andrew", "edward"};

        // 1. go from that to an ArrayList of strings that contains the names with only capital letters
        // 2. filter out names that don't start with A.
        // --["ALICE", "ANDREW"]
        ArrayList<String> capNames = new ArrayList<>();
        for (String name: names){
            capNames.add(name.toUpperCase());
        }
        for (int i = 0; i < capNames.size(); i++){
            String name = capNames.get(i);
            if (!name.startsWith("A")){
                capNames.remove(name);
            }
        }

        //Solution 2. use temporary collections

        capNames = new ArrayList<>();
        for (String name: names) {
            capNames.add(name.toUpperCase());
        }
//        ArrayList<String> tempNames = new ArrayList<>(){
//            for(String name : capNames)
//        };

        //solution 3
        capNames = new ArrayList<>();
        for (String name : names){
            capNames.add(name.toUpperCase());
        }
        Iterator<String> iter = capNames.iterator();
        while (iter.hasNext()){
            String name = iter.next();
            if (!name.startsWith("A")){
                iter.remove();
            }
        }


        //solution 4: use a stream; indirect modification.
        capNames = new ArrayList<>();
        for (String name : names) {
            capNames.add(name);
        }
        capNames = capNames.stream()
                .map((name) -> {
                    return name.toUpperCase();
                })
                .filter((name) ->{
                    return name.startsWith("A");
                })
                .collect(Collectors.toCollection(ArrayList<String>::new)); //instructing the stream to give us back a new arraylist
        System.out.println(capNames);
    }
}
