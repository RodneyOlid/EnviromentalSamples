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
        return location;
    }

    public void setLocation(String myLocation) {
        this.location = myLocation;
    }

    @Override
    public String toString(){
        return "The date the sample was collected was " + this.date;
    }

}
class Rock extends EnviroSamples{
    String rockType, rockName, rockColor;
    public Rock(){
        super();
    }
    public Rock(String myLocation, int myMonth, int myDay, int myYear, String myType, String myName, String myColor){
        super(myLocation, myMonth, myDay, myYear);
        this.rockType = myType;
        this.rockName = myName;
        this.rockColor = myColor;
    }
}
class Water extends EnviroSamples{
    double waterTemp;
    String waterSource;
    public Water(){
        super();
    }
    public Water(String myLocation, int myMonth, int myDay, int myYear, double myTemp, String mySource){
        super(myLocation, myMonth, myDay, myYear);
        waterTemp = myTemp;
        waterSource = mySource;
    }
}
class Soil extends EnviroSamples{
    String soilType, soilColor;
    double soilWeight;
    public Soil(){
        super();
    }
    public Soil(String myLocation, int myMonth, int myDay, int myYear, String myType, String myColor, double myWeight){
        super(myLocation, myMonth, myDay, myYear);
        soilType = myType;
        soilColor = myColor;
        soilWeight = myWeight;
    }
}