/**
 * Created by jonathandavidblack on 5/16/16.
 */
public class Coffee {
    String name;
    String countryOfOrigin;
    boolean isTasty;
    double weight;

    public Coffee (String name, String countryOfOrigin, boolean isTasty, double weight) {
        this.name = name;
        this.countryOfOrigin = countryOfOrigin;
        this.isTasty = isTasty;
        this.weight = weight;
    }
    public String getCountryOfOrigin(){
        return countryOfOrigin;
    }
    public void setCountryOfOrigin(String setCountryOfOrigin){
        this.countryOfOrigin = setCountryOfOrigin;
        }
    public void setisTasty(boolean setisTasty){
        this.isTasty = setisTasty;
    }
    public boolean getIsTasty(){
        return isTasty;
    }
    public void setName(String setName){
        if(name.endsWith("Mice"))
        this.name = setName;
    }
    public String getName(){
        return name;
    }
    public void setWeight(double setWeight){
        this.weight = setWeight;
    }
    public double getWeight(){
        return weight;
    }
}
 /* public void setName(String newName) {;
        if (isValidName(newName)) {
            name = newName;

    //alice.getName() //we cant stop here, we need to deposit "allice.getname();" into a String
    String name = alice.getName(); //should output "Alice" when we type name?
// same as String name = alice.name; not necessarily better
*/
