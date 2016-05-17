/**
 * Created by jonathandavidblack on 5/16/16.
 */
public class Person {
    static int familySize = (10);
    String name;
    int age;
    boolean isAlive;
    Person[] family = new Person[familySize];

    //typically the constructor is housed under this and above the rest
    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

//writing own methods
    public String getName() {
        return name;

    }
    public void setName(String newName) {;
        if (isValidName(newName)) {
            name = newName;
        }
     /* also could be:
    public void setName(String name){
    this.name = name;
    }
      */
    }
    public int getAge(){ //getters dont take any arguments
         return age;
    }
    public void setAge(int newAge) {
        age = newAge;
    }
    public boolean getIsAlive() {
        return isAlive;
    }
    public void setIsAlive(boolean newIsAlive) {
        isAlive = newIsAlive;
    }
    public static boolean isValidName(String newName) {
        return newName.contains(" ");
    }

    //Now getting into static methods!!

}

