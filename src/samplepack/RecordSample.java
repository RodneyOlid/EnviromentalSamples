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
        System.out.println(EnviroSamples.amount);

        basicSamples[0] = sample1;
        Water sample2 = new Water("Baltimore Harbor", 1, 12, 2023, 54.2, "Chesapeake Bay");
        waterSamples[0] = sample2;
        System.out.println(EnviroSamples.amount);

        Rock sample3 = new Rock("Delaware", 3, 21, 2022, "Igneous", "Granite", "Grey");
        rockSamples[0] = sample3;
        System.out.println(EnviroSamples.amount);

        Soil sample4 = new Soil("D.C.", 2, 14, 2023, "Clay", "red", 12);
        soilSamples[0] = sample4;
        System.out.println(EnviroSamples.amount);

        sample1.printInfo();
        System.out.println();
        sample2.printInfo();
        System.out.println();
        sample3.printInfo();
        System.out.println();
        sample4.printInfo();
        System.out.println(EnviroSamples.amount);

        //        EnviroSamples sample1 = new EnviroSamples();
//        sample1.setLocation("Baltimore");
//        sample1.month = 2;
//        sample1.day = 7;
//        sample1.year = 2023;
//        /* sample 2 */
//        EnviroSamples sample2 = new EnviroSamples("Baltimore Harbor", 2, 5, 2023);
//        System.out.println(sample2.date);
//        System.out.println(EnviroSamples.amount);
//        System.out.println(sample1.getLocation());
//        System.out.println(sample2.toString());
//        /* rock sample */
//        Rock sample3 = new Rock("Delaware", 3, 21, 2022, "Igneous", "Granite", "Grey");
//        System.out.println(sample3.rockType);
//        /* water sample */
//        Water sample4 = new Water("Baltimore Harbor", 1, 12, 2023, 54.2, "Chesapeake Bay");
//        System.out.println(sample4.waterSource);
//        /* soil sample */
//        Soil sample5 = new Soil("D.C.", 2, 14, 2023, "Clay", "red", 12);
//        System.out.println(sample5.soilWeight + " grams");
//        /* rock sample 2 */
//        EnviroSamples sample6 = new Rock("Michigan", 2, 2, 2020, "Igneous", "Limestone", "Yellow");
//        System.out.println(sample6.getLocation());
//        EnviroSamples sample7 = new EnviroSamples("Baltimore Harbor", 2, 5, 2023);
//        System.out.println(EnviroSamples.amount);
//        sample2.printMe();

    }
}
