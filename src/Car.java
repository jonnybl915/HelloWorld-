/**
 * Created by jonathandavidblack on 5/16/16.
 */
public class Car {
    String make;
    String model;
    int year;
    boolean stillRuns;

    public Car (String make, String model, int year, boolean stillRuns) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.stillRuns = stillRuns;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String setMake){
        this.make = setMake;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String setModel){
        this.model = setModel;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int setYear) {;
        if(year > 1950)
        year = setYear;
    }
    public boolean getStillRuns(){
        return stillRuns;
    }
    public void setStillRuns(boolean setStillruns){
        this.stillRuns = setStillruns;
    }
}
/*public void setName(String newName) {;
if (isValidName(newName)) {
        name = newName;
        }*/