public class EnviroSamples {
    String sampleType;
    String location;
    double temperature;
    int month, day, year;
    String date;
    public static int amount = 0;
    public EnviroSamples(){

    }
    public EnviroSamples(String myType, String myLocation, double myTemp, int myMonth, int myDay, int myYear){
        this.sampleType = myType;
        this.location = myLocation;
        this.temperature = myTemp;
        this.month = myMonth;
        this.day = myDay;
        this.year = myYear;
        date = myMonth + "/" + myDay + "/" + myYear;
        amount++;
    }
    @Override
    public String toString(){
        return "The date the sample was collected was " + this.date;
    }

}
