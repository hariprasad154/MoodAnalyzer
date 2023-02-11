package Com.bridgeLabs;


public class MoodAnalyzerMain {
    public MoodAnalyzerMain(){
    }

    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}