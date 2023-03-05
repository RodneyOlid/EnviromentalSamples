package samplepack;
public class RecordSample {
    public static Rock[] rockSamples  = new Rock[5];
    public static Water[] waterSamples = new Water[5];
    public static Soil[] soilSamples = new Soil[5];
    public static EnviroSamples[] basicSamples = new EnviroSamples[5];

    public static void main(String[] args){
        EnviroSamples sample1 = new EnviroSamples();
        sample1.setLocation("Baltimore Harbor");
        sample1.day = 5;
        sample1.month = 2;
        sample1.year = 2023;
        sample1.date = "2/5/2023";

        basicSamples[0] = sample1;
        Water sample2 = new Water("Baltimore Harbor", 1, 12, 2023, 54.2, "Chesapeake Bay");
        waterSamples[0] = sample2;

        Rock sample3 = new Rock("Delaware", 3, 21, 2022, "Igneous", "Granite", "Grey");
        rockSamples[0] = sample3;

        Soil sample4 = new Soil("D.C.", 2, 14, 2023, "Clay", "red", 12);
        soilSamples[0] = sample4;

        sample1.printInfo();
        System.out.println();
        sample2.printInfo();
        System.out.println();
        sample3.printInfo();
        System.out.println();
        sample4.printInfo();
        System.out.println("You have recorded " + EnviroSamples.amount + " different samples.");


    }
}
