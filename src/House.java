/**
 * Created by jonathandavidblack on 5/16/16.
 */
public class House {
    int age;
    String streetName;
    int streetNumber;
    boolean isSingleHouse;
    int numberOfPorches;

    public House (int age, String streetName, int streetNumber, boolean isSingleHouse, int numberOfPorches){ //distinction b/t string as words and as a variable?
        this.age = age;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.isSingleHouse = isSingleHouse;
        this.numberOfPorches = numberOfPorches;
    }
    public int getNumberOfPorches(){
        return numberOfPorches;
    }
    public void setNumberOfPorches(int setNumberOfPorches){
        this.numberOfPorches = setNumberOfPorches;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getStreetName(){
        return streetName;
    }
    public void setStreetName(String streetName){
        this.streetName = streetName;
    }
    public void setIsSingleHouse(boolean isSingleHouse){
        if (numberOfPorches < 2);
        this.isSingleHouse = isSingleHouse;
    }
    public boolean getIsSingleHouse(){
        return isSingleHouse;
    }
    public void setStreetNumber(int streetNumber){
        this.streetNumber = streetNumber;
    }
    public int getStreetNumber(){
        return streetNumber;
    }
}
