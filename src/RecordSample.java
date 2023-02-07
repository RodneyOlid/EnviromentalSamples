public class RecordSample {
    public static void main(String[] args){
        EnviroSamples sample1 = new EnviroSamples();
        sample1.sampleType = "rock";
        sample1.location = "Baltimore County";
        sample1.temperature = 72.5;
        sample1.month = 2;
        sample1.day = 7;
        sample1.year = 2023;
        System.out.println(sample1.temperature);
        EnviroSamples sample2 = new EnviroSamples("Water", "Baltimore Harbor", 62.3, 2, 5, 2023);
        System.out.println(sample2.location);
    }
}
