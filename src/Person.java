import java.util.Arrays;

/**
 * Created by jonathandavidblack on 5/16/16.
 */
public class Person implements Comparable<Person> {
    static final int familySize = (10); //final means you CANNOT change family size
    String name;
    int age;
    boolean isAlive;
    Person[] family = new Person[familySize];

    public Person(){  //an example of the empty constructor that java provides when we don't have one


    }

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
        //if (isValidName(newName)) {
            name = newName;
       // }
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isAlive=" + isAlive +
                ", family=" + Arrays.toString(family) +
                '}';
    }

    @Override
    public int compareTo(Person otherPerson) {
        //Person otherPerson = (Person) o; //casting as a person object
        //we don't need to cast when we have the angle brackets up top "Implements<Person>"
        return this.name.compareTo(otherPerson.name);
    }
}

