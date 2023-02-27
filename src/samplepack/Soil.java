package samplepack;
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