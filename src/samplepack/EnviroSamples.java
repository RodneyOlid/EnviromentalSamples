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


