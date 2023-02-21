package samplepack;
public class EnviroSamples {

    private String location;
    public int month, day, year;
    public String date;
    public static int amount = 0;
    public EnviroSamples(){
    }
    public EnviroSamples(String myLocation, int myMonth, int myDay, int myYear){
        this.location = myLocation;
        this.month = myMonth;
        this.day = myDay;
        this.year = myYear;
        date = myMonth + "/" + myDay + "/" + myYear;
        amount++;
    }
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String myLocation) {
        this.location = myLocation;
    }

    public void printMe(){
        System.out.println("Environmental Sample");
    }

    @Override
    public String toString(){
        return "The date the sample was collected was " + this.date;
    }

}
class Rock extends EnviroSamples{
    public String rockType, rockName, rockColor;
    public Rock(){
        super();
    }
    public Rock(String myLocation, int myMonth, int myDay, int myYear, String myType, String myName, String myColor){
        super(myLocation, myMonth, myDay, myYear);
        this.rockType = myType;
        this.rockName = myName;
        this.rockColor = myColor;
    }
    public void printMe(){
        System.out.println("Rock Sample");
    }

}
class Water extends EnviroSamples{
    public double waterTemp;
    public String waterSource;
    public Water(){
        super();
    }
    public Water(String myLocation, int myMonth, int myDay, int myYear, double myTemp, String mySource){
        super(myLocation, myMonth, myDay, myYear);
        waterTemp = myTemp;
        waterSource = mySource;
    }
    public void printMe(){
        System.out.println("Water Sample");
    }
}
class Soil extends EnviroSamples{
    public String soilType, soilColor;
    public double soilWeight;
    public Soil(){
        super();
    }
    public Soil(String myLocation, int myMonth, int myDay, int myYear, String myType, String myColor, double myWeight){
        super(myLocation, myMonth, myDay, myYear);
        soilType = myType;
        soilColor = myColor;
        soilWeight = myWeight;
    }
    public void printMe(){
        System.out.println("Soil Sample");
    }
}