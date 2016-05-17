/**
 * Created by jonathandavidblack on 5/16/16.
 */
public class House {
    int age;
    String streetName;
    int streetNumber;
    boolean isSingleHouse;

    public House (int age, String streetName, int streetNumber, boolean isSingleHouse){ //distinction b/t string as words and as a variable?
        this.age = age;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.isSingleHouse = isSingleHouse;
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
        if (age >100);
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
