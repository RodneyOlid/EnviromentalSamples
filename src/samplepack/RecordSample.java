package samplepack;
public class RecordSample {
    public static void main(String[] args){
        EnviroSamples sample1 = new EnviroSamples();
        sample1.setLocation("Baltimore");
        sample1.month = 2;
        sample1.day = 7;
        sample1.year = 2023;
        EnviroSamples sample2 = new EnviroSamples("Baltimore Harbor", 2, 5, 2023);
        System.out.println(sample2.date);
        System.out.println(EnviroSamples.amount);
        System.out.println(sample1.getLocation());
        System.out.println(sample2.toString());
        Rock sample3 = new Rock("Delaware", 3, 21, 2022, "Igneous", "Granite", "Grey");
        System.out.println(sample3.rockType);
        Water sample4 = new Water("Baltimore Harbor", 1, 12, 2023, 54.2, "Chesapeake Bay");
        System.out.println(sample4.waterSource);
        Soil sample5 = new Soil("D.C.", 2, 14, 2023, "Clay", "red", 12);
        System.out.println(sample5.soilWeight + " grams");
    }
}
