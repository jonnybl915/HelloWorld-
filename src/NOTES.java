/**
 * Created by jonathandavidblack on 5/18/16.
 */
/*public class NOTES {
}
    Person alice = new Person("Alice", 30, true);
/*alice.name = "Alice";
alice.isAlive = true;
alice.age = 30;
*/
/*Person frank = new Person();
frank.name = "Frank";
frank.age = 25;
frank.isAlive = true;


    Email e1 = new Email(alice, "Hello","world is my oyster","jdblack@g.cofc.edu", 0); //what is after the = is a Constructor
/*e1.subject = "Hello";
e1.body = "world is my oyster";
e1.destination = "jdblack@g.cofc.edu";
e1.author = alice;*/
//now the above text is not necessary

//    Email e2 = new Email("My name", "What's up","jonnybl915@gmail.com");
/*e2.subject = "My name";
e2.body = "What's up";
e2.destination = "jonnybl915@gmail.com"; //default integer value is 0 when undefined
e2.author = frank;*/
//constructors allow for the cleaning of code and so we won't be able to forget to set anything

//    Email[] emails = new Email[10];
//emails[0] = e1;
//        emails[1] = e2;
//CONSTRUCTORS -

//e1.author.name
//e2.author.age
/*
String height = "70"; //can store numbers in strings but the mathematical use is extremely restricted as demostrated here
//int height = 70;
height += 1

//alice.getName() //we cant stop here, we need to deposit "allice.getname();" into a String
String name = alice.getName(); //should output "Alice" when we type name?
// same as String name = alice.name; not necessarily better
*/
/*        alice.setName("Bob Martin"); //returns nothing bc we have tried to return a void method
        alice.setAge(40);
        alice.getAge();
        alice.setIsAlive(false);
        alice.getIsAlive();
        alice.getName();
        alice.isValidName("Hello World");
        Person.isValidName("Hello");//class name itself, because it is now static

        Math.abs(-104); //Math is an entire class and it is a static method, thus we don't have to call an object
        Math.max(10, 45); //could write an if statement but this is much cleaner
        Math.min(100, 1000);

        Person.familySize; //contained in the "global class" PERSON

        Car chevy = new Car("Chevrolet", "Taho", 1993, true);
        chevy.getMake();
        chevy.setMake("Chevy");
        chevy.getMake();

        Novel tequilaMockingBird = new Novel(2020, "whoever", "scify", true, 200, false);
        tequilaMockingBird.getNumberOfPages();
        tequilaMockingBird.haveRead

        Pool bigBoy = new Pool(25, 50.0, true);
        bigBoy.getDepth();
        bigBoy.setDepth(30);
        bigBoy.getDepth();
        bigBoy.setDepth(45);
        bigBoy.getDepth();

// bigBoy.getIsAboveGround();
        Coffee homeBrew =new Coffee("Medium Roast", "Equador", true, 33.5);
        homeBrew.getIsTasty();
        homeBrew.setisTasty(false);
        homeBrew.getIsTasty();

        House welcomeToMy = new House(150, "Princess", 17, true, 2);
        welcomeToMy.getIsSingleHouse();
//welcomeToMy.getStreetName();
//welcomeToMy.getStreetNumber();
        welcomeToMy.getNumberOfPorches();
        welcomeToMy.setNumberOfPorches(1);
        welcomeToMy.getIsSingleHouse();

/* public void setName(String setName){
        if(name.endsWith("Ice"))
        this.name = setName;
    }*/

  /*      Coffee sumatra = new Coffee("Bold as Ice", "Brazil", false, 25);
        sumatra.countryOfOrigin
        sumatra.name
        sumatra.isTasty
        sumatra.setisTasty(true);
        sumatra.getIsTasty();
//String name = sumatra.getName();
//name

        String sentence = "To be or not to be, that is the question.";
        sentence.charAt(0) //needs integer number that correlates to the character num
        boolean hasBE = sentence.contains("Be") //capturing the value into a variable
        boolean isShakespeare = sentence.equals("To be or not to be, that is the question.")
        int location = sentence.indexOf("Be")
        String[] words = sentence.split(" ")
        hasBE
        isShakespeare
        location
        words [2] = "and";
        String.copyValueOf ()
        int.annotation
//adding behavior into our classes and variables

//5.17.2016

//beginning of day
//Person.familySize = 0;
//Person.p = new Person(); //error bc we're trying to change a 'FINAL' field
        System.out.println("Hello World!"); //built in static fields within the System class. System.out is the standard out for Java
//this is not
        System.out.print("Hello World!");
      //System.out.print("Hello world!"*/