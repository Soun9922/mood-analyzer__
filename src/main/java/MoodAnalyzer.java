public class MoodAnalyzer {
    private final String message;
    public MoodAnalyzer(String message){
        this.message = message;
    }
    public String analyseMood(){
        try {
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";

        } catch (NullPointerException e){
            return "HAPPY";
        }
    }
}
