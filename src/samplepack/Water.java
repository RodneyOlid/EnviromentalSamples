package samplepack;

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
