public class EnviroSamples {
    String sampleType;
    String location;
    double temperature;
    int month, day, year;
    String date;
    public EnviroSamples(){

    }
    public EnviroSamples(String myType, String myLocation, double myTemp, int myMonth, int myDay, int myYear){
        this.sampleType = myType;
        this.location = myLocation;
        this.temperature = myTemp;
        this.month = myMonth;
        this.day = myDay;
        this.year = myYear;
    }

}
